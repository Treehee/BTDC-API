package TeamVision.bdapi.blocks;

import java.util.List;

import TeamVision.bdapi.Main;
import TeamVision.bdapi.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class MultiBlockStructureBlock extends Block implements IHasModel{
	public MultiBlockStructureBlock(String name, Material material, ResourceLocation structure, CreativeTabs tab, List ModBlocksList, List ModItemsList){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModBlocksList.add(this);
		ModItemsList.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
