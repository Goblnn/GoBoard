package net.gobln.goboard.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.gobln.goboard.GoBoard;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class GoBoardScreen extends AbstractContainerScreen<GoBoardMenu>{
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(GoBoard.MOD_ID,"textures/gui/go_board_gui.png");

    private final int textureXSize = 256;

    private final int textureYSize = 276;

    public GoBoardScreen(GoBoardMenu goBoardMenu, Inventory inventory, Component component) {
        super(goBoardMenu, inventory, component);

        this.imageWidth = 176;
        this.imageHeight = 276;
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
        this.font.draw(matrixStack, this.title, 8.0F, 6.0F, 4210752);

        this.font.draw(matrixStack, this.playerInventoryTitle, 8.0F, (float) (this.imageHeight - 96 + 2), 4210752);
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (this.width - this.imageWidth) / 2;
        int y = (this.height - this.imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, this.imageWidth, this.imageHeight, this.textureXSize, this.textureYSize);
    }

    @Override
    public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(matrixStack, mouseX, mouseY);
    }
}
