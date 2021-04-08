
package net.mcreator.takeitamgupotki.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.takeitamgupotki.creativetab.TabAtakietamgupotki;
import net.mcreator.takeitamgupotki.ElementsTakeitamgupotki;

@ElementsTakeitamgupotki.ModElement.Tag
public class BlockSwastyka extends ElementsTakeitamgupotki.ModElement {
	@GameRegistry.ObjectHolder("takeitamgupotki:swastyka")
	public static final Block block = null;
	public BlockSwastyka(ElementsTakeitamgupotki instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("swastyka"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("takeitamgupotki:swastyka", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("swastyka");
			setSoundType(SoundType.METAL);
			setHardness(10F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabAtakietamgupotki.tab);
		}
	}
}
