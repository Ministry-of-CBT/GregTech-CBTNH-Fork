package gregtech.api.unification.material.materials;

import gregtech.api.GTValues;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.Elements;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class ElementMaterials {

    public static void register() {
        Actinium = new Material.Builder(1, gregtechId("actinium"))
                .ingot().fluid()
                .color(0xC3D1FF).iconSet(METALLIC)
                .element(Elements.Ac)
                .build();

        Aluminium = new Material.Builder(2, gregtechId("aluminium"))
                .ingot().fluid().ore()
                .color(0x80C8F0)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_FRAME, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .element(Elements.Al)
                .toolStats(ToolProperty.Builder.of(6.0F, 7.5F, 768, 2)
                        .enchantability(14).build())
                .rotorStats(10.0f, 2.0f, 128)
                .cableProperties(V[EV], 1, 1)
                .fluidPipeProperties(1166, 100, true)
                .blastTemp(1700, GasTier.LOW)
                .fluidTemp(933)
                .build();

        Americium = new Material.Builder(3, gregtechId("americium"))
                .ingot(3).fluid()
                .color(0x287869).iconSet(METALLIC)
                .flags(EXT_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .element(Elements.Am)
                .itemPipeProperties(64, 64)
                .fluidTemp(1449)
                .build();

        Antimony = new Material.Builder(4, gregtechId("antimony"))
                .ingot().fluid()
                .color(0xDCDCF0).iconSet(SHINY)
                .flags(MORTAR_GRINDABLE)
                .element(Elements.Sb)
                .fluidTemp(904)
                .build();

        Argon = new Material.Builder(5, gregtechId("argon"))
                .ingot().fluid(FluidTypes.GAS).plasma()
                .color(0x00FF00).iconSet(GAS)
                .element(Elements.Ar)
                .build();

        Arsenic = new Material.Builder(6, gregtechId("arsenic"))
                .ingot().fluid()
                .color(0x676756)
                .element(Elements.As)
                .fluidTemp(887)
                .build();

        Astatine = new Material.Builder(7, gregtechId("astatine"))
                .ingot().fluid()
                .color(0x241A24)
                .element(Elements.At)
                .build();

        Barium = new Material.Builder(8, gregtechId("barium"))
                .ingot().fluid()
                .color(0x83824C).iconSet(METALLIC)
                .element(Elements.Ba)
                .build();

        Berkelium = new Material.Builder(9, gregtechId("berkelium"))
                .ingot().fluid()
                .color(0x645A88).iconSet(METALLIC)
                .element(Elements.Bk)
                .build();

        Beryllium = new Material.Builder(10, gregtechId("beryllium"))
                .ingot().fluid().ore()
                .color(0x64B464).iconSet(METALLIC)
                .flags(STD_METAL, GENERATE_DOUBLE_PLATE)
                .element(Elements.Be)
                .fluidTemp(1560)
                .build();

        Bismuth = new Material.Builder(11, gregtechId("bismuth"))
                .ingot(1).fluid()
                .color(0x64A0A0).iconSet(METALLIC)
                .element(Elements.Bi)
                .fluidTemp(545)
                .build();

        Bohrium = new Material.Builder(12, gregtechId("bohrium"))
                .ingot().fluid()
                .color(0xDC57FF).iconSet(SHINY)
                .element(Elements.Bh)
                .build();

        Boron = new Material.Builder(13, gregtechId("boron"))
                .ingot().fluid()
                .color(0xD2FAD2)
                .element(Elements.B)
                .build();

        Bromine = new Material.Builder(14, gregtechId("bromine"))
                .ingot().fluid()
                .color(0x500A0A).iconSet(SHINY)
                .element(Elements.Br)
                .build();

        Caesium = new Material.Builder(15, gregtechId("caesium"))
                .ingot().fluid()
                .color(0x80620B).iconSet(METALLIC)
                .element(Elements.Cs)
                .build();

        Calcium = new Material.Builder(16, gregtechId("calcium"))
                .ingot().fluid()
                .color(0xFFF5DE).iconSet(METALLIC)
                .element(Elements.Ca)
                .build();

        Californium = new Material.Builder(17, gregtechId("californium"))
                .ingot().fluid()
                .color(0xA85A12).iconSet(METALLIC)
                .element(Elements.Cf)
                .build();

        Carbon = new Material.Builder(18, gregtechId("carbon"))
                .ingot().fluid()
                .color(0x141414)
                .element(Elements.C)
                .fluidTemp(4600)
                .build();

        Cadmium = new Material.Builder(19, gregtechId("cadmium"))
                .ingot().fluid()
                .color(0x32323C).iconSet(SHINY)
                .element(Elements.Cd)
                .build();

        Cerium = new Material.Builder(20, gregtechId("cerium"))
                .ingot().fluid()
                .color(0x87917D).iconSet(METALLIC)
                .element(Elements.Ce)
                .fluidTemp(1068)
                .build();

        Chlorine = new Material.Builder(21, gregtechId("chlorine"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0x2D8C8C, false)
                .element(Elements.Cl)
                .build();

        Chrome = new Material.Builder(22, gregtechId("chrome"))
                .ingot(3).fluid()
                .color(0xEAC4D8).iconSet(SHINY)
                .flags(EXT_METAL, GENERATE_ROTOR, GENERATE_DOUBLE_PLATE)
                .element(Elements.Cr)
                .rotorStats(12.0f, 3.0f, 512)
                .fluidPipeProperties(2180, 35, true, true, false, false)
                .blastTemp(1700, GasTier.LOW)
                .fluidTemp(2180)
                .build();

        Cobalt = new Material.Builder(23, gregtechId("cobalt"))
                .ingot().fluid().ore() // leave for TiCon ore processing
                .color(0x5050FA).iconSet(METALLIC)
                .flags(EXT_METAL, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
                .element(Elements.Co)
                .cableProperties(V[LV], 2, 2)
                .itemPipeProperties(2560, 2.0f)
                .fluidTemp(1768)
                .build();

        Copernicium = new Material.Builder(24, gregtechId("copernicium"))
                .ingot().fluid()
                .color(0xFFFEFF)
                .element(Elements.Cn)
                .build();

        Copper = new Material.Builder(25, gregtechId("copper"))
                .ingot(1).fluid().ore()
                .color(0xFF6400).iconSet(SHINY)
                .flags(EXT_METAL, MORTAR_GRINDABLE, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE,
                        GENERATE_DOUBLE_PLATE)
                .element(Elements.Cu)
                .cableProperties(V[MV], 1, 2)
                .fluidPipeProperties(1696, 6, true)
                .fluidTemp(1358)
                .build();

        Curium = new Material.Builder(26, gregtechId("curium"))
                .ingot().fluid()
                .color(0x7B544E).iconSet(METALLIC)
                .element(Elements.Cm)
                .build();

        Darmstadtium = new Material.Builder(27, gregtechId("darmstadtium"))
                .ingot().fluid()
                .color(0x578062)
                .flags(EXT2_METAL, GENERATE_DOUBLE_PLATE, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_SMALL_GEAR)
                .element(Elements.Ds)
                .build();

        Deuterium = new Material.Builder(28, gregtechId("deuterium"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0xFCFC84, false)
                .element(Elements.D)
                .build();

        Dubnium = new Material.Builder(29, gregtechId("dubnium"))
                .ingot().fluid()
                .color(0xD3FDFF).iconSet(SHINY)
                .element(Elements.Db)
                .build();

        Dysprosium = new Material.Builder(30, gregtechId("dysprosium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Dy)
                .build();

        Einsteinium = new Material.Builder(31, gregtechId("einsteinium"))
                .ingot().fluid()
                .color(0xCE9F00).iconSet(METALLIC)
                .element(Elements.Es)
                .build();

        Erbium = new Material.Builder(32, gregtechId("erbium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Er)
                .build();

        Europium = new Material.Builder(33, gregtechId("europium"))
                .ingot().fluid()
                .color(0x20FFFF).iconSet(METALLIC)
                .flags(STD_METAL, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_SPRING, GENERATE_FOIL, GENERATE_FRAME,
                        GENERATE_DOUBLE_PLATE)
                .element(Elements.Eu)
                .cableProperties(GTValues.V[GTValues.UHV], 2, 32)
                .fluidPipeProperties(7750, 300, true)
                .blastTemp(6000, GasTier.MID, VA[IV], 180)
                .fluidTemp(1099)
                .build();

        Fermium = new Material.Builder(34, gregtechId("fermium"))
                .ingot().fluid()
                .color(0x984ACF).iconSet(METALLIC)
                .element(Elements.Fm)
                .build();

        Flerovium = new Material.Builder(35, gregtechId("flerovium"))
                .ingot().fluid()
                .iconSet(SHINY)
                .element(Elements.Fl)
                .build();

        Fluorine = new Material.Builder(36, gregtechId("fluorine"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0x6EA7DC, false)
                .element(Elements.F)
                .build();

        Francium = new Material.Builder(37, gregtechId("francium"))
                .ingot().fluid().plasma()
                .color(0xAAAAAA).iconSet(SHINY)
                .element(Elements.Fr)
                .build();

        Gadolinium = new Material.Builder(38, gregtechId("gadolinium"))
                .ingot().fluid()
                .color(0xDDDDFF).iconSet(METALLIC)
                .element(Elements.Gd)
                .build();

        Gallium = new Material.Builder(39, gregtechId("gallium"))
                .ingot().fluid()
                .color(0xDCDCFF).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FOIL)
                .element(Elements.Ga)
                .fluidTemp(303)
                .build();

        Germanium = new Material.Builder(40, gregtechId("germanium"))
                .ingot().fluid()
                .color(0x434343).iconSet(SHINY)
                .element(Elements.Ge)
                .build();

        Gold = new Material.Builder(41, gregtechId("gold"))
                .ingot().fluid().ore()
                .color(0xFFE650).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_RING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_DOUBLE_PLATE)
                .element(Elements.Au)
                .cableProperties(V[HV], 3, 2)
                .fluidPipeProperties(1671, 25, true, true, false, false)
                .fluidTemp(1337)
                .build();

        Hafnium = new Material.Builder(42, gregtechId("hafnium"))
                .ingot().fluid()
                .color(0x99999A).iconSet(SHINY)
                .element(Elements.Hf)
                .build();

        Hassium = new Material.Builder(43, gregtechId("hassium"))
                .ingot().fluid()
                .color(0xDDDDDD)
                .element(Elements.Hs)
                .build();

        Holmium = new Material.Builder(44, gregtechId("holmium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Ho)
                .build();

        Hydrogen = new Material.Builder(45, gregtechId("hydrogen"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0x0000B5)
                .element(Elements.H)
                .build();

        Helium = new Material.Builder(46, gregtechId("helium"))
                .ingot().fluid(FluidTypes.GAS).plasma()
                .color(0xFCFC94, false)
                .element(Elements.He)
                .build();

        Helium3 = new Material.Builder(47, gregtechId("helium_3"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0xFCFCCC, false)
                .element(Elements.He3)
                .build();

        Indium = new Material.Builder(48, gregtechId("indium"))
                .ingot().fluid()
                .color(0x400080).iconSet(SHINY)
                .element(Elements.In)
                .fluidTemp(430)
                .build();

        Iodine = new Material.Builder(49, gregtechId("iodine"))
                .ingot().fluid()
                .color(0x2C344F).iconSet(SHINY)
                .element(Elements.I)
                .build();

        Iridium = new Material.Builder(50, gregtechId("iridium"))
                .ingot(3).fluid()
                .color(0xA1E4E4).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_FRAME)
                .element(Elements.Ir)
                .rotorStats(7.0f, 3.0f, 2560)
                .fluidPipeProperties(3398, 250, true, false, true, false)
                .blastTemp(4500, GasTier.HIGH, VA[IV], 1100)
                .fluidTemp(2719)
                .build();

        Iron = new Material.Builder(51, gregtechId("iron"))
                .ingot().fluid().plasma().ore()
                .color(0xC8C8C8).iconSet(METALLIC)
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_GEAR, GENERATE_SPRING_SMALL, GENERATE_SPRING, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, BLAST_FURNACE_CALCITE_TRIPLE)
                .element(Elements.Fe)
                .toolStats(ToolProperty.Builder.of(2.0F, 2.0F, 256, 2)
                        .enchantability(14).build())
                .rotorStats(7.0f, 2.5f, 256)
                .cableProperties(V[MV], 2, 3)
                .fluidTemp(1811)
                .build();

        Krypton = new Material.Builder(52, gregtechId("krypton"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0x80FF80, false).iconSet(GAS)
                .element(Elements.Kr)
                .build();

        Lanthanum = new Material.Builder(53, gregtechId("lanthanum"))
                .ingot().fluid()
                .color(0x5D7575).iconSet(METALLIC)
                .element(Elements.La)
                .fluidTemp(1193)
                .build();

        Lawrencium = new Material.Builder(54, gregtechId("lawrencium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Lr)
                .build();

        Lead = new Material.Builder(55, gregtechId("lead"))
                .ingot(1).fluid().ore()
                .color(0x8C648C)
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SPRING, GENERATE_SPRING_SMALL,
                        GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .element(Elements.Pb)
                .cableProperties(V[ULV], 2, 2)
                .fluidPipeProperties(1200, 8, true)
                .fluidTemp(600)
                .build();

        Lithium = new Material.Builder(56, gregtechId("lithium"))
                .ingot().fluid().ore()
                .color(0xBDC7DB)
                .element(Elements.Li)
                .fluidTemp(454)
                .build();

        Livermorium = new Material.Builder(57, gregtechId("livermorium"))
                .ingot().fluid()
                .color(0xAAAAAA).iconSet(SHINY)
                .element(Elements.Lv)
                .build();

        Lutetium = new Material.Builder(58, gregtechId("lutetium"))
                .ingot().fluid()
                .color(0x00AAFF).iconSet(METALLIC)
                .element(Elements.Lu)
                .fluidTemp(1925)
                .build();

        Magnesium = new Material.Builder(59, gregtechId("magnesium"))
                .ingot().fluid()
                .color(0xFFC8C8).iconSet(METALLIC)
                .element(Elements.Mg)
                .fluidTemp(923)
                .build();

        Mendelevium = new Material.Builder(60, gregtechId("mendelevium"))
                .ingot().fluid()
                .color(0x1D4ACF).iconSet(METALLIC)
                .element(Elements.Md)
                .build();

        Manganese = new Material.Builder(61, gregtechId("manganese"))
                .ingot().fluid()
                .color(0xCDE1B9)
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_BOLT_SCREW)
                .element(Elements.Mn)
                .rotorStats(7.0f, 2.0f, 512)
                .fluidTemp(1519)
                .build();

        Meitnerium = new Material.Builder(62, gregtechId("meitnerium"))
                .ingot().fluid()
                .color(0x2246BE).iconSet(SHINY)
                .element(Elements.Mt)
                .build();

        Mercury = new Material.Builder(63, gregtechId("mercury"))
                .ingot().fluid()
                .color(0xE6DCDC).iconSet(DULL)
                .element(Elements.Hg)
                .build();

        Molybdenum = new Material.Builder(64, gregtechId("molybdenum"))
                .ingot().fluid().ore()
                .color(0xB4B4DC).iconSet(SHINY)
                .element(Elements.Mo)
                .flags(GENERATE_FOIL, GENERATE_BOLT_SCREW)
                .rotorStats(7.0f, 2.0f, 512)
                .fluidTemp(2896)
                .build();

        Moscovium = new Material.Builder(65, gregtechId("moscovium"))
                .ingot().fluid()
                .color(0x7854AD).iconSet(SHINY)
                .element(Elements.Mc)
                .build();

        Neodymium = new Material.Builder(66, gregtechId("neodymium"))
                .ingot().fluid().ore()
                .color(0x646464).iconSet(METALLIC)
                .flags(STD_METAL, GENERATE_ROD, GENERATE_BOLT_SCREW)
                .element(Elements.Nd)
                .rotorStats(7.0f, 2.0f, 512)
                .blastTemp(1297, GasTier.MID)
                .build();

        Neon = new Material.Builder(67, gregtechId("neon"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0xFAB4B4).iconSet(GAS)
                .element(Elements.Ne)
                .build();

        Neptunium = new Material.Builder(68, gregtechId("neptunium"))
                .ingot().fluid()
                .color(0x284D7B).iconSet(METALLIC)
                .element(Elements.Np)
                .build();

        Nickel = new Material.Builder(69, gregtechId("nickel"))
                .ingot().fluid().plasma().ore()
                .color(0xC8C8FA).iconSet(METALLIC)
                .flags(STD_METAL, MORTAR_GRINDABLE, GENERATE_DOUBLE_PLATE)
                .element(Elements.Ni)
                .cableProperties(GTValues.V[GTValues.LV], 3, 3)
                .itemPipeProperties(2048, 1.0f)
                .fluidTemp(1728)
                .build();

        Nihonium = new Material.Builder(70, gregtechId("nihonium"))
                .ingot().fluid()
                .color(0x08269E).iconSet(SHINY)
                .element(Elements.Nh)
                .build();

        Niobium = new Material.Builder(71, gregtechId("niobium"))
                .ingot().fluid()
                .color(0xBEB4C8).iconSet(METALLIC)
                .element(Elements.Nb)
                .blastTemp(2750, GasTier.MID, VA[HV], 900)
                .build();

        Nitrogen = new Material.Builder(72, gregtechId("nitrogen"))
                .ingot().fluid(FluidTypes.GAS).plasma()
                .color(0x00BFC1).iconSet(GAS)
                .element(Elements.N)
                .build();

        Nobelium = new Material.Builder(73, gregtechId("nobelium"))
                .ingot().fluid()
                .iconSet(SHINY)
                .element(Elements.No)
                .build();

        Oganesson = new Material.Builder(74, gregtechId("oganesson"))
                .ingot().fluid()
                .color(0x142D64).iconSet(METALLIC)
                .element(Elements.Og)
                .build();

        Osmium = new Material.Builder(75, gregtechId("osmium"))
                .ingot(4).fluid()
                .color(0x3232FF).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_DOUBLE_PLATE)
                .element(Elements.Os)
                .rotorStats(16.0f, 4.0f, 1280)
                .cableProperties(V[LuV], 4, 2)
                .itemPipeProperties(256, 8.0f)
                .blastTemp(4500, GasTier.HIGH, VA[LuV], 1000)
                .fluidTemp(3306)
                .build();

        Oxygen = new Material.Builder(76, gregtechId("oxygen"))
                .ingot().fluid(FluidTypes.GAS).plasma()
                .color(0x4CC3FF)
                .element(Elements.O)
                .build();

        Palladium = new Material.Builder(77, gregtechId("palladium"))
                .ingot().fluid().ore()
                .color(0x808080).iconSet(SHINY)
                .flags(EXT_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .element(Elements.Pd)
                .blastTemp(1828, GasTier.LOW, VA[HV], 900)
                .build();

        Phosphorus = new Material.Builder(78, gregtechId("phosphorus"))
                .ingot().fluid()
                .color(0xFFFF00)
                .element(Elements.P)
                .build();

        Polonium = new Material.Builder(79, gregtechId("polonium"))
                .ingot().fluid()
                .color(0xC9D47E)
                .element(Elements.Po)
                .build();

        Platinum = new Material.Builder(80, gregtechId("platinum"))
                .ingot().fluid().ore()
                .color(0xFFFFC8).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_DOUBLE_PLATE)
                .element(Elements.Pt)
                .cableProperties(V[IV], 2, 1)
                .itemPipeProperties(512, 4.0f)
                .fluidTemp(2041)
                .build();

        Plutonium239 = new Material.Builder(81, gregtechId("plutonium"))
                .ingot(3).fluid().ore(true)
                .color(0xF03232).iconSet(METALLIC)
                .element(Elements.Pu239)
                .fluidTemp(913)
                .build();

        Plutonium241 = new Material.Builder(82, gregtechId("plutonium_241"))
                .ingot(3).fluid()
                .color(0xFA4646).iconSet(SHINY)
                .flags(EXT_METAL, GENERATE_DOUBLE_PLATE)
                .element(Elements.Pu241)
                .fluidTemp(913)
                .build();

        Potassium = new Material.Builder(83, gregtechId("potassium"))
                .ingot(1).fluid()
                .color(0xBEDCFF).iconSet(METALLIC)
                .element(Elements.K)
                .fluidTemp(337)
                .build();

        Praseodymium = new Material.Builder(84, gregtechId("praseodymium"))
                .ingot().fluid()
                .color(0xCECECE).iconSet(METALLIC)
                .element(Elements.Pr)
                .build();

        Promethium = new Material.Builder(85, gregtechId("promethium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Pm)
                .build();

        Protactinium = new Material.Builder(86, gregtechId("protactinium"))
                .ingot().fluid()
                .color(0xA78B6D).iconSet(METALLIC)
                .element(Elements.Pa)
                .build();

        Radon = new Material.Builder(87, gregtechId("radon"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0xFF39FF)
                .element(Elements.Rn)
                .build();

        Radium = new Material.Builder(88, gregtechId("radium"))
                .ingot().fluid()
                .color(0xFFFFCD).iconSet(SHINY)
                .element(Elements.Ra)
                .build();

        Rhenium = new Material.Builder(89, gregtechId("rhenium"))
                .ingot().fluid()
                .color(0xB6BAC3).iconSet(SHINY)
                .element(Elements.Re)
                .build();

        Rhodium = new Material.Builder(90, gregtechId("rhodium"))
                .ingot().fluid()
                .color(0xDC0C58).iconSet(BRIGHT)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_FINE_WIRE)
                .element(Elements.Rh)
                .blastTemp(2237, GasTier.MID, VA[EV], 1200)
                .build();

        Roentgenium = new Material.Builder(91, gregtechId("roentgenium"))
                .ingot().fluid()
                .color(0xE3FDEC).iconSet(SHINY)
                .element(Elements.Rg)
                .build();

        Rubidium = new Material.Builder(92, gregtechId("rubidium"))
                .ingot().fluid()
                .color(0xF01E1E).iconSet(SHINY)
                .element(Elements.Rb)
                .build();

        Ruthenium = new Material.Builder(93, gregtechId("ruthenium"))
                .ingot().fluid()
                .color(0x50ACCD).iconSet(SHINY)
                .flags(GENERATE_FOIL, GENERATE_GEAR)
                .element(Elements.Ru)
                .blastTemp(2607, GasTier.MID, VA[EV], 900)
                .build();

        Rutherfordium = new Material.Builder(94, gregtechId("rutherfordium"))
                .ingot().fluid()
                .color(0xFFF6A1).iconSet(SHINY)
                .element(Elements.Rf)
                .build();

        Samarium = new Material.Builder(95, gregtechId("samarium"))
                .ingot().fluid()
                .color(0xFFFFCC).iconSet(METALLIC)
                .flags(GENERATE_LONG_ROD)
                .element(Elements.Sm)
                .blastTemp(5400, GasTier.HIGH, VA[EV], 1500)
                .fluidTemp(1345)
                .build();

        Scandium = new Material.Builder(96, gregtechId("scandium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Sc)
                .build();

        Seaborgium = new Material.Builder(97, gregtechId("seaborgium"))
                .ingot().fluid()
                .color(0x19C5FF).iconSet(SHINY)
                .element(Elements.Sg)
                .build();

        Selenium = new Material.Builder(98, gregtechId("selenium"))
                .ingot().fluid()
                .color(0xB6BA6B).iconSet(SHINY)
                .element(Elements.Se)
                .build();

        Silicon = new Material.Builder(99, gregtechId("silicon"))
                .ingot().fluid()
                .color(0x3C3C50).iconSet(METALLIC)
                .flags(GENERATE_FOIL)
                .element(Elements.Si)
                .blastTemp(2273) // no gas tier for silicon
                .build();

        Silver = new Material.Builder(100, gregtechId("silver"))
                .ingot().fluid().ore()
                .color(0xDCDCFF).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_DOUBLE_PLATE, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_RING)
                .element(Elements.Ag)
                .cableProperties(V[HV], 1, 1)
                .fluidTemp(1235)
                .build();

        Sodium = new Material.Builder(101, gregtechId("sodium"))
                .ingot().fluid()
                .color(0x000096).iconSet(METALLIC)
                .element(Elements.Na)
                .build();

        Strontium = new Material.Builder(102, gregtechId("strontium"))
                .ingot().fluid()
                .color(0xC8C8C8).iconSet(METALLIC)
                .element(Elements.Sr)
                .build();

        Sulfur = new Material.Builder(103, gregtechId("sulfur"))
                .ingot().fluid().ore()
                .color(0xC8C800)
                .flags(FLAMMABLE)
                .element(Elements.S)
                .build();

        Tantalum = new Material.Builder(104, gregtechId("tantalum"))
                .ingot().fluid()
                .color(0x69B7FF).iconSet(METALLIC)
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .element(Elements.Ta)
                .fluidTemp(3290)
                .build();

        Technetium = new Material.Builder(105, gregtechId("technetium"))
                .ingot().fluid()
                .color(0x545455).iconSet(SHINY)
                .element(Elements.Tc)
                .build();

        Tellurium = new Material.Builder(106, gregtechId("tellurium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Te)
                .build();

        Tennessine = new Material.Builder(107, gregtechId("tennessine"))
                .ingot().fluid()
                .color(0x977FD6).iconSet(SHINY)
                .element(Elements.Ts)
                .build();

        Terbium = new Material.Builder(108, gregtechId("terbium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Tb)
                .build();

        Thorium = new Material.Builder(109, gregtechId("thorium"))
                .ingot().fluid().ore()
                .color(0x001E00).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_ROD)
                .element(Elements.Th)
                .fluidTemp(2023)
                .build();

        Thallium = new Material.Builder(110, gregtechId("thallium"))
                .ingot().fluid()
                .color(0xC1C1DE).iconSet(SHINY)
                .element(Elements.Tl)
                .build();

        Thulium = new Material.Builder(111, gregtechId("thulium"))
                .ingot().fluid()
                .iconSet(METALLIC)
                .element(Elements.Tm)
                .build();

        Tin = new Material.Builder(112, gregtechId("tin"))
                .ingot(1).fluid().ore()
                .color(0xDCDCDC)
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SPRING, GENERATE_SPRING_SMALL,
                        GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .element(Elements.Sn)
                .cableProperties(V[LV], 1, 1)
                .itemPipeProperties(4096, 0.5f)
                .fluidTemp(505)
                .build();

        Titanium = new Material.Builder(113, gregtechId("titanium")) // todo Ore? Look at EBF recipe here if we do Ti ores
                .ingot(3).fluid()
                .color(0xDCA0F0).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_DOUBLE_PLATE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_GEAR, GENERATE_FRAME)
                .element(Elements.Ti)
                .toolStats(ToolProperty.Builder.of(8.0F, 6.0F, 1536, 3)
                        .enchantability(14).build())
                .rotorStats(7.0f, 3.0f, 1600)
                .fluidPipeProperties(2426, 150, true)
                .blastTemp(1941, GasTier.MID, VA[HV], 1500)
                .build();

        Tritium = new Material.Builder(114, gregtechId("tritium"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0xFC5C5C, false)
                .iconSet(METALLIC)
                .element(Elements.T)
                .build();

        Tungsten = new Material.Builder(115, gregtechId("tungsten"))
                .ingot(3).fluid()
                .color(0x323232).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE)
                .element(Elements.W)
                .rotorStats(7.0f, 3.0f, 2560)
                .cableProperties(V[IV], 2, 2)
                .fluidPipeProperties(4618, 50, true, true, false, true)
                .blastTemp(3600, GasTier.MID, VA[EV], 1800)
                .fluidTemp(3695)
                .build();

        Uranium238 = new Material.Builder(116, gregtechId("uranium"))
                .ingot(3).fluid()
                .color(0x32F032).iconSet(METALLIC)
                .flags(EXT_METAL)
                .element(Elements.U238)
                .fluidTemp(1405)
                .build();

        Uranium235 = new Material.Builder(117, gregtechId("uranium_235"))
                .ingot(3).fluid()
                .color(0x46FA46).iconSet(SHINY)
                .flags(EXT_METAL)
                .element(Elements.U235)
                .fluidTemp(1405)
                .build();

        Vanadium = new Material.Builder(118, gregtechId("vanadium"))
                .ingot().fluid()
                .color(0x323232).iconSet(METALLIC)
                .element(Elements.V)
                .blastTemp(2183, GasTier.MID)
                .build();

        Xenon = new Material.Builder(119, gregtechId("xenon"))
                .ingot().fluid(FluidTypes.GAS)
                .color(0x00FFFF).iconSet(GAS)
                .element(Elements.Xe)
                .build();

        Ytterbium = new Material.Builder(120, gregtechId("ytterbium"))
                .ingot().fluid()
                .color(0xA7A7A7).iconSet(METALLIC)
                .element(Elements.Yb)
                .build();

        Yttrium = new Material.Builder(121, gregtechId("yttrium"))
                .ingot().fluid()
                .color(0x76524C).iconSet(METALLIC)
                .element(Elements.Y)
                .blastTemp(1799)
                .build();

        Zinc = new Material.Builder(122, gregtechId("zinc"))
                .ingot(1).fluid()
                .color(0xEBEBFA).iconSet(METALLIC)
                .flags(STD_METAL, MORTAR_GRINDABLE, GENERATE_FOIL, GENERATE_RING, GENERATE_FINE_WIRE)
                .element(Elements.Zn)
                .fluidTemp(693)
                .build();

        Zirconium = new Material.Builder(123, gregtechId("zirconium"))
                .ingot().fluid()
                .color(0xC8FFFF).iconSet(METALLIC)
                .element(Elements.Zr)
                .build();

        Naquadah = new Material.Builder(124, gregtechId("naquadah"))
                .ingot(4).fluid().ore()
                .color(0x323232, false).iconSet(METALLIC)
                .flags(EXT_METAL, GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, GENERATE_DOUBLE_PLATE)
                .element(Elements.Nq)
                .rotorStats(6.0f, 4.0f, 1280)
                .cableProperties(V[ZPM], 2, 2)
                .fluidPipeProperties(3776, 200, true, false, true, true)
                .blastTemp(5000, GasTier.HIGH, VA[IV], 600)
                .build();

        NaquadahEnriched = new Material.Builder(125, gregtechId("naquadah_enriched"))
                .ingot(4).fluid()
                .color(0x3C3C3C, false).iconSet(METALLIC)
                .flags(EXT_METAL, GENERATE_FOIL)
                .element(Elements.Nq1)
                .blastTemp(7000, GasTier.HIGH, VA[IV], 1000)
                .build();

        Naquadria = new Material.Builder(126, gregtechId("naquadria"))
                .ingot(3).fluid()
                .color(0x1E1E1E, false).iconSet(SHINY)
                .flags(EXT_METAL, GENERATE_DOUBLE_PLATE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW)
                .element(Elements.Nq2)
                .blastTemp(9000, GasTier.HIGH, VA[ZPM], 1200)
                .build();

        Neutronium = new Material.Builder(127, gregtechId("neutronium"))
                .ingot(6).fluid()
                .color(0xFAFAFA)
                .flags(EXT_METAL, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_DOUBLE_PLATE)
                .element(Elements.Nt)
                .toolStats(ToolProperty.Builder.of(180.0F, 100.0F, 65535, 6)
                        .attackSpeed(0.5F).enchantability(33).magnetic().unbreakable().build())
                .rotorStats(24.0f, 12.0f, 655360)
                .fluidPipeProperties(100_000, 5000, true, true, true, true)
                .fluidTemp(100_000)
                .build();

        Tritanium = new Material.Builder(128, gregtechId("tritanium"))
                .ingot(6).fluid()
                .color(0x600000).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_RING, GENERATE_SMALL_GEAR, GENERATE_ROUND, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_GEAR)
                .element(Elements.Tr)
                .cableProperties(V[UV], 1, 8)
                .rotorStats(20.0f, 6.0f, 10240)
                .fluidTemp(25000)
                .build();

        Duranium = new Material.Builder(129, gregtechId("duranium"))
                .ingot(5).fluid()
                .color(0x4BAFAF).iconSet(BRIGHT)
                .flags(EXT_METAL, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE)
                .element(Elements.Dr)
                .toolStats(ToolProperty.Builder.of(14.0F, 12.0F, 8192, 5)
                        .attackSpeed(0.3F).enchantability(33).magnetic().build())
                .fluidPipeProperties(9625, 500, true, true, true, true)
                .fluidTemp(7500)
                .build();

        Trinium = new Material.Builder(130, gregtechId("trinium"))
                .ingot(7).fluid()
                .color(0x9973BD).iconSet(SHINY)
                .flags(GENERATE_FOIL, GENERATE_BOLT_SCREW, GENERATE_GEAR)
                .element(Elements.Ke)
                .cableProperties(V[ZPM], 6, 4)
                .blastTemp(7200, GasTier.HIGH, VA[LuV], 1500)
                .build();

    }
}
