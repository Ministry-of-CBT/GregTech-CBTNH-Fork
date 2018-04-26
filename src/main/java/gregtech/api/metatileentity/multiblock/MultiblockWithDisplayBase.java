package gregtech.api.metatileentity.multiblock;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.ModularUI;
import gregtech.api.gui.widgets.AdvancedTextWidget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

import java.util.List;

public abstract class MultiblockWithDisplayBase extends MultiblockControllerBase {

    public MultiblockWithDisplayBase(String metaTileEntityId) {
        super(metaTileEntityId);
    }

    /**
     * Called serverside to obtain text displayed in GUI
     * each element of list is displayed on new line
     * to use translation, use TextComponentTranslation
     */
    protected void addDisplayText(List<ITextComponent> textList) {
        if(!isStructureFormed()) {
            textList.add(new TextComponentTranslation("gregtech.multiblock.invalid_structure"));
        } else if(!validationPredicate.getAsBoolean()) {
            textList.add(new TextComponentTranslation("gregtech.multiblock.validation_failed"));
        }
    }

    protected boolean shouldBindInventory() {
        return true;
    }

    protected ModularUI.Builder createUITemplate(EntityPlayer entityPlayer) {
        boolean shouldBindInventory = shouldBindInventory();
        ModularUI.Builder builder = shouldBindInventory ? ModularUI.defaultBuilder() : ModularUI.cutBuilder();
        builder.image(7, 4, 162, 75, GuiTextures.DISPLAY);
        builder.label(10, 7, getMetaName(), 0xFFFFFF);
        builder.widget(new AdvancedTextWidget(10, 17, this::addDisplayText, 0xFFFFFF));
        if(shouldBindInventory)
            builder.bindPlayerInventory(entityPlayer.inventory);
        return builder;
    }

    @Override
    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return createUITemplate(entityPlayer).build(getHolder(), entityPlayer);
    }

}
