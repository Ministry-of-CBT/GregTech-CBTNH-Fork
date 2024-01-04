package gregtech.api.unification.material.materials;

// import gregtech.api.GTValues;
import gregtech.api.fluids.FluidBuilder;
// import gregtech.api.fluids.FluidState;
// import gregtech.api.fluids.attribute.FluidAttributes;
// import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.Elements;
import gregtech.api.unification.material.Material;
// import gregtech.api.unification.material.properties.BlastProperty.GasTier;
// import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;
// CBTNH Elements
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
        Aetherium = new Material.Builder(6012, gregtechId("aetherium"))
                .element(Elements.ElementAetherium)
                .ingot(6)
                .iconSet(OPAL) // iconset
                .color(0xA18BC3)
                .toolStats(new ToolProperty(20, 14, 2532, 4))
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE)
                .build();
        Quasarium = new Material.Builder(6013, gregtechId("quasarium"))
                .element(Elements.ElementQuasarium)
                .ingot()
                .iconSet(NETHERSTAR) // iconset
                .color(0xFFDD03)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE)
                .build();
        Laranium = new Material.Builder(6014, gregtechId("laranium"))
                .element(Elements.ElementLaranium)
                .ingot()
                .iconSet(CERTUS) // iconset
                .color(0x9CB3A4)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE)
                .build();
        Pyranium = new Material.Builder(6015, gregtechId("pyranium"))
                .element(Elements.ElementPyranium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0xACBCDC)
                .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FRAME)
                .build();
        Silisimmunium = new Material.Builder(6016, gregtechId("silisimmunium"))
                .element(Elements.ElementSilisimmunium)
                .ingot()
                .iconSet(METALLIC) // iconset
                .color(0xD2CA64)
                .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FRAME)
                .build();
        Ryneurassium = new Material.Builder(6017, gregtechId("ryneurassium"))
                .element(Elements.ElementRyneurassium)
                .ingot()
                .iconSet(BRIGHT) // iconset
                .color(0xCA84B3)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE)
                .build();
        Supractinium = new Material.Builder(6018, gregtechId("supractinium"))
                .element(Elements.ElementSupractinium)
                .ingot()
                .iconSet(DULL) // iconset
                .color(0x2AC6B4)
                .flags(EXPLOSIVE)
                .build();
        Puthanium = new Material.Builder(6019, gregtechId("puthanium"))
                .element(Elements.ElementPuthanium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0x5CA444)
                .build();
        Coslynium = new Material.Builder(6020, gregtechId("coslynium"))
                .element(Elements.ElementCoslynium)
                .ingot()
                .iconSet(METALLIC) // iconset
                .color(0x23A9C1)
                .build();
        Yrattasium = new Material.Builder(6021, gregtechId("yrattasium"))
                .element(Elements.ElementYrattasium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0xF0A322)
                .build();
        Runevaline = new Material.Builder(6022, gregtechId("runevaline"))
                .element(Elements.ElementRunevaline)
                .ingot()
                .iconSet(FINE) // iconset
                .color(0xCA3BAA)
                .build();
        Neoveline = new Material.Builder(6023, gregtechId("neoveline"))
                .element(Elements.ElementNeoveline)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0x44ACA8)
                .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FRAME)
                .build();
        Cesarium = new Material.Builder(6024, gregtechId("cesarium"))
                .element(Elements.ElementCesarium)
                .ingot()
                .iconSet(LIGNITE) // iconset
                .color(0x4D3AC2)
                .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FRAME)
                .build();
        Quannasarium = new Material.Builder(6025, gregtechId("quannasarium"))
                .element(Elements.ElementQuannasarium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0xAC1111)
                .build();
        Jadynomium = new Material.Builder(6026, gregtechId("jadynomium"))
                .element(Elements.ElementJadynomium)
                .ingot()
                .iconSet(GEM_VERTICAL) // iconset
                .color(0xA4D305)
                .build();
        Jaumium = new Material.Builder(6027, gregtechId("jaumium"))
                .element(Elements.ElementJaumium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0x04D0A3)
                .build();
        Euronium = new Material.Builder(6028, gregtechId("euronium"))
        		.element(Elements.ElementEuronium)
                .ingot()
                .iconSet(DULL) // iconset
                .color(0xAC2201)
                .build();
        Dimosonium = new Material.Builder(6029, gregtechId("dimosonium"))
                .element(Elements.ElementDimosonium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0x04D0A3)
                .build();
        Krassium = new Material.Builder(6030, gregtechId("krassium"))
                .element(Elements.ElementKrassium)
                .ingot()
                .iconSet(METALLIC) // iconset
                .color(0xC2A943)
                .build();
        Dithermonium = new Material.Builder(6031, gregtechId("dithermonium"))
                .element(Elements.ElementDithermonium)
                .ingot()
                .iconSet(GEM_VERTICAL) // iconset
                .color(0x944C3A)
                .build();
        Prassoppurium = new Material.Builder(6032, gregtechId("prassoppurium"))
                .element(Elements.ElementPrassoppurium)
                .ingot()
                .iconSet(GEM_HORIZONTAL) // iconset
                .color(0x7CBBA3)
                .build();
        Sunatrium = new Material.Builder(6033, gregtechId("sunatrium"))
                .element(Elements.ElementSunatrium)
                .ingot()
                .iconSet(LIGNITE) // iconset
                .color(0xAC3300)
                .build();
        Bralyium = new Material.Builder(6034, gregtechId("bralyium"))
                .element(Elements.ElementBralyium)
                .ingot()
                .iconSet(METALLIC) // iconset
                .color(0xC21190)
                .build();
        Quintessium = new Material.Builder(6035, gregtechId("quintessium"))
                .element(Elements.ElementQuintessium)
                .ingot()
                .iconSet(METALLIC) // iconset
                .color(0x74C833)
                .build();
        Zephyrion = new Material.Builder(6036, gregtechId("zephyrion"))
                .element(Elements.ElementZephyrion)
                .ingot()
                .iconSet(SHINY) // iconset
                .color(0x68CA73)
                .build();
        Chronotite = new Material.Builder(6037, gregtechId("chronotite"))
                .element(Elements.ElementChronotite)
                .ingot()
                .iconSet(SHINY) // iconset
                .color(0xACD023)
                .build();
        Luminarite = new Material.Builder(6038, gregtechId("luminarite"))
                .element(Elements.ElementLuminarite)
                .ingot()
                .iconSet(SHINY) // iconset
                .color(0xDCAA40)
                .build();
        Pyrocore = new Material.Builder(6039, gregtechId("pyrocore"))
                .element(Elements.ElementPyrocore)
                .ingot()
                .iconSet(SHINY) // iconset
                .color(0xFA8624)
                .build();
        Spectresium = new Material.Builder(6040, gregtechId("spectresium"))
                .element(Elements.ElementSpectresium)
                .ingot()
                .iconSet(BRIGHT) // iconset
                .color(0xAC399C)
                .build();
        Aquamimite = new Material.Builder(6041, gregtechId("aquaminite"))
                .element(Elements.ElementAquamimite)
                .ingot()
                .iconSet(BRIGHT) // iconset
                .color(0xAC399C)
                .build();

        Terravium = new Material.Builder(6042, gregtechId("terravium"))
                .element(Elements.ElementTerravium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0x04D0A3)
                .build();

        Psilunarite = new Material.Builder(6043, gregtechId("psilunarite"))
                .element(Elements.ElementPsilunarite)
                .ingot()
                .iconSet(METALLIC) // iconset
                .color(0x5BC0A3)
                .build();

        Nebulium = new Material.Builder(6044, gregtechId("nebulium"))
                .element(Elements.ElementNebulium)
                .ingot()
                .iconSet(METALLIC) // iconset
                .color(0x666B4C)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE)
                .build();

        Scytronium = new Material.Builder(6045, gregtechId("scytronium"))
                .element(Elements.ElementScytronium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0xB7C03A)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .build();

        Modulatum = new Material.Builder(6046, gregtechId("modulatum"))
                .element(Elements.ElementModulatum)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0xAC9333)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_RING, GENERATE_SMALL_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .build();

        Etharosium = new Material.Builder(6047, gregtechId("etharosium"))
                .element(Elements.ElementEtharosium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0xAC0444)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_RING, GENERATE_SMALL_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .build();

        Echotium = new Material.Builder(6048, gregtechId("echotium"))
                .element(Elements.ElementEchotium)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0x99A4BC)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROUND, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_RING, GENERATE_SMALL_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .cableProperties(2097152, 2, 4, false) // add cables
                .build();

        Naquadasson = new Material.Builder(6049, gregtechId("naquadasson"))
                .element(Elements.ElementNaquadasson)
                .ingot()
                .iconSet(ROUGH) // iconset
                .color(0xE3A94B)
                .build();
    }
}

