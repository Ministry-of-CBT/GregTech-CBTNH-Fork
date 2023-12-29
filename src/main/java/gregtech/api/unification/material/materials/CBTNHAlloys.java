package gregtech.api.unification.material.materials;

import gregtech.api.GTValues;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.FluidState;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class CBTNHAlloys {
    public static void register() {
        AntiPolytetrafluoroetylene = new Material.Builder(8000, gregtechId("antipolytetrafluoroethylene"))
                .polymer(1)
                .liquid(new FluidBuilder().temperature(600))
                .color(0x646464)
                .flags(STD_METAL, GENERATE_FRAME, GENERATE_FOIL)
                .components(AntiCarbon, 2, AntiFluorine, 4)
                .fluidPipeProperties(600, 100, true, true, false, false)
                .build();
    }
}
