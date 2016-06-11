package xyz.jadonfowler.flavisnix;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.jadonfowler.flavisnix.blocks.ChemicalCauldron;

public final class BlockManager {

    public static ChemicalCauldron chemicalCauldron = new ChemicalCauldron();

    public static void registerBlocks() {
        registerBlock(chemicalCauldron);
    }

    private static void registerBlock(Block block) {
        GameRegistry.register(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(FlavisNix.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory")
        );
    }
}
