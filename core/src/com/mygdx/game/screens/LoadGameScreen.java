package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.TankStars;

public class LoadGameScreen implements Screen {
    private TankStars game;
    private Stage stage;
    private Texture bg;
    public LoadGameScreen(TankStars game) {
        this.game = game;
        stage = new Stage(new StretchViewport(1920, 1080));
        bg = new Texture("hehepng.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
