package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.TankStars;

public class SelectTankScreen implements Screen {
    private float x;
    private float y;
    private Stage stage;
    TankStars game;
    private Texture img;
    // create animation variable
    private Texture tankStars;

    private Texture tankNameBanner;
    private Texture tankHP;
    private Texture tank;
    private Texture playerOneChoose;
    private Texture playerTwoChoose;
    private Texture nextButton;
    private Texture previousButton;
    private Texture choose;
    private Texture chooseActive;
    private Texture nextTank;
    private Texture currTank;
    private Texture prevTank;

    public SelectTankScreen(TankStars game) {
        img = new Texture("bg-1.png");
        tankNameBanner = new Texture("Mark1.png");
//        tankHP = new Texture("tankHP.png");
        tankStars = new Texture("logo.png");

        tank = new Texture("Mark_I 1.png");
        playerOneChoose = new Texture("playerOneChoose.png");
        playerTwoChoose = new Texture("playerTwoChoose.png");
        nextButton = new Texture("rightArrow.png");
        previousButton = new Texture("leftArrow.png");
        choose = new Texture("choose.png");
//        chooseActive = new Texture("chooseActive.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        stage = new Stage(new StretchViewport(1920, 1080));
        stage.act();
        stage.draw();
        ScreenUtils.clear(0, 0, 0, 1);
        stage.getBatch().begin();
        stage.getBatch().draw(img, x, y);
        stage.getBatch().draw(tankStars, 800, 900);
        stage.getBatch().draw(tankNameBanner, 800, 750, 357, 136);
        stage.getBatch().draw(tank, 350, 150, 1141, 752);
        stage.getBatch().draw(playerOneChoose, 815, 715, 320, 48);
        stage.getBatch().end();
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
