package gregtech.api.unification.material.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.Elements;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class CBTNHElements {
    public static void register() {
        //here
        Susanium = new Material.Builder(6000, gregtechId("susanium"))
                .ingot().liquid(new FluidBuilder().temperature(1))
                .plasma()
                .color(0x60D82A).iconSet(METALLIC)
                .element(Elements.ElementSusanium)
                .build();
        Dylantrum = new Material.Builder(6001, gregtechId("dylantrum"))
                .element(Elements.ElementDylantrum)
                .ingot(6)
                .iconSet(METALLIC) // iconset
                .color(0xE54D4D)
                .cableProperties(1572864, 1, 16, false) // add cables
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME)
                .build();
        Agrastium = new Material.Builder(6002, gregtechId("agrastium"))
                .element(Elements.ElementAgrastium)
                .ingot(6)
                .iconSet(METALLIC) // iconset
                .color(0xCA2245)
                .flags(GENERATE_PLATE)
                .build();
        Ruslyium = new Material.Builder(6003, gregtechId("ruslyium"))
                .element(Elements.ElementRuslyium)
                .ingot(6)
                .iconSet(METALLIC) // iconset
                .color(0x407DB0)
                .flags(GENERATE_PLATE, GENERATE_FRAME, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .itemPipeProperties(1, 32f).build();
        Schrabidium = new Material.Builder(6004, gregtechId("schrabidium"))
                .element(Elements.ElementSchrabidium)
                .ingot(7)
                .iconSet(SHINY) // iconset
                .color(0x64C2B9)
                .toolStats(new ToolProperty(10, 3, 256, 21)) // temporary stat
                .rotorStats(10, 2, 1000)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_RING, GENERATE_SMALL_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .cableProperties(2097152, 16, 0, true) // add cables
                .build();
        Solinium = new Material.Builder(6005, gregtechId("solinium"))
                .element(Elements.ElementSolinium)
                .ingot(6)
                .iconSet(DULL) // iconset
                .color(0x64C2B9)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .build();
        Veridium = new Material.Builder(6006, gregtechId("Veridium"))
                .element(Elements.ElementVeridium)
                .ingot(6)
                .iconSet(QUARTZ) // iconset
                .color(0xB1F430)
                .fluidPipeProperties(20000, 200, true, true, true, true)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_RING, GENERATE_SMALL_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .build();
        Lunarium = new Material.Builder(6007, gregtechId("lunarium"))
                .element(Elements.ElementLunarium)
                .ingot(6)
                .iconSet(CERTUS) // iconset
                .color(0x3283A8)
                .flags(GENERATE_PLATE, GENERATE_ROD)
                .build();
        Etherium = new Material.Builder(6008, gregtechId("etherium"))
                .element(Elements.ElementEtherium)
                .ingot(6)
                .iconSet(BRIGHT) // iconset
                .color(0xA7453A)
                .flags(GENERATE_PLATE)
                .build();
        Xenynium = new Material.Builder(6009, gregtechId("xenynium"))
                .element(Elements.ElementXenynium)
                .ingot(6)
                .iconSet(BRIGHT) // iconset
                .flags(GENERATE_PLATE, GENERATE_FRAME, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .color(0xC7B142)
                .fluidPipeProperties(21000, 200, true, true, true, true)
                .build();
        Neptupitrium = new Material.Builder(6010, gregtechId("neptupitrium"))
        		.element(Elements.ElementNeptupitrium)
                .ingot(6)
                .iconSet(GEM_HORIZONTAL) // iconset
                .color(0x54BBC2)
                .cableProperties(1572864, 4, 16, false) // add cables
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .build();
        Solimonium = new Material.Builder(6011, gregtechId("Solimonium"))
                .element(Elements.ElementSolimonium)
                .ingot(6)
                .iconSet(ROUGH) // iconset
                .color(0x62697B)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .toolStats(new ToolProperty(20, 11, 2044, 6))
                .build();
    }
}

