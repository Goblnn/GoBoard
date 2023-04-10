package net.gobln.goboard.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CUSTOM_ITEM_TAB = new CreativeModeTab("customitemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LINUS.get());
        }
    };
}
