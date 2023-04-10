package net.gobln.goboard.screen;

import net.gobln.goboard.block.entity.GoBoardBlockEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;

public class ModMenuTypes extends AbstractContainerMenu {
    public final GoBoardBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public GoBoardMenu(int id, Inventory inv, FriendlyByteBuf extraData){
        this(id, inv, inv.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public GoBoardMenu(int id, Inventory inv, BlockEntity entity, ContainerData data){
        super(, id);
        checkContainerSize(inv, 81);
        blockEntity = (GoBoardBlockEntity) entity;
        this.level = inv.player.level;
        this.data = data;
    }

    @Override
    public ItemStack quickMoveStack(Player p_38941_, int p_38942_) {
        return null;
    }

    @Override
    public boolean stillValid(Player p_38874_) {
        return false;
    }
}
