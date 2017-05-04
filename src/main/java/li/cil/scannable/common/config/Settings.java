package li.cil.scannable.common.config;

import li.cil.scannable.api.API;
import net.minecraftforge.common.config.Config;

@Config(modid = API.MOD_ID)
public final class Settings {
    @Config.LangKey(Constants.CONFIG_USE_ENERGY)
    @Config.Comment("Whether to consume energy when performing a scan.\n" +
                    "Will make the scanner a chargeable item.")
    public static boolean useEnergy;

    @Config.LangKey(Constants.CONFIG_ORE_BLACKLIST)
    @Config.Comment("Ore dictionary entries that match the common ore pattern but should be ignored.")
    public static String[] oresBlacklist = {
    };

    @Config.LangKey(Constants.CONFIG_ORE_COLORS)
    @Config.Comment("The colors for ores used when rendering their result bounding box.\n" +
                    "Each entry must be a key-value pair separated by a `=`, with the.\n" +
                    "key being the ore dictionary name and the value being the hexadecimal\n" +
                    "RGB value of the color.")
    public static String[] oreColors = {
            // Minecraft
            "oreCoal=0x635F5C",
            "oreIron=0xA17951",
            "oreGold=0xF4F71F",
            "oreLapis=0x4863F0",
            "oreDiamond=0x48E2F0",
            "oreRedstone=0xE61E1E",
            "oreEmerald=0x12BA16",
            "oreQuartz=0xB3D9D2",
            "glowstone=0xE9E68E",

            // Thermal Foundation
            "oreCopper=0xE4A020",
            "oreLead=0x8187C3",
            "oreMithril=0x97D5FE",
            "oreNickel=0xD0D3AC",
            "orePlatinum=0x7AC0FD",
            "oreSilver=0xE8F2FB",
            "oreTin=0xCCE4FE",

            // Misc.
            "oreAluminum=0xCBE4E2",
            "oreAluminium=0xCBE4E2",
            "orePlutonium=0x9DE054",
            "oreUranium=0x9DE054",
            "oreYellorium=0xD8E054",

            // Tinker's Construct
            "oreArdite=0xB77E11",
            "oreCobalt=0x413BB8",

            // Thaumcraft
            "oreCinnabar=0xF5DA25",
            "oreInfusedAir=0xF7E677",
            "oreInfusedFire=0xDC7248",
            "oreInfusedWater=0x9595D5",
            "oreInfusedEarth=0x49B45A",
            "oreInfusedOrder=0x9FF2DE",
            "oreInfusedEntropy=0x545476"
    };

    @Config.LangKey(Constants.CONFIG_ORES_COMMON)
    @Config.Comment("Ore dictionary entries considered common ores.\n" +
                    "Anything matching /ore[A-Z].*/ that isn't in the rare ore list is\n" +
                    "automatically considered a common ore.")
    public static String[] oresCommon = {
            // Minecraft
            "glowstone"
    };

    @Config.LangKey(Constants.CONFIG_ORES_RARE)
    @Config.Comment("Ore dictionary names of ores considered 'rare', requiring the rare ore scanner module.")
    public static String[] oresRare = {
            // Minecraft
            "oreGold",
            "oreDiamond",
            "oreLapis",
            "oreEmerald",

            // Thermal Foundation
            "oreSilver",
            "oreNickel",
            "orePlatinum",
            "oreMithril",
            "oreUranium",

            // Tinker's Construct
            "oreArdite",
            "oreCobalt",

            // Thaumcraft
            "oreInfusedAir",
            "oreInfusedFire",
            "oreInfusedWater",
            "oreInfusedEarth",
            "oreInfusedOrder",
            "oreInfusedEntropy"
    };

    // --------------------------------------------------------------------- //

    private Settings() {
    }
}
