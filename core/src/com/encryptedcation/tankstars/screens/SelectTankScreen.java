package com.encryptedcation.tankstars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.encryptedcation.tankstars.*;

public class SelectTankScreen implements Screen {
    private static Player player1;
    private static Player player2;
    private Tank m1;
    private Tank m2;
    private float x;
    private float y;
    private Stage stage;
    final TankStars game;
    private Texture img;
    private Texture tankStars;

    private Texture tankNameBanner;
    private Texture tankHP;
    private Texture tank;
    private Texture playerOneChoose;
    private Texture playerTwoChoose;
    private Texture nextButton;
    private Texture previousButton;
    private Texture rightActive;
    private Texture leftActive;
    private Texture nextTank;
    private Texture currTank;
    private Texture prevTank;
    private Texture smolMark;
    private Texture smolBlazer;
    private Texture smolToxic;
    private Texture circleNoBG;
    private Texture names;
    private Texture choose;
    private Texture highlightedMark;
    private Texture highlightedBlazer;
    private Texture highlightedToxic;
    private Texture playerOneChooseActive;
    private Texture playerTwoChooseActive;

    private Texture chooseSel;
    private int CHOOSE_BUTTON_WIDTH = 319;
    private int CHOOSE_BUTTON_HEIGHT = 146;
    private int CHOOSE_BUTTON_Y = 222;
    private int flag = 0;
    private int flagPlayer = 0;
    public SelectTankScreen(final TankStars game) {
        this.game = game;

        img = new Texture("bg-1.png");
        tankNameBanner = new Texture("Mark1.png");
//        tankHP = new Texture("tankHP.png");
        tankStars = new Texture("logo.png");

        tank = new Texture("Mark_I 1.png");
        playerOneChoose = new Texture("playerOneChoose.png");
        playerTwoChoose = new Texture("playerTwoChoose.png");

        choose = new Texture("Group 22.png");
        chooseSel = new Texture("Group 21.png");
        smolBlazer = new Texture("smolBlazer.png");
        smolMark = new Texture("smolMark.png");
        smolToxic = new Texture("smolToxic.png");
        circleNoBG = new Texture("circleNoBG.png");
        highlightedBlazer = new Texture("hltdBlazer.png");
        highlightedMark = new Texture("highlightedMark.png");
        highlightedToxic = new Texture("hltdToxic.png");
        playerOneChooseActive = new Texture("playerOneChooseActive.png");
        playerTwoChooseActive = new Texture("playerTwoChooseActive.png");
        names = new Texture("names.png");
        stage = new Stage(new StretchViewport(1920, 1080));
        m1 = new Mark("Mark", 0, 0, 0, 100, null);
        m2 = new Mark("Mark", 0, 0, 0, 100, null);
        player1 = new Player(1, m1, 100, 0, 0, 0);
        player2 = new Player(2, m2, 100, 0, 0, 0);
    }
    public static Player getPlayer1() {
        return player1;
    }
    public static Player getPlayer2() {
        return player2;
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
        // if flagPlayer == 0, player 1 is choosing
        // if flagPlayer == 1, player 2 is choosing
        if (flag == 0) {
            stage.getBatch().draw(playerOneChooseActive, 359, 926);
            stage.getBatch().draw(playerTwoChoose, 1201, 926);
        } else {
            stage.getBatch().draw(playerOneChoose, 359, 926);
            stage.getBatch().draw(playerTwoChooseActive, 1201, 926);
        }
        stage.getBatch().draw(circleNoBG, 147, 657);
        stage.getBatch().draw(circleNoBG, 431, 657);
        stage.getBatch().draw(circleNoBG, 715, 657);
        stage.getBatch().draw(circleNoBG, 975, 657);
        stage.getBatch().draw(circleNoBG, 1259, 657);
        stage.getBatch().draw(circleNoBG, 1543, 657);
        stage.getBatch().draw(names, 978, 554);
        stage.getBatch().draw(names, 150, 554);
        stage.getBatch().draw(smolMark, 158, 708);
        stage.getBatch().draw(smolToxic, 421, 694);
        stage.getBatch().draw(smolBlazer, 742, 708);
        stage.getBatch().draw(smolMark, 986, 708);
        stage.getBatch().draw(smolToxic, 1249, 694);
        stage.getBatch().draw(smolBlazer, 1570, 708);


//        ---------------------------------------------------

        // player 1 hovers first and can choose out of 3 tanks on the left, smolMark, smolToxic, smolBlazer
        // player 2 hovers second and can choose out of 3 tanks on the right, smolMark, smolToxic, smolBlazer
        int flag = 0;
        Tank t1 = new Mark("Mark", 0, 0, 0, 100, null);
        Tank t2 = new Mark("Mark", 0, 0, 0, 100, null);
              //----------------------------------------------------------------------
// if hovered over circleNoBG then it changes
        if (Gdx.input.getX() > 147 && Gdx.input.getX() < 147 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
            stage.getBatch().draw(highlightedMark, 147, 657);
            if (Gdx.input.isTouched()){

                stage.getBatch().draw(highlightedMark, 147, 657);
            }
        }
        if (Gdx.input.getX() > 431 && Gdx.input.getX() < 431 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
            stage.getBatch().draw(highlightedToxic, 431, 657);
            if (Gdx.input.isTouched()){
                stage.getBatch().draw(highlightedToxic, 431, 657);
            }
        }
        if (Gdx.input.getX() > 715 && Gdx.input.getX() < 715 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
            stage.getBatch().draw(highlightedBlazer, 715, 657);
            if (Gdx.input.isTouched()){
                stage.getBatch().draw(highlightedBlazer, 715, 657);
            }
        }
        if (Gdx.input.getX() > 975 && Gdx.input.getX() < 975 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
            stage.getBatch().draw(highlightedMark, 975, 657);
            if (Gdx.input.isTouched()){
                stage.getBatch().draw(highlightedMark, 975, 657);
            }
        }
        if (Gdx.input.getX() > 1259 && Gdx.input.getX() < 1259 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
            stage.getBatch().draw(highlightedToxic, 1259, 657);
            if (Gdx.input.isTouched()) {
                stage.getBatch().draw(highlightedToxic, 1259, 657);
            }
        }
        if (Gdx.input.getX() > 1543 && Gdx.input.getX() < 1543 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
            stage.getBatch().draw(highlightedBlazer, 1543, 657);
            if (Gdx.input.isTouched()) {
                stage.getBatch().draw(highlightedBlazer, 1543, 657);
            }
        }

        // if clicked, save highlight
        if (Gdx.input.isTouched()) {
            if (Gdx.input.getX() > 147 && Gdx.input.getX() < 147 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
                flag = 1;
                Tank t4 = new Mark("Mark", 0, 0, 0, 100, null);
                getPlayer1().setTank(t4);
            }
            if (Gdx.input.getX() > 431 && Gdx.input.getX() < 431 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
                flag = 2;
                Tank t5 = new Toxic("Toxic", 0, 0, 0, 100, null);
                getPlayer1().setTank(t5);
            }
            if (Gdx.input.getX() > 715 && Gdx.input.getX() < 715 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
                flag = 3;
                Tank t6 = new Blazer("Blazer", 0, 0, 0, 100, null);
                getPlayer1().setTank(t6);
            }
            if (Gdx.input.getX() > 975 && Gdx.input.getX() < 975 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
                flag = 4;
                Tank t7 = new Mark("Mark", 0, 0, 0, 100, null);
                getPlayer2().setTank(t7);
            }
            if (Gdx.input.getX() > 1259 && Gdx.input.getX() < 1259 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
                flag = 5;
                Tank t8 = new Toxic("Toxic", 0, 0, 0, 100, null);
                getPlayer2().setTank(t8);
            }
            if (Gdx.input.getX() > 1543 && Gdx.input.getX() < 1543 + 256 && Gdx.input.getY() > 1080 - 657 - 256 && Gdx.input.getY() < 1080 - 657) {
                flag = 6;
                Tank t9 = new Blazer("Blazer", 0, 0, 0, 100, null);
                getPlayer2().setTank(t9);
            }
        }

        getPlayer2().setTank(t2);
        // if flag is set, draw the highlighted image
        if (flag == 1) {
            stage.getBatch().draw(highlightedMark, 147, 657);
        }
        if (flag == 2) {
            stage.getBatch().draw(highlightedToxic, 431, 657);
        }
        if (flag == 3) {
            stage.getBatch().draw(highlightedBlazer, 715, 657);
        }
        if (flag == 4) {
            stage.getBatch().draw(highlightedMark, 975, 657);
        }
        if (flag == 5) {
            stage.getBatch().draw(highlightedToxic, 1259, 657);
        }
        if (flag == 6) {
            stage.getBatch().draw(highlightedBlazer, 1543, 657);
        }






//        -----------------------------------------------------



        int x = TankStars.WIDTH/2 - CHOOSE_BUTTON_WIDTH/2;
        if (Gdx.input.getX() < x + CHOOSE_BUTTON_WIDTH && Gdx.input.getX() > x && TankStars.HEIGHT - Gdx.input.getY() < CHOOSE_BUTTON_Y + CHOOSE_BUTTON_HEIGHT && TankStars.HEIGHT - Gdx.input.getY() > CHOOSE_BUTTON_Y) {
            stage.getBatch().draw(chooseSel, x, CHOOSE_BUTTON_Y, CHOOSE_BUTTON_WIDTH, CHOOSE_BUTTON_HEIGHT);
            if (Gdx.input.justTouched()) {
                if (flagPlayer == 0) {
                    flagPlayer = 1;
                    flag = 0;
                } else if (flagPlayer == 1) {
                    // move to game screen
                    game.setScreen(new InGameScreen(game));
                }
            }
        }
        else {
            stage.getBatch().draw(choose, x, CHOOSE_BUTTON_Y, CHOOSE_BUTTON_WIDTH, CHOOSE_BUTTON_HEIGHT);
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
