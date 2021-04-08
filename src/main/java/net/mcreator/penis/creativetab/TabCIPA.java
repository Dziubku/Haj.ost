
package net.mcreator.penis.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.penis.item.ItemSuka;
import net.mcreator.penis.ElementsPenis;

@ElementsPenis.ModElement.Tag
public class TabCIPA extends ElementsPenis.ModElement {
	public TabCIPA(ElementsPenis instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcipa") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemSuka.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
