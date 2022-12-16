package com.encryptedcation.tankstars;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.encryptedcation.tankstars.screens.MainScreen;

public class TankStars extends Game {
	public SpriteBatch batch;
	public static int WIDTH = 1920;
	public static int HEIGHT = 1080;

	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new MainScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
