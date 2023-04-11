package net.gobln.goboard.helpers;

import net.gobln.goboard.item.ModItems;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ValidGoBoardItem{
    public ValidGoBoardItem() {}

    public boolean isItemValid(ItemStack itemstack) {
        List<ItemStack> solvents = new ArrayList<>();

        // List of allowed solvents
        solvents.add(new ItemStack(ModItems.WHITE_GO_STONE.get()));
        solvents.add(new ItemStack(ModItems.BLACK_GO_STONE.get()));

        for (ItemStack solvent : solvents) {
            if (itemstack.getItem() == solvent.getItem()) {
                return true;
            }
        }
        return false;
    }
}
