package net.gobln.goboard.item;

import net.gobln.goboard.GoBoard;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GoBoard.MOD_ID);

    public static final RegistryObject<Item> WHITE_GO_STONE =
            ITEMS.register("whitegostone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CUSTOM_ITEM_TAB).stacksTo(64)));

    public static final RegistryObject<Item> BLACK_GO_STONE =
            ITEMS.register("blackgostone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CUSTOM_ITEM_TAB).stacksTo(64)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
