package xyz.jadonfowler.flavisnix;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import xyz.jadonfowler.flavisnix.proxy.CommonProxy;

@Mod(modid = FlavisNix.MODID, name = FlavisNix.NAME, version = FlavisNix.VERSION)
public class FlavisNix {

    public static final String MODID = "flavisnix";
    public static final String NAME = "Flavis Nix";
    public static final String VERSION = "0.0.0";

    @SidedProxy(clientSide = "xyz.jadonfowler.flavisnix.proxy.ClientProxy", serverSide = "xyz.jadonfowler.flavisnix.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs(CreativeTabs.getNextID(), "Flavis Nix") {
        @Override
        public String getTranslatedTabLabel() {
            return "Flavis Nix";
        }

        @Override
        public Item getTabIconItem() {
            return ItemManager.octroDust;
        }
    };

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ItemManager.registerItems();
    }

}
