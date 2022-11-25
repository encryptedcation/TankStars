package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.TankStars;

import java.util.ArrayList;

public class InGameScreen implements Screen {
    TankStars game;
    private Texture img;
    private Texture healthBarR;
    private Texture healthBarL;
    private Texture vs;
    private Texture fire;
    private Texture fuel;
    private Texture power;
    private Texture angle;
    private Texture pause;
    private Texture arrowDown;
    private float CURRENT_TANK_X;
    private float CURRENT_TANK_Y;
    private final int PAUSE_BUTTON_WIDTH = 69;
    private final int PAUSE_BUTTON_HEIGHT = 59;
    private final int PAUSE_BUTTON_Y = 980;
    private Texture pauseSel;
    private ArrayList<Float> groundHeight; // used to implement destructible terrain.
    private Texture ground;
    private Texture aim;
    private Texture fireActive;
    private Texture fuelActive;
    private Texture smallBlazer;
    private Texture smallMark;


    private Stage stage;
    public InGameScreen(TankStars game) {
        ground = new Texture("ground - Copy.jpeg");
        stage = new Stage(new StretchViewport(1920, 1080));
        img = new Texture("nightBG.png");
        healthBarR = new Texture("helth.png");
        healthBarL = new Texture("helthR.png");
        vs = new Texture("vs.png");
        fire = new Texture("FIRE.png");
        fireActive = new Texture("FIREACTIV.png");
        fuelActive = new Texture("FUEL-1.png");
        fuel = new Texture("fuel.png");
        power = new Texture("power.png");
        angle = new Texture("angle.png");
        pause = new Texture("pause.png");
        arrowDown = new Texture("arrowDown.png");
        pauseSel = new Texture("pauseSel.png");
        aim = new Texture("aim.png");
        smallBlazer = new Texture("blazerSmall.png");
        smallMark = new Texture("markSmall.png");
        this.game = game;
//        groundHeight = new ArrayList<Float>();
//        // initialise ground heights to hilly terrain.
//        float initialHeight = 500;
//        int flagIncreasing = 0;
//        for (int i = 0; i < 384; i++) {
//            groundHeight.add(initialHeight);
//            if (i%20 == 0 || i%47==0 || i%56==0) {
//                flagIncreasing = 1- flagIncreasing;
//            }
//            if (flagIncreasing == 1) {
//                initialHeight += Math.random()*2;
//            } else {
//                initialHeight -= Math.random();
//            }
//        }
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
        ScreenUtils.clear(0,0,0,1);
        stage.getBatch().begin();
        stage.getBatch().draw(img, 0, 0);
//        for (int i = 0; i < 384; i++) {
//            stage.getBatch().draw(ground, i * 5, 0, 5, groundHeight.get(i));
//        }
        stage.getBatch().draw(ground,0,0);
        stage.getBatch().draw(healthBarL, 338, 909);
        stage.getBatch().draw(healthBarR, 1011, 909);
        stage.getBatch().draw(vs, 930, 920);
        stage.getBatch().draw(fire, 1090, 158);
        stage.getBatch().draw(fuel, 261, 293);
        stage.getBatch().draw(power, 213, 540);
        stage.getBatch().draw(angle, 295, 540);
        stage.getBatch().draw(pause, 25, 980);
        stage.getBatch().draw(aim, 1500, 200);
        stage.getBatch().draw(smallBlazer, 1566, 455);
        stage.getBatch().draw(smallMark, 204, 450);
        // USE THE BELOW LINE WHILE IMPLEMENTING
//        stage.getBatch().draw(arrowDown, CURRENT_TANK_X, CURRENT_TANK_Y + 200);
        stage.getBatch().draw(arrowDown, 1613, 649);
        //draw ground here

        // if pause is clicked then go to PauseGameScreen
        int x = TankStars.WIDTH/2 - PAUSE_BUTTON_WIDTH/2;
        if (Gdx.input.getX() < 94 && Gdx.input.getX() > 25 && TankStars.HEIGHT - Gdx.input.getY() < PAUSE_BUTTON_Y + PAUSE_BUTTON_HEIGHT && TankStars.HEIGHT - Gdx.input.getY() > PAUSE_BUTTON_Y) {
            stage.getBatch().draw(pauseSel, 25, 980);
            if (Gdx.input.isTouched()) {
                this.dispose();
                game.setScreen(new PauseGameScreen(game));
            }
        }
        else{
            stage.getBatch().draw(pause, 25, 980);
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
