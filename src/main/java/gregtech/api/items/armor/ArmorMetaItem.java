package gregtech.api.items.armor;

import com.google.common.base.Preconditions;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.stats.IEnchantabilityHelper;
import gregtech.api.items.metaitem.stats.IItemComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ArmorMetaItem<T extends ArmorMetaItem<?>.ArmorMetaValueItem> extends MetaItem<T> implements IArmorItem, ISpecialArmor, IEnchantabilityHelper {

    public ArmorMetaItem() {
        super((short) 0);
        setCreativeTab(GregTechAPI.TAB_GREGTECH_TOOLS);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected T constructMetaValueItem(short metaValue, String unlocalizedName) {
        return (T) new ArmorMetaValueItem(metaValue, unlocalizedName);
    }

    @Nonnull
    private IArmorLogic getArmorLogic(ItemStack itemStack) {
        T metaValueItem = getItem(itemStack);
        return metaValueItem == null ? new DummyArmorLogic() : metaValueItem.getArmorLogic();
    }

    // todo
    // todo Definition: done
    // todo Item: todo
    // todo
    @Override
    public ArmorProperties getProperties(EntityLivingBase player, @Nonnull ItemStack armor, DamageSource source, double damage, int slot) {
        IArmorLogic armorLogic = getArmorLogic(armor);
        if (armorLogic instanceof ISpecialArmorLogic) {
            return ((ISpecialArmorLogic) armorLogic).getProperties(player, armor, source, damage, getSlotByIndex(slot));
        }
        return new ArmorProperties(0, 0, Integer.MAX_VALUE);
    }

    // todo
    // todo Definition: done
    // todo Item: todo
    // todo
    @Override
    public int getArmorDisplay(EntityPlayer player, @Nonnull ItemStack armor, int slot) {
        IArmorLogic armorLogic = getArmorLogic(armor);
        if (armorLogic instanceof ISpecialArmorLogic) {
            return ((ISpecialArmorLogic) armorLogic).getArmorDisplay(player, armor, slot);
        }
        return 0;
    }

    // todo
    // todo Definition: nothing needed?
    // todo Item: todo
    // todo
    @Override
    public void damageArmor(EntityLivingBase entity, @Nonnull ItemStack stack, DamageSource source, int damage, int slot) {
        IArmorLogic armorLogic = getArmorLogic(stack);
        armorLogic.damageArmor(entity, stack, source, damage, getSlotByIndex(slot));
    }

    // todo
    // todo Definition: done
    // todo Item: done
    // todo
    @Override
    public boolean handleUnblockableDamage(EntityLivingBase entity, @Nonnull ItemStack armor, DamageSource source, double damage, int slot) {
        IArmorLogic armorLogic = getArmorLogic(armor);
        if (armorLogic instanceof ISpecialArmorLogic) {
            return ((ISpecialArmorLogic) armorLogic).handleUnblockableDamage(entity, armor, source, damage, getSlotByIndex(slot));
        }
        return false;
    }

    // todo
    // todo Definition: done
    // todo Item: done
    // todo
    @Override
    public void onArmorTick(@Nonnull World world, @Nonnull EntityPlayer player, @Nonnull ItemStack itemStack) {
        IArmorLogic armorLogic = getArmorLogic(itemStack);
        armorLogic.onArmorTick(world, player, itemStack);
    }

    // todo not needed since we now extend ItemArmor
    @Override
    public boolean isValidArmor(@Nonnull ItemStack stack, @Nonnull EntityEquipmentSlot armorType, @Nonnull Entity entity) {
        IArmorLogic armorLogic = getArmorLogic(stack);
        return super.isValidArmor(stack, armorType, entity) &&
                armorLogic.isValidArmor(stack, entity, armorType);
    }

    // todo not needed since we now extend ItemArmor
    @Nullable
    @Override
    public EntityEquipmentSlot getEquipmentSlot(@Nonnull ItemStack stack) {
        IArmorLogic armorLogic = getArmorLogic(stack);
        return armorLogic.getEquipmentSlot(stack);
    }

    // todo Need to get this onto the Definition somehow
    @Nullable
    @Override
    public String getArmorTexture(@Nonnull ItemStack stack, @Nonnull Entity entity, @Nonnull EntityEquipmentSlot slot, @Nonnull String type) {
        IArmorLogic armorLogic = getArmorLogic(stack);
        return armorLogic.getArmorTexture(stack, entity, slot, type);
    }

    private static EntityEquipmentSlot getSlotByIndex(int index) {
        switch (index) {
            case 0:
                return EntityEquipmentSlot.FEET;
            case 1:
                return EntityEquipmentSlot.LEGS;
            case 2:
                return EntityEquipmentSlot.CHEST;
            default:
                return EntityEquipmentSlot.HEAD;
        }
    }

    public class ArmorMetaValueItem extends MetaValueItem {

        private IArmorLogic armorLogic = new DummyArmorLogic();

        protected ArmorMetaValueItem(int metaValue, String unlocalizedName) {
            super(metaValue, unlocalizedName);
            setMaxStackSize(1);
        }

        @Nonnull
        public IArmorLogic getArmorLogic() {
            return armorLogic;
        }

        public ArmorMetaValueItem setArmorLogic(IArmorLogic armorLogic) {
            Preconditions.checkNotNull(armorLogic, "Cannot set ArmorLogic to null");
            this.armorLogic = armorLogic;
            this.armorLogic.addToolComponents(this);
            return this;
        }


        @Override
        public ArmorMetaValueItem addComponents(IItemComponent... stats) {
            super.addComponents(stats);
            return this;
        }

        @Override
        public ArmorMetaValueItem setModelAmount(int modelAmount) {
            return (ArmorMetaValueItem) super.setModelAmount(modelAmount);
        }

        @Override
        public ArmorMetaValueItem setRarity(EnumRarity rarity) {
            return (ArmorMetaValueItem) super.setRarity(rarity);
        }
    }

    @Override
    public boolean isEnchantable(@Nonnull ItemStack stack) {
        return true;
    }

    @Override
    public int getItemEnchantability(@Nonnull ItemStack stack) {
        return 50;
    }

    @Override
    public boolean canApplyAtEnchantingTable(@Nonnull ItemStack stack, @Nonnull Enchantment enchantment) {
        EntityEquipmentSlot slot = this.getEquipmentSlot(stack);
        if (slot == null || enchantment.type == null) {
            return false;
        }

        IArmorLogic armorLogic = getArmorLogic(stack);
        if (!armorLogic.canBreakWithDamage(stack) && enchantment.type == EnumEnchantmentType.BREAKABLE) {
            return false;
        }

        switch (slot) {
            case HEAD:
                return enchantment.type.canEnchantItem(Items.DIAMOND_HELMET);
            case CHEST:
                return enchantment.type.canEnchantItem(Items.DIAMOND_CHESTPLATE);
            case LEGS:
                return enchantment.type.canEnchantItem(Items.DIAMOND_LEGGINGS);
            case FEET:
                return enchantment.type.canEnchantItem(Items.DIAMOND_BOOTS);
            default:
                return enchantment.isAllowedOnBooks();
        }
    }

}
