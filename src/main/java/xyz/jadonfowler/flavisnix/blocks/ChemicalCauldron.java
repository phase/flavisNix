package xyz.jadonfowler.flavisnix.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xyz.jadonfowler.flavisnix.FlavisNix;

public class ChemicalCauldron extends Block {

    public ChemicalCauldron() {
        super(Material.ROCK);
        setRegistryName("chemical_cauldron");
        setUnlocalizedName("chemical_cauldron");
        setCreativeTab(FlavisNix.creativeTab);
        setHardness(2f);
        setResistance(10f);
    }
}
