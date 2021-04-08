
package net.mcreator.takeitamgupotki.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.takeitamgupotki.creativetab.TabAtakietamgupotki;
import net.mcreator.takeitamgupotki.ElementsTakeitamgupotki;

import java.util.List;

@ElementsTakeitamgupotki.ModElement.Tag
public class ItemNiesfornik extends ElementsTakeitamgupotki.ModElement {
	@GameRegistry.ObjectHolder("takeitamgupotki:niesfornik")
	public static final Item block = null;
	public ItemNiesfornik(ElementsTakeitamgupotki instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("takeitamgupotki:niesfornik", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("niesfornik");
			setRegistryName("niesfornik");
			setCreativeTab(TabAtakietamgupotki.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("hahaha_zjem_ci_zembatki");
		}
	}
}
