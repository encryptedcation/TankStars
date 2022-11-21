package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.TankStars;

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



    private Stage stage;
    public InGameScreen(TankStars game) {
        stage = new Stage(new StretchViewport(1920, 1080));
        img = new Texture("nightBG.png");
        healthBarR = new Texture("helthR.png");
        healthBarL = new Texture("helth.png");
        vs = new Texture("vs.png");
        fire = new Texture("fire.png");
        fuel = new Texture("fuel.png");
        power = new Texture("power.png");
        angle = new Texture("angle.png");
        pause = new Texture("pause.png");
        arrowDown = new Texture("arrowDown.png");
        pauseSel = new Texture("pauseSel.png");
        this.game = game;
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
        stage.getBatch().draw(healthBarL, 338, 909);
        stage.getBatch().draw(healthBarR, 1011, 909);
        stage.getBatch().draw(vs, 930, 920);
        stage.getBatch().draw(fire, 1090, 158);
        stage.getBatch().draw(fuel, 261, 293);
        stage.getBatch().draw(power, 213, 540);
        stage.getBatch().draw(angle, 295, 540);
        stage.getBatch().draw(pause, 25, 980);
        // USE THE BELOW LINE WHILE IMPLEMENTING
//        stage.getBatch().draw(arrowDown, CURRENT_TANK_X, CURRENT_TANK_Y + 200);
        stage.getBatch().draw(arrowDown, 1613, 649);

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
