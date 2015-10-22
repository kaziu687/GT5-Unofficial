package gregtech.loaders.oreprocessing;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.common.items.GT_MetaGenerated_Tool_01;
import net.minecraft.item.ItemStack;

public class ProcessingToolHeadDrill implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingToolHeadDrill() {
        OrePrefixes.toolHeadDrill.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.StainlessSteel, new long[]{100000L, 32L, 1L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_LV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.StainlessSteel), Character.valueOf('P'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.StainlessSteel), Character.valueOf('B'), ItemList.Battery_RE_LV_Lithium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.StainlessSteel, new long[]{75000L, 32L, 1L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_LV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.StainlessSteel), Character.valueOf('P'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.StainlessSteel), Character.valueOf('B'), ItemList.Battery_RE_LV_Cadmium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.StainlessSteel, new long[]{50000L, 32L, 1L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_LV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.StainlessSteel), Character.valueOf('P'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.StainlessSteel), Character.valueOf('B'), ItemList.Battery_RE_LV_Sodium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.Titanium, new long[]{400000L, 128L, 2L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_MV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.Titanium), Character.valueOf('P'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.Titanium), Character.valueOf('B'), ItemList.Battery_RE_MV_Lithium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.Titanium, new long[]{300000L, 128L, 2L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_MV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.Titanium), Character.valueOf('P'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.Titanium), Character.valueOf('B'), ItemList.Battery_RE_MV_Cadmium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.Titanium, new long[]{200000L, 128L, 2L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_MV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.Titanium), Character.valueOf('P'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.Titanium), Character.valueOf('B'), ItemList.Battery_RE_MV_Sodium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.TungstenSteel, new long[]{1600000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_HV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.TungstenSteel), Character.valueOf('P'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.TungstenSteel), Character.valueOf('B'), ItemList.Battery_RE_HV_Lithium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.TungstenSteel, new long[]{1200000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_HV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.TungstenSteel), Character.valueOf('P'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.TungstenSteel), Character.valueOf('B'), ItemList.Battery_RE_HV_Cadmium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.TungstenSteel, new long[]{800000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", Character.valueOf('X'), aOreDictName, Character.valueOf('M'), ItemList.Electric_Motor_HV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.TungstenSteel), Character.valueOf('P'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('G'), OrePrefixes.gearGtSmall.get(Materials.TungstenSteel), Character.valueOf('B'), ItemList.Battery_RE_HV_Sodium.get(1L, new Object[0])});

        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(130, 1, aMaterial, Materials.Titanium, new long[]{1600000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "PRP", "MPB", Character.valueOf('X'), OrePrefixes.stickLong.get(aMaterial), Character.valueOf('M'), ItemList.Electric_Piston_HV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.Titanium), Character.valueOf('P'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('R'), OrePrefixes.spring.get(Materials.Titanium), Character.valueOf('B'), ItemList.Battery_RE_HV_Lithium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(130, 1, aMaterial, Materials.Titanium, new long[]{1200000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "PRP", "MPB", Character.valueOf('X'), OrePrefixes.stickLong.get(aMaterial), Character.valueOf('M'), ItemList.Electric_Piston_HV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.Titanium), Character.valueOf('P'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('R'), OrePrefixes.spring.get(Materials.Titanium), Character.valueOf('B'), ItemList.Battery_RE_HV_Cadmium.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(130, 1, aMaterial, Materials.Titanium, new long[]{800000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "PRP", "MPB", Character.valueOf('X'), OrePrefixes.stickLong.get(aMaterial), Character.valueOf('M'), ItemList.Electric_Piston_HV.get(1L, new Object[0]), Character.valueOf('S'), OrePrefixes.screw.get(Materials.Titanium), Character.valueOf('P'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('R'), OrePrefixes.spring.get(Materials.Titanium), Character.valueOf('B'), ItemList.Battery_RE_HV_Sodium.get(1L, new Object[0])});
    }
}
