package net.gobln.goboard.block.entity;

import net.gobln.goboard.GoBoard;
import net.gobln.goboard.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GoBoard.MOD_ID);

    public static final RegistryObject<BlockEntityType<GoBoardBlockEntity>> GO_BOARD = BLOCK_ENTITIES.register("go_board",
            () -> BlockEntityType.Builder.of(GoBoardBlockEntity::new,
                    ModBlocks.GO_BOARD.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
