package com.encryptedcation.tankstars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.encryptedcation.tankstars.TankStars;
import com.encryptedcation.tankstars.scenes.gameHUD;

public class AltInGameScreen implements Screen {
    private final TankStars game;
    private final OrthographicCamera tankCam;
    private final Viewport tankPort;
    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private gameHUD hud;

    public AltInGameScreen(TankStars game) {
        this.game = game;
        tankCam = new OrthographicCamera();
        tankPort = new FitViewport(TankStars.WIDTH, TankStars.HEIGHT, tankCam);
        mapLoader = new TmxMapLoader();
        map = mapLoader.load("mapreal.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        tankCam.position.set(tankPort.getWorldWidth()/2, tankPort.getWorldHeight()/2, 0);
        hud = new gameHUD(game.batch);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        tankCam.update();
        renderer.setView(tankCam);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(Gdx.gl.GL_COLOR_BUFFER_BIT);
        renderer.render();
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
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