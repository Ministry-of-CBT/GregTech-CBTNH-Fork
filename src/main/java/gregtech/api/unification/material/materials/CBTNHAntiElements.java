package gregtech.api.unification.material.materials;

import gregtech.api.GTValues;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.FluidState;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.Element;
import gregtech.api.unification.Elements;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class CBTNHAntiElements {
    public static void register() {
        Antimatter = new Material.Builder(7000, gregtechId("antimatter")) // Placeholder for Antielements
                .element(Elements.ElementAntimatter)
                .ingot()
                .color(0x000000).iconSet(ANTIMATTER)
                .build();

        AntiActinium = new Material.Builder(7001, gregtechId("anti_actinium"))
                .ingot().liquid(new FluidBuilder().temperature(1500))
                .plasma()
                .color(0xC3D1FF).iconSet(ANTIMATTER)
                .element(Elements.AntiAc)
                .build();

        AntiAluminium = new Material.Builder(7002, gregtechId("anti_aluminium"))
                .ingot()
                .liquid(new FluidBuilder().temperature(933))
                .plasma()
                .ore()
                .color(0x80C8F0).iconSet(ANTIMATTER)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_FRAME, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiAl)
                .toolStats(ToolProperty.Builder.of(6.0F, 7.5F, 768, 2)
                        .enchantability(14).build())
                .rotorStats(10.0f, 2.0f, 128)
                .cableProperties(V[EV], 1, 1)
                .fluidPipeProperties(1166, 100, true)
                .blast(1700, GasTier.LOW)
                .build();

        AntiAmericium = new Material.Builder(7003, gregtechId("anti_americium"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(1449))
                .plasma()
                .color(0x287869).iconSet(ANTIMATTER)
                .flags(EXT_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiAm)
                .itemPipeProperties(64, 64)
                .build();

        AntiAntimony = new Material.Builder(7004, gregtechId("anti_antimony"))
                .ingot()
                .liquid(new FluidBuilder().temperature(904))
                .plasma()
                .color(0xDCDCF0).iconSet(ANTIMATTER)
                .flags(MORTAR_GRINDABLE)
                .element(Elements.AntiSb)
                .build();

        AntiArgon = new Material.Builder(7005, gregtechId("anti_argon"))
                .ingot().liquid(new FluidBuilder().temperature(1)).plasma()
                .color(0x00FF00).iconSet(ANTIMATTER)
                .element(Elements.AntiAr)
                .build();

        AntiArsenic = new Material.Builder(7006, gregtechId("anti_arsenic"))
                .ingot().plasma()
                .gas(new FluidBuilder().temperature(887))
                .color(0x676756).iconSet(ANTIMATTER)
                .element(Elements.AntiAs)
                .build();

        AntiAstatine = new Material.Builder(7007, gregtechId("anti_astatine"))
                .ingot().liquid(new FluidBuilder().temperature(573)).plasma()
                .color(0x241A24)
                .element(Elements.AntiAt)
                .build();

        AntiBarium = new Material.Builder(7008, gregtechId("anti_barium"))
                .ingot().liquid(new FluidBuilder().temperature(1000)).plasma()
                .color(0x83824C).iconSet(METALLIC)
                .element(Elements.AntiBa)
                .build();

        AntiBerkelium = new Material.Builder(7009, gregtechId("anti_berkelium"))
                .ingot().liquid(new FluidBuilder().temperature(1259)).plasma()
                .color(0x645A88).iconSet(METALLIC)
                .element(Elements.AntiBk)
                .build();

        AntiBeryllium = new Material.Builder(7010, gregtechId("anti_beryllium"))
                .ingot().plasma()
                .liquid(new FluidBuilder().temperature(1560))
                .ore()
                .color(0x64B464).iconSet(METALLIC)
                .flags(STD_METAL, GENERATE_DOUBLE_PLATE)
                .element(Elements.Be)
                .build();

        AntiBismuth = new Material.Builder(7011, gregtechId("anti_bismuth"))
                .ingot(1).plasma()
                .liquid(new FluidBuilder().temperature(545))
                .color(0x64A0A0).iconSet(METALLIC)
                .element(Elements.AntiBi)
                .build();

        AntiBohrium = new Material.Builder(7012, gregtechId("anti_bohrium"))
                .ingot().liquid(new FluidBuilder().temperature(1)).plasma()
                .color(0xDC57FF).iconSet(SHINY)
                .element(Elements.AntiBh)
                .build();

        AntiBoron = new Material.Builder(7013, gregtechId("anti_boron"))
                .ingot().liquid(new FluidBuilder().temperature(1)).plasma()
                .color(0xD2FAD2)
                .element(Elements.AntiB)
                .build();

        AntiBromine = new Material.Builder(7014, gregtechId("anti_bromine"))
                .ingot().liquid(new FluidBuilder()
                        .temperature(1))
                .plasma()
                .color(0x500A0A).iconSet(SHINY)
                .element(Elements.AntiBr)
                .build();

        // Stopped

        AntiCaesium = new Material.Builder(7015, gregtechId("anti_caesium"))
                .dust()
                .color(0x80620B).iconSet(METALLIC)
                .element(Elements.AntiCs)
                .build();

        AntiCalcium = new Material.Builder(7016, gregtechId("anti_calcium"))
                .dust()
                .color(0xFFF5DE).iconSet(METALLIC)
                .element(Elements.AntiCa)
                .build();

        AntiCalifornium = new Material.Builder(7017, gregtechId("anti_californium"))
                .color(0xA85A12).iconSet(METALLIC)
                .element(Elements.AntiCf)
                .build();

        AntiCarbon = new Material.Builder(7018, gregtechId("anti_carbon"))
                .dust()
                .liquid(new FluidBuilder().temperature(4600))
                .color(0x141414)
                .element(Elements.AntiC)
                .build();

        AntiCadmium = new Material.Builder(7019, gregtechId("anti_cadmium"))
                .dust()
                .color(0x32323C).iconSet(SHINY)
                .element(Elements.AntiCd)
                .build();

        AntiCerium = new Material.Builder(7020, gregtechId("anti_cerium"))
                .dust()
                .liquid(new FluidBuilder().temperature(1068))
                .color(0x87917D).iconSet(METALLIC)
                .element(Elements.AntiCe)
                .build();

        AntiChlorine = new Material.Builder(7021, gregtechId("anti_chlorine"))
                .gas(new FluidBuilder().customStill())
                .color(0x2D8C8C)
                .element(Elements.AntiCl)
                .build();

        AntiChrome = new Material.Builder(7022, gregtechId("anti_chrome"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(2180))
                .color(0xEAC4D8).iconSet(SHINY)
                .flags(EXT_METAL, GENERATE_ROTOR, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiCr)
                .rotorStats(12.0f, 3.0f, 512)
                .fluidPipeProperties(2180, 35, true, true, false, false)
                .blast(1700, GasTier.LOW)
                .build();

        AntiCobalt = new Material.Builder(7023, gregtechId("anti_cobalt"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1768))
                .ore() // leave for TiCon ore processing
                .color(0x5050FA).iconSet(METALLIC)
                .flags(EXT_METAL, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
                .element(Elements.AntiCo)
                .cableProperties(V[LV], 2, 2)
                .itemPipeProperties(2560, 2.0f)
                .build();

        AntiCopernicium = new Material.Builder(7024, gregtechId("anti_copernicium"))
                .color(0xFFFEFF)
                .element(Elements.AntiCn)
                .build();

        AntiCopper = new Material.Builder(7025, gregtechId("anti_copper"))
                .ingot(1)
                .liquid(new FluidBuilder().temperature(1358))
                .ore()
                .color(0xFF6400).iconSet(SHINY)
                .flags(EXT_METAL, MORTAR_GRINDABLE, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE,
                        GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiCu)
                .cableProperties(V[MV], 1, 2)
                .fluidPipeProperties(1696, 6, true)
                .build();

        AntiCurium = new Material.Builder(7026, gregtechId("anti_curium"))
                .color(0x7B544E).iconSet(METALLIC)
                .element(Elements.AntiCm)
                .build();

        AntiDarmstadtium = new Material.Builder(7027, gregtechId("anti_darmstadtium"))
                .ingot().fluid()
                .color(0x578062)
                .flags(EXT2_METAL, GENERATE_DOUBLE_PLATE, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_SMALL_GEAR)
                .element(Elements.AntiDs)
                .build();

        AntiDeuterium = new Material.Builder(7028, gregtechId("anti_deuterium"))
                .gas(new FluidBuilder().customStill())
                .color(0xFCFC84)
                .element(Elements.AntiD)
                .build();

        AntiDubnium = new Material.Builder(7029, gregtechId("anti_dubnium"))
                .color(0xD3FDFF).iconSet(SHINY)
                .element(Elements.AntiDb)
                .build();

        AntiDysprosium = new Material.Builder(7030, gregtechId("anti_dysprosium"))
                .iconSet(METALLIC)
                .element(Elements.AntiDy)
                .build();

        AntiEinsteinium = new Material.Builder(7031, gregtechId("anti_einsteinium"))
                .color(0xCE9F00).iconSet(METALLIC)
                .element(Elements.AntiEs)
                .build();

        AntiErbium = new Material.Builder(7032, gregtechId("anti_erbium"))
                .iconSet(METALLIC)
                .element(Elements.AntiEr)
                .build();

        AntiEuropium = new Material.Builder(7033, gregtechId("anti_europium"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1099))
                .color(0x20FFFF).iconSet(METALLIC)
                .flags(STD_METAL, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_SPRING, GENERATE_FOIL, GENERATE_FRAME,
                        GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiEu)
                .cableProperties(GTValues.V[GTValues.UHV], 2, 32)
                .fluidPipeProperties(7750, 300, true)
                .blast(b -> b
                        .temp(6000, GasTier.MID)
                        .blastStats(VA[IV], 180)
                        .vacuumStats(VA[HV]))
                .build();

        AntiFermium = new Material.Builder(7034, gregtechId("anti_fermium"))
                .color(0x984ACF).iconSet(METALLIC)
                .element(Elements.AntiFm)
                .build();

        AntiFlerovium = new Material.Builder(7035, gregtechId("anti_flerovium"))
                .iconSet(SHINY)
                .element(Elements.AntiFl)
                .build();

        AntiFluorine = new Material.Builder(7036, gregtechId("anti_fluorine"))
                .gas(new FluidBuilder().customStill())
                .color(0x6EA7DC)
                .element(Elements.AntiF)
                .build();

        AntiFrancium = new Material.Builder(7037, gregtechId("anti_francium"))
                .color(0xAAAAAA).iconSet(SHINY)
                .element(Elements.AntiFr)
                .build();

        AntiGadolinium = new Material.Builder(7038, gregtechId("anti_gadolinium"))
                .color(0xDDDDFF).iconSet(METALLIC)
                .element(Elements.AntiGd)
                .build();

        AntiGallium = new Material.Builder(7039, gregtechId("anti_gallium"))
                .ingot()
                .liquid(new FluidBuilder().temperature(303))
                .color(0xDCDCFF).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FOIL)
                .element(Elements.AntiGa)
                .build();

        AntiGermanium = new Material.Builder(7040, gregtechId("anti_germanium"))
                .color(0x434343).iconSet(SHINY)
                .element(Elements.AntiGe)
                .build();

        AntiGold = new Material.Builder(7041, gregtechId("anti_gold"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1337))
                .ore()
                .color(0xFFE650).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_RING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_FOIL,
                        GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiAu)
                .cableProperties(V[HV], 3, 2)
                .fluidPipeProperties(1671, 25, true, true, false, false)
                .build();

        AntiHafnium = new Material.Builder(7042, gregtechId("anti_hafnium"))
                .color(0x99999A).iconSet(SHINY)
                .element(Elements.AntiHf)
                .build();

        AntiHassium = new Material.Builder(7043, gregtechId("anti_hassium"))
                .color(0xDDDDDD)
                .element(Elements.AntiHs)
                .build();

        AntiHolmium = new Material.Builder(7044, gregtechId("anti_holmium"))
                .iconSet(METALLIC)
                .element(Elements.AntiHo)
                .build();

        AntiHydrogen = new Material.Builder(7045, gregtechId("anti_hydrogen"))
                .gas()
                .color(0x0000B5)
                .element(Elements.AntiH)
                .build();

        AntiHelium = new Material.Builder(7046, gregtechId("anti_helium"))
                .gas(new FluidBuilder().customStill())
                .plasma(new FluidBuilder().customStill())
                .liquid(new FluidBuilder()
                        .temperature(4)
                        .color(0xFCFF90)
                        .name("liquid_anti_helium")
                        .translation("gregtech.fluid.liquid_generic"))
                .color(0xFCFC94)
                .element(Elements.AntiHe)
                .build();
        AntiHelium.getProperty(PropertyKey.FLUID).setPrimaryKey(FluidStorageKeys.GAS);

        AntiHelium3 = new Material.Builder(7047, gregtechId("anti_helium_3"))
                .gas(new FluidBuilder()
                        .customStill()
                        .translation("gregtech.fluid.generic"))
                .color(0xFCFCCC)
                .element(Elements.AntiHe3)
                .build();

        AntiIndium = new Material.Builder(7048, gregtechId("anti_indium"))
                .ingot()
                .liquid(new FluidBuilder().temperature(430))
                .color(0x400080).iconSet(SHINY)
                .element(Elements.AntiIn)
                .build();

        AntiIodine = new Material.Builder(7049, gregtechId("anti_iodine"))
                .color(0x2C344F).iconSet(SHINY)
                .element(Elements.AntiI)
                .build();

        AntiIridium = new Material.Builder(7050, gregtechId("anti_iridium"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(2719))
                .color(0xA1E4E4).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_FRAME)
                .element(Elements.AntiIr)
                .rotorStats(7.0f, 3.0f, 2560)
                .fluidPipeProperties(3398, 250, true, false, true, false)
                .blast(b -> b
                        .temp(4500, GasTier.HIGH)
                        .blastStats(VA[IV], 1100)
                        .vacuumStats(VA[EV], 250))
                .build();

        AntiIron = new Material.Builder(7051, gregtechId("anti_iron"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1811))
                .plasma()
                .ore()
                .color(0xC8C8C8).iconSet(METALLIC)
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_GEAR,
                        GENERATE_SPRING_SMALL, GENERATE_SPRING, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        BLAST_FURNACE_CALCITE_TRIPLE)
                .element(Elements.AntiFe)
                .toolStats(ToolProperty.Builder.of(2.0F, 2.0F, 256, 2)
                        .enchantability(14).build())
                .rotorStats(7.0f, 2.5f, 256)
                .cableProperties(V[MV], 2, 3)
                .build();

        AntiKrypton = new Material.Builder(7052, gregtechId("anti_krypton"))
                .gas(new FluidBuilder()
                        .customStill()
                        .translation("gregtech.fluid.generic"))
                .color(0x80FF80)
                .element(Elements.AntiKr)
                .build();

        AntiLanthanum = new Material.Builder(7053, gregtechId("anti_lanthanum"))
                .dust()
                .liquid(new FluidBuilder().temperature(1193))
                .color(0x5D7575).iconSet(METALLIC)
                .element(Elements.AntiLa)
                .build();

        AntiLawrencium = new Material.Builder(7054, gregtechId("anti_lawrencium"))
                .iconSet(METALLIC)
                .element(Elements.AntiLr)
                .build();

        AntiLead = new Material.Builder(7055, gregtechId("anti_lead"))
                .ingot(1)
                .liquid(new FluidBuilder().temperature(600))
                .ore()
                .color(0x8C648C)
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SPRING, GENERATE_SPRING_SMALL,
                        GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiPb)
                .cableProperties(V[ULV], 2, 2)
                .fluidPipeProperties(1200, 32, true)
                .build();

        AntiLithium = new Material.Builder(7056, gregtechId("anti_lithium"))
                .dust()
                .liquid(new FluidBuilder().temperature(454))
                .ore()
                .color(0xBDC7DB)
                .element(Elements.AntiLi)
                .build();

        AntiLivermorium = new Material.Builder(7057, gregtechId("anti_livermorium"))
                .color(0xAAAAAA).iconSet(SHINY)
                .element(Elements.AntiLv)
                .build();

        AntiLutetium = new Material.Builder(7058, gregtechId("anti_lutetium"))
                .dust()
                .liquid(new FluidBuilder().temperature(1925))
                .color(0x00AAFF).iconSet(METALLIC)
                .element(Elements.AntiLu)
                .build();

        AntiMagnesium = new Material.Builder(7059, gregtechId("anti_magnesium"))
                .dust()
                .liquid(new FluidBuilder().temperature(923))
                .color(0xFFC8C8).iconSet(METALLIC)
                .element(Elements.AntiMg)
                .build();

        AntiMendelevium = new Material.Builder(7060, gregtechId("anti_mendelevium"))
                .color(0x1D4ACF).iconSet(METALLIC)
                .element(Elements.AntiMd)
                .build();

        AntiManganese = new Material.Builder(7061, gregtechId("anti_manganese"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1519))
                .color(0xCDE1B9)
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_BOLT_SCREW)
                .element(Elements.AntiMn)
                .rotorStats(7.0f, 2.0f, 512)
                .build();

        AntiMeitnerium = new Material.Builder(7062, gregtechId("anti_meitnerium"))
                .color(0x2246BE).iconSet(SHINY)
                .element(Elements.AntiMt)
                .build();

        AntiMercury = new Material.Builder(7063, gregtechId("anti_mercury"))
                .fluid()
                .color(0xE6DCDC).iconSet(DULL)
                .element(Elements.AntiHg)
                .build();

        AntiMolybdenum = new Material.Builder(7064, gregtechId("anti_molybdenum"))
                .ingot()
                .liquid(new FluidBuilder().temperature(2896))
                .ore()
                .color(0xB4B4DC).iconSet(SHINY)
                .element(Elements.AntiMo)
                .flags(GENERATE_FOIL, GENERATE_BOLT_SCREW)
                .rotorStats(7.0f, 2.0f, 512)
                .build();

        AntiMoscovium = new Material.Builder(7065, gregtechId("anti_moscovium"))
                .color(0x7854AD).iconSet(SHINY)
                .element(Elements.AntiMc)
                .build();

        AntiNeodymium = new Material.Builder(7066, gregtechId("anti_neodymium"))
                .ingot().fluid().ore()
                .color(0x646464).iconSet(METALLIC)
                .flags(STD_METAL, GENERATE_ROD, GENERATE_BOLT_SCREW)
                .element(Elements.AntiNd)
                .rotorStats(7.0f, 2.0f, 512)
                .blast(1297, GasTier.MID)
                .build();

        AntiNeon = new Material.Builder(7067, gregtechId("anti_neon"))
                .gas()
                .color(0xFAB4B4)
                .element(Elements.AntiNe)
                .build();

        AntiNeptunium = new Material.Builder(7068, gregtechId("anti_neptunium"))
                .color(0x284D7B).iconSet(METALLIC)
                .element(Elements.AntiNp)
                .build();

        AntiNickel = new Material.Builder(7069, gregtechId("anti_nickel"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1728))
                .plasma()
                .ore()
                .color(0xC8C8FA).iconSet(METALLIC)
                .flags(STD_METAL, MORTAR_GRINDABLE, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiNi)
                .cableProperties(GTValues.V[GTValues.LV], 3, 3)
                .itemPipeProperties(2048, 1.0f)
                .build();

        AntiNihonium = new Material.Builder(7070, gregtechId("anti_nihonium"))
                .color(0x08269E).iconSet(SHINY)
                .element(Elements.AntiNh)
                .build();

        AntiNiobium = new Material.Builder(7071, gregtechId("anti_niobium"))
                .ingot().fluid()
                .color(0xBEB4C8).iconSet(METALLIC)
                .element(Elements.AntiNb)
                .blast(b -> b
                        .temp(2750, GasTier.MID)
                        .blastStats(VA[HV], 900))
                .build();

        AntiNitrogen = new Material.Builder(7072, gregtechId("anti_nitrogen"))
                .gas().plasma()
                .color(0x00BFC1)
                .element(Elements.AntiN)
                .build();

        AntiNobelium = new Material.Builder(7073, gregtechId("anti_nobelium"))
                .iconSet(SHINY)
                .element(Elements.AntiNo)
                .build();

        AntiOganesson = new Material.Builder(7074, gregtechId("anti_oganesson"))
                .color(0x142D64).iconSet(METALLIC)
                .element(Elements.AntiOg)
                .build();

        AntiOsmium = new Material.Builder(7075, gregtechId("anti_osmium"))
                .ingot(4)
                .liquid(new FluidBuilder().temperature(3306))
                .color(0x3232FF).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiOs)
                .rotorStats(16.0f, 4.0f, 1280)
                .cableProperties(V[LuV], 4, 2)
                .itemPipeProperties(256, 8.0f)
                .blast(b -> b
                        .temp(4500, GasTier.HIGH)
                        .blastStats(VA[LuV], 1000)
                        .vacuumStats(VA[EV], 300))
                .build();

        AntiOxygen = new Material.Builder(7076, gregtechId("anti_oxygen"))
                .gas()
                .liquid(new FluidBuilder()
                        .temperature(85)
                        .color(0x6688DD)
                        .name("liquid_anti_oxygen")
                        .translation("gregtech.fluid.liquid_generic"))
                .plasma()
                .color(0x4CC3FF)
                .element(Elements.AntiO)
                .build();
        AntiOxygen.getProperty(PropertyKey.FLUID).setPrimaryKey(FluidStorageKeys.GAS);

        AntiPalladium = new Material.Builder(7077, gregtechId("anti_palladium"))
                .ingot().fluid().ore()
                .color(0x808080).iconSet(SHINY)
                .flags(EXT_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .element(Elements.AntiPd)
                .blast(b -> b
                        .temp(1828, GasTier.LOW)
                        .blastStats(VA[HV], 900)
                        .vacuumStats(VA[HV], 150))
                .build();

        AntiPhosphorus = new Material.Builder(7078, gregtechId("anti_phosphorus"))
                .dust()
                .color(0xFFFF00)
                .element(Elements.AntiP)
                .build();

        AntiPolonium = new Material.Builder(7079, gregtechId("anti_polonium"))
                .color(0xC9D47E)
                .element(Elements.AntiPo)
                .build();

        AntiPlatinum = new Material.Builder(7080, gregtechId("anti_platinum"))
                .ingot()
                .liquid(new FluidBuilder().temperature(2041))
                .ore()
                .color(0xFFFFC8).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiPt)
                .cableProperties(V[IV], 2, 1)
                .itemPipeProperties(512, 4.0f)
                .build();

        AntiPlutonium239 = new Material.Builder(7081, gregtechId("anti_plutonium"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(913))
                .ore(true)
                .color(0xF03232).iconSet(METALLIC)
                .element(Elements.AntiPu239)
                .build();

        AntiPlutonium241 = new Material.Builder(7082, gregtechId("anti_plutonium_241"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(913))
                .color(0xFA4646).iconSet(SHINY)
                .flags(EXT_METAL, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiPu241)
                .build();

        AntiPotassium = new Material.Builder(7083, gregtechId("anti_potassium"))
                .dust(1)
                .liquid(new FluidBuilder().temperature(337))
                .color(0xBEDCFF).iconSet(METALLIC)
                .element(Elements.AntiK)
                .build();

        AntiPraseodymium = new Material.Builder(7084, gregtechId("anti_praseodymium"))
                .color(0xCECECE).iconSet(METALLIC)
                .element(Elements.AntiPr)
                .build();

        AntiPromethium = new Material.Builder(7085, gregtechId("anti_promethium"))
                .iconSet(METALLIC)
                .element(Elements.AntiPm)
                .build();

        AntiProtactinium = new Material.Builder(7086, gregtechId("anti_protactinium"))
                .color(0xA78B6D).iconSet(METALLIC)
                .element(Elements.AntiPa)
                .build();

        AntiRadon = new Material.Builder(7087, gregtechId("anti_radon"))
                .gas()
                .color(0xFF39FF)
                .element(Elements.AntiRn)
                .build();

        AntiRadium = new Material.Builder(7088, gregtechId("anti_radium"))
                .color(0xFFFFCD).iconSet(SHINY)
                .element(Elements.AntiRa)
                .build();

        AntiRhenium = new Material.Builder(7089, gregtechId("anti_rhenium"))
                .color(0xB6BAC3).iconSet(SHINY)
                .element(Elements.AntiRe)
                .build();

        AntiRhodium = new Material.Builder(7090, gregtechId("anti_rhodium"))
                .ingot().fluid()
                .color(0xDC0C58).iconSet(BRIGHT)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_FINE_WIRE)
                .element(Elements.AntiRh)
                .blast(b -> b
                        .temp(2237, GasTier.MID)
                        .blastStats(VA[EV], 1200)
                        .vacuumStats(VA[HV]))
                .build();

        AntiRoentgenium = new Material.Builder(7091, gregtechId("anti_roentgenium"))
                .color(0xE3FDEC).iconSet(SHINY)
                .element(Elements.AntiRg)
                .build();

        AntiRubidium = new Material.Builder(7092, gregtechId("anti_rubidium"))
                .color(0xF01E1E).iconSet(SHINY)
                .element(Elements.AntiRb)
                .build();

        AntiRuthenium = new Material.Builder(7093, gregtechId("anti_ruthenium"))
                .ingot().fluid()
                .color(0x50ACCD).iconSet(SHINY)
                .flags(GENERATE_FOIL, GENERATE_GEAR)
                .element(Elements.AntiRu)
                .blast(b -> b
                        .temp(2607, GasTier.MID)
                        .blastStats(VA[EV], 900)
                        .vacuumStats(VA[HV], 200))
                .build();

        AntiRutherfordium = new Material.Builder(7094, gregtechId("anti_rutherfordium"))
                .color(0xFFF6A1).iconSet(SHINY)
                .element(Elements.AntiRf)
                .build();

        AntiSamarium = new Material.Builder(7095, gregtechId("anti_samarium"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1345))
                .color(0xFFFFCC).iconSet(METALLIC)
                .flags(GENERATE_LONG_ROD)
                .element(Elements.AntiSm)
                .blast(b -> b
                        .temp(5400, GasTier.HIGH)
                        .blastStats(VA[EV], 1500)
                        .vacuumStats(VA[HV], 200))
                .build();

        AntiScandium = new Material.Builder(7096, gregtechId("anti_scandium"))
                .iconSet(METALLIC)
                .element(Elements.AntiSc)
                .build();

        AntiSeaborgium = new Material.Builder(7097, gregtechId("anti_seaborgium"))
                .color(0x19C5FF).iconSet(SHINY)
                .element(Elements.AntiSg)
                .build();

        AntiSelenium = new Material.Builder(7098, gregtechId("anti_selenium"))
                .color(0xB6BA6B).iconSet(SHINY)
                .element(Elements.AntiSe)
                .build();

        AntiSilicon = new Material.Builder(7099, gregtechId("anti_silicon"))
                .ingot().fluid()
                .color(0x3C3C50).iconSet(METALLIC)
                .flags(GENERATE_FOIL)
                .element(Elements.AntiSi)
                .blast(2273) // no gas tier for silicon
                .build();

        AntiSilver = new Material.Builder(7100, gregtechId("anti_silver"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1235))
                .ore()
                .color(0xDCDCFF).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_DOUBLE_PLATE, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_RING)
                .element(Elements.AntiAg)
                .cableProperties(V[HV], 1, 1)
                .build();

        AntiSodium = new Material.Builder(7101, gregtechId("anti_sodium"))
                .dust()
                .color(0x000096).iconSet(METALLIC)
                .element(Elements.AntiNa)
                .build();

        AntiStrontium = new Material.Builder(7102, gregtechId("anti_strontium"))
                .color(0xC8C8C8).iconSet(METALLIC)
                .element(Elements.AntiSr)
                .build();

        AntiSulfur = new Material.Builder(7103, gregtechId("anti_sulfur"))
                .dust().ore()
                .color(0xC8C800)
                .flags(FLAMMABLE)
                .element(Elements.AntiS)
                .build();

        AntiTantalum = new Material.Builder(7104, gregtechId("anti_tantalum"))
                .ingot()
                .liquid(new FluidBuilder().temperature(3290))
                .color(0x69B7FF).iconSet(METALLIC)
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .element(Elements.AntiTa)
                .build();

        AntiTechnetium = new Material.Builder(7105, gregtechId("anti_technetium"))
                .color(0x545455).iconSet(SHINY)
                .element(Elements.AntiTc)
                .build();

        AntiTellurium = new Material.Builder(7106, gregtechId("anti_tellurium"))
                .iconSet(METALLIC)
                .element(Elements.AntiTe)
                .build();

        AntiTennessine = new Material.Builder(7107, gregtechId("anti_tennessine"))
                .color(0x977FD6).iconSet(SHINY)
                .element(Elements.AntiTs)
                .build();

        AntiTerbium = new Material.Builder(7108, gregtechId("anti_terbium"))
                .iconSet(METALLIC)
                .element(Elements.AntiTb)
                .build();

        AntiThorium = new Material.Builder(7109, gregtechId("anti_thorium"))
                .ingot()
                .liquid(new FluidBuilder().temperature(2023))
                .ore()
                .color(0x001E00).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_ROD)
                .element(Elements.AntiTh)
                .build();

        AntiThallium = new Material.Builder(7110, gregtechId("anti_thallium"))
                .color(0xC1C1DE).iconSet(SHINY)
                .element(Elements.AntiTl)
                .build();

        AntiThulium = new Material.Builder(7111, gregtechId("anti_thulium"))
                .iconSet(METALLIC)
                .element(Elements.AntiTm)
                .build();

        AntiTin = new Material.Builder(7112, gregtechId("anti_tin"))
                .ingot(1)
                .liquid(new FluidBuilder().temperature(505))
                .plasma()
                .ore()
                .color(0xDCDCDC)
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SPRING, GENERATE_SPRING_SMALL,
                        GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiSn)
                .cableProperties(V[LV], 1, 1)
                .itemPipeProperties(4096, 0.5f)
                .build();

        AntiTitanium = new Material.Builder(7113, gregtechId("anti_titanium")) // todo Ore? Look at EBF recipe here if we do Ti
                // ores
                .ingot(3).fluid()
                .color(0xDCA0F0).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_DOUBLE_PLATE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_GEAR,
                        GENERATE_FRAME)
                .element(Elements.AntiTi)
                .toolStats(ToolProperty.Builder.of(8.0F, 6.0F, 1536, 3)
                        .enchantability(14).build())
                .rotorStats(7.0f, 3.0f, 1600)
                .fluidPipeProperties(2426, 150, true, true, false, false)
                .blast(b -> b
                        .temp(1941, GasTier.MID)
                        .blastStats(VA[HV], 1500)
                        .vacuumStats(VA[HV]))
                .build();

        AntiTritium = new Material.Builder(7114, gregtechId("anti_tritium"))
                .gas(new FluidBuilder().customStill())
                .color(0xFC5C5C)
                .iconSet(METALLIC)
                .element(Elements.AntiT)
                .build();

        AntiTungsten = new Material.Builder(7115, gregtechId("anti_tungsten"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(3695))
                .color(0x323232).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_GEAR,
                        GENERATE_DOUBLE_PLATE)
                .element(Elements.AntiW)
                .rotorStats(7.0f, 3.0f, 2560)
                .cableProperties(V[IV], 2, 2)
                .fluidPipeProperties(4618, 50, true, true, false, true)
                .blast(b -> b
                        .temp(3600, GasTier.MID)
                        .blastStats(VA[EV], 1800)
                        .vacuumStats(VA[HV], 300))
                .build();

        AntiUranium238 = new Material.Builder(7116, gregtechId("anti_uranium"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(1405))
                .color(0x32F032).iconSet(METALLIC)
                .flags(EXT_METAL)
                .element(Elements.AntiU238)
                .build();

        AntiUranium235 = new Material.Builder(7117, gregtechId("anti_uranium_235"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(1405))
                .color(0x46FA46).iconSet(SHINY)
                .flags(EXT_METAL)
                .element(Elements.AntiU235)
                .build();

        AntiVanadium = new Material.Builder(7118, gregtechId("anti_vanadium"))
                .ingot().fluid()
                .color(0x323232).iconSet(METALLIC)
                .element(Elements.AntiV)
                .blast(2183, GasTier.MID)
                .build();

        AntiXenon = new Material.Builder(7119, gregtechId("anti_xenon"))
                .gas()
                .color(0x00FFFF)
                .element(Elements.AntiXe)
                .build();

        AntiYtterbium = new Material.Builder(7120, gregtechId("anti_ytterbium"))
                .color(0xA7A7A7).iconSet(METALLIC)
                .element(Elements.AntiYb)
                .build();

        AntiYttrium = new Material.Builder(7121, gregtechId("anti_yttrium"))
                .ingot().fluid()
                .color(0x76524C).iconSet(METALLIC)
                .element(Elements.AntiY)
                .blast(1799)
                .build();

        AntiZinc = new Material.Builder(7122, gregtechId("anti_zinc"))
                .ingot(1)
                .liquid(new FluidBuilder().temperature(693))
                .color(0xEBEBFA).iconSet(METALLIC)
                .flags(STD_METAL, MORTAR_GRINDABLE, GENERATE_FOIL, GENERATE_RING, GENERATE_FINE_WIRE)
                .element(Elements.AntiZn)
                .build();

        AntiZirconium = new Material.Builder(7123, gregtechId("anti_zirconium"))
                .color(0xC8FFFF).iconSet(METALLIC)
                .element(Elements.AntiZr)
                .build();
    }
}
