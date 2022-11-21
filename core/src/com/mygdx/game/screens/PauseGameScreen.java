package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.TankStars;

public class PauseGameScreen implements Screen {
    TankStars game;
    private Stage stage;
    private Texture bg;
    private Texture resume;
    private Texture resumeSel;
    private Texture mainMenu;
    private Texture mainMenuSel;
    private Texture saveGame;
    private Texture saveGameSel;
    private Texture restart;
    private Texture restartSel;



    public PauseGameScreen(TankStars game) {
        this.game = game;
        stage = new Stage(new StretchViewport(1920, 1080));
        bg = new Texture("BG.png");
        resume = new Texture("RESUME.png");
        resumeSel = new Texture("RESUMEACTIVE.png");
        mainMenu = new Texture("MAINMENU.png");
        mainMenuSel = new Texture("MAINMENUACTIVE.png");
        saveGame = new Texture("SAVEGAME.png");
        saveGameSel = new Texture("SAVEGAMEACTIVE.png");
        restart = new Texture("RESTART.png");
        restartSel = new Texture("RESTARTACTIVE.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
        stage.getBatch().begin();
        stage.getBatch().draw(bg, 0, 0);
        stage.getBatch().draw(resume, 793, 754);
        stage.getBatch().draw(mainMenu, 793, 578);
        stage.getBatch().draw(saveGame, 793, 403);
        stage.getBatch().draw(restart, 793, 226);
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
