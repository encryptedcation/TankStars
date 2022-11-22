package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.TankStars;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;

import java.awt.*;
import java.util.Objects;

public class SelectTankScreen implements Screen {
    private float x;
    private float y;
    private Stage stage;
    final TankStars game;
    private Texture img;
    private Texture tankStars;

    private Texture tankNameBanner;
    private Texture tankHP;
    private Texture tank;
    private Texture playerChoose;
    private Texture nextButton;
    private Texture previousButton;
    private Texture rightActive;
    private Texture leftActive;
    private Texture nextTank;
    private Texture currTank;
    private Texture prevTank;
    private Texture choose;
    private Texture chooseSel;
    private int CHOOSE_BUTTON_WIDTH = 319;
    private int CHOOSE_BUTTON_HEIGHT = 146;
    private int CHOOSE_BUTTON_Y = 18;
    private int flag = 0;
    public SelectTankScreen(final TankStars game) {
        this.game = game;

        img = new Texture("bg-1.png");
        tankNameBanner = new Texture("Mark1.png");
//        tankHP = new Texture("tankHP.png");
        tankStars = new Texture("logo.png");

        tank = new Texture("Mark_I 1.png");
        playerChoose = new Texture("playerOneChoose.png");
        nextButton = new Texture("left 4.png");
        previousButton = new Texture("left 3.png");
        rightActive = new Texture("left 4 sel.png");
        leftActive = new Texture("left 3 sel.png");
        choose = new Texture("choose.png");
        chooseSel = new Texture("chooseSel.png");
        stage = new Stage(new StretchViewport(1920, 1080));
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
        ScreenUtils.clear(0, 0, 0, 1);
        stage.getBatch().begin();
        stage.getBatch().draw(img, x, y);

        stage.getBatch().draw(tankStars, 800, 900);
        stage.getBatch().draw(tank, 350, 150, 1141, 752);
        stage.getBatch().draw(tankNameBanner, 800, 750, 357, 136);

        stage.getBatch().draw(playerChoose, 815, 715, 320, 48);
        stage.getBatch().draw(nextButton, 1529, 469, 197, 142);
        stage.getBatch().draw(previousButton, 192, 469, 198, 142);
        int f = 0;

        if (Gdx.input.getX() >1529 && Gdx.input.getX() < 1529+197 && Gdx.input.getY() > 469 && Gdx.input.getY() < 469+142) {
            stage.getBatch().draw(rightActive,1529, 469, 197, 142);
            if (Gdx.input.justTouched()) {
                f = 1;
            }
        }
        if (f == 1){
//            this.tank.dispose();
//            stage.getBatch().draw(img, x, y);
//            this.tankNameBanner.dispose();
            tank = new Texture("Blazer 3.png");
            tankNameBanner = new Texture("Blazer.png");
            stage.getBatch().draw(tankNameBanner, 800, 750, 357, 136);
            stage.getBatch().draw(tank, 350, 150, 754, 552);
        }
        if (Gdx.input.getX() >192 && Gdx.input.getX() < 192+198 && Gdx.input.getY() > 469 && Gdx.input.getY() < 469+142) {
            stage.getBatch().draw(leftActive,192, 469, 198, 142);
            if (Gdx.input.isTouched()) {
                tank = new Texture("Mark_I 1.png");
                stage.getBatch().draw(tank, 350, 150, 1141, 752);
                tankNameBanner = new Texture("Mark1.png");
                stage.getBatch().draw(tankNameBanner, 800, 750, 357, 136);
            }
        }
        int x = TankStars.WIDTH/2 - CHOOSE_BUTTON_WIDTH/2;
        if (Gdx.input.getX() < x + CHOOSE_BUTTON_WIDTH && Gdx.input.getX() > x && TankStars.HEIGHT - Gdx.input.getY() < CHOOSE_BUTTON_Y + CHOOSE_BUTTON_HEIGHT && TankStars.HEIGHT - Gdx.input.getY() > CHOOSE_BUTTON_Y) {
            stage.getBatch().draw(chooseSel, x, CHOOSE_BUTTON_Y, CHOOSE_BUTTON_WIDTH, CHOOSE_BUTTON_HEIGHT);
            if (Gdx.input.justTouched()) {
                if (flag == 0) {
                    playerChoose = new Texture("playerTwoChoose.png");
                    stage.getBatch().draw(playerChoose, 815, 715, 320, 48);
                    flag = 1;
                }
                else {
                    game.setScreen(new InGameScreen(game));
                    this.dispose();
                }
            }
        }
        else{
            stage.getBatch().draw(choose,x, CHOOSE_BUTTON_Y, CHOOSE_BUTTON_WIDTH, CHOOSE_BUTTON_HEIGHT);
        }
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
