package de.zyne.zynemod.core.init;

import de.zyne.zynemod.ZyneMod;
import de.zyne.zynemod.common.items.SteelSword;
import de.zyne.zynemod.core.util.CustomTool;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.antlr.v4.Tool;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZyneMod.MOD_ID);

    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(CustomTool.STEEL_SWORD, 5, 1f,
            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    //public static final RegistryObject<Item> STEEL_PICKAXE;


        //STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new Item(new Item.Properties().addToolType(ToolType.PICKAXE, 1).tab(CreativeModeTab.TAB_MISC)));
        //STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ss, (int) ss.getAttackDamageBonus(), ss.getSpeed(), new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
