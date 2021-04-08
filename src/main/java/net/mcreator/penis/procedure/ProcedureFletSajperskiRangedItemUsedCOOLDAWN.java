package net.mcreator.penis.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.penis.ElementsPenis;

@ElementsPenis.ModElement.Tag
public class ProcedureFletSajperskiRangedItemUsedCOOLDAWN extends ElementsPenis.ModElement {
	public ProcedureFletSajperskiRangedItemUsedCOOLDAWN(ElementsPenis instance) {
		super(instance, 30);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FletSajperskiRangedItemUsedCOOLDAWN!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure FletSajperskiRangedItemUsedCOOLDAWN!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 80);
	}
}
