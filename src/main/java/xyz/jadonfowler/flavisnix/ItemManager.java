package xyz.jadonfowler.flavisnix;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.jadonfowler.flavisnix.items.OctroDust;

public final class ItemManager {

    public static OctroDust octroDust = new OctroDust();

    public static void registerItems() {
        registerItem(octroDust);
    }

    private static void registerItem(Item item) {
        GameRegistry.register(item);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item, 0,
                new ModelResourceLocation(FlavisNix.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory")
        );
    }

}
