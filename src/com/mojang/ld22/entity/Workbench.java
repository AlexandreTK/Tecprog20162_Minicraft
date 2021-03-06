package com.mojang.ld22.entity;

import com.mojang.ld22.crafting.Crafting;
import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.screen.CraftingMenu;

public class Workbench extends Furniture {
	
	public Workbench() {
		super("Workbench");
		color = Color.get(-1, 100, 321, 431);
		sprite = 4;
		positionXRelative = 3;
		positionYRelative = 2;
	}

	public boolean use(Player player, int attackDirection) {
		player.game.setMenu(new CraftingMenu(Crafting.workbenchRecipes, player));
		return true;
	}
}