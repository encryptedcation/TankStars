package com.encryptedcation.tankstars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.encryptedcation.tankstars.TankStars;

public class AltInGameScreen implements Screen {
    private final TankStars game;
    private final OrthographicCamera tankCam;
    private final Viewport tankPort;

    public AltInGameScreen(TankStars game) {
        this.game = game;
        tankCam = new OrthographicCamera();
        tankPort = new FitViewport(TankStars.WIDTH, TankStars.HEIGHT, tankCam);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.batch.setProjectionMatrix(tankCam.combined);
    }

    @Override
    public void resize(int width, int height) {
        tankPort.update(width,height);
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