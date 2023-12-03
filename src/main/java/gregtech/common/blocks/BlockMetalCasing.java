package gregtech.common.blocks;

import gregtech.api.block.IStateHarvestLevel;
import gregtech.api.block.VariantBlock;
import gregtech.api.items.toolitem.ToolClasses;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

public class BlockMetalCasing extends VariantBlock<BlockMetalCasing.MetalCasingType> {

    public BlockMetalCasing() {
        super(Material.IRON);
        setTranslationKey("metal_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(MetalCasingType.BRONZE_BRICKS));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull SpawnPlacementType type) {
        return false;
    }

    public enum MetalCasingType implements IStringSerializable, IStateHarvestLevel {

        BRONZE_BRICKS("bronze_bricks", 1),
        PRIMITIVE_BRICKS("primitive_bricks", 1),
        INVAR_HEATPROOF("invar_heatproof", 1),
        ALUMINIUM_FROSTPROOF("aluminium_frostproof", 1),
        STEEL_SOLID("steel_solid", 2),
        STAINLESS_CLEAN("stainless_clean", 2),
        TITANIUM_STABLE("titanium_stable", 2),
        TUNGSTENSTEEL_ROBUST("tungstensteel_robust", 3),
        COKE_BRICKS("coke_bricks", 1),
        PTFE_INERT_CASING("ptfe_inert", 0),
        HSSE_STURDY("hsse_sturdy", 3),
        PALLADIUM_SUBSTATION("palladium_substation", 3),
        ELEMENTAL_CASING("elemental_casing", 4), //new addition
        HIGH_PERFORMANCE_SUPERCAUSAL_CASING("high_performance_supercausal_casing", 4), //new addition
        QUANTUM_STABLIZER_CASING("quantum_stablizer_casing", 4), //new addition
        THE_ULTIMATE_FUCKER("the_ultimate_fucker", 4); //new addition

        private final String name;
        private final int harvestLevel;

        MetalCasingType(String name, int harvestLevel) {
            this.name = name;
            this.harvestLevel = harvestLevel;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public int getHarvestLevel(IBlockState state) {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool(IBlockState state) {
            return ToolClasses.WRENCH;
        }
    }
}
