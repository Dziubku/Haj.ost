
package net.mcreator.takeitamgupotki.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.takeitamgupotki.item.ItemNiesfornik;
import net.mcreator.takeitamgupotki.ElementsTakeitamgupotki;

@ElementsTakeitamgupotki.ModElement.Tag
public class TabAtakietamgupotki extends ElementsTakeitamgupotki.ModElement {
	public TabAtakietamgupotki(ElementsTakeitamgupotki instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabatakietamgupotki") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemNiesfornik.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
