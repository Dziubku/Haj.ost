
package net.mcreator.penis.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.penis.procedure.ProcedureMetamfetaminaFoodEaten;
import net.mcreator.penis.creativetab.TabCIPA;
import net.mcreator.penis.ElementsPenis;

@ElementsPenis.ModElement.Tag
public class ItemMetamfetamina extends ElementsPenis.ModElement {
	@GameRegistry.ObjectHolder("penis:metamfetamina")
	public static final Item block = null;
	public ItemMetamfetamina(ElementsPenis instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("penis:metamfetamina", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(0, 0.3f, false);
			setUnlocalizedName("metamfetamina");
			setRegistryName("metamfetamina");
			setAlwaysEdible();
			setCreativeTab(TabCIPA.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureMetamfetaminaFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
