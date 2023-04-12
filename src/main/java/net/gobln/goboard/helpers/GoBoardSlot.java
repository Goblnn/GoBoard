package net.gobln.goboard.helpers;

import net.gobln.goboard.item.ModItems;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import java.util.ArrayList;
import java.util.List;

public class GoBoardSlot extends SlotItemHandler {

    public GoBoardSlot(IItemHandler handler, int index, int xPos, int yPos) {
        super(handler, index, xPos, yPos);
    }

    public int getMaxStackSize(){
        return 1;
    }

    public boolean mayPlace(ItemStack itemstack) {
        List<ItemStack> allowedItems = new ArrayList<>();

        // List of allowed solvents
        allowedItems.add(new ItemStack(ModItems.WHITE_GO_STONE.get()));
        allowedItems.add(new ItemStack(ModItems.BLACK_GO_STONE.get()));

        for (ItemStack allowedItem : allowedItems) {
            if (itemstack.getItem() == allowedItem.getItem()) {
                return true;
            }
        }
        return false;
    }
}
