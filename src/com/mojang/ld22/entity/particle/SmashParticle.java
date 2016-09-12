package com.mojang.ld22.entity.particle;

import com.mojang.ld22.entity.Entity;
import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Screen;
import com.mojang.ld22.sound.Sound;

public class SmashParticle extends Entity {
	private int time = 0;

	public SmashParticle(int x, int y) {
		this.positionX = x;
		this.positionY = y;
		Sound.monsterHurt.play();
	}

	public void tick() {
		time++;
		if (time > 10) {
			remove();
		}
	}

	public void render(Screen screen) {
		int col = Color.get(-1, 555, 555, 555);
		screen.render(positionX - 8, positionY - 8, 5 + 12 * 32, col, 2);
		screen.render(positionX - 0, positionY - 8, 5 + 12 * 32, col, 3);
		screen.render(positionX - 8, positionY - 0, 5 + 12 * 32, col, 0);
		screen.render(positionX - 0, positionY - 0, 5 + 12 * 32, col, 1);
	}
}
