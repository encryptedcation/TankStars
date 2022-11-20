package com.encryptedcation.tankstars;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import screens.ChooseTankScreen;
import screens.InGameScreen;
import screens.MainMenuScreen;
import screens.PauseGameScreen;

public class TankStars extends Game {
	MainMenuScreen mainMenuScreen;
	InGameScreen inGameScreen;
	PauseGameScreen pauseGameScreen;
	ChooseTankScreen chooseTankScreen;
	SpriteBatch batch;
	Texture img;

	private Stage stage;

	public void resize(int width, int height) {
		// use true here to center the camera
		// that's what you probably want in case of a UI
		stage.getViewport().update(width, height, true);
	}
	
	@Override
	public void create () {
//		this.create();
		stage = new Stage(new StretchViewport(2688, 1242));
		batch = new SpriteBatch();
		img = new Texture("Texture2D/loader_2688x1242.png");
	}

	@Override
	public void render () {
//		this.render();
		stage.act();
		stage.draw();
		stage.getBatch().begin();
		stage.getBatch().draw(img, 0, 0);
		stage.getBatch().end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
