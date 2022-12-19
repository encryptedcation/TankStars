package com.encryptedcation.tankstars.scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.encryptedcation.tankstars.TankStars;

public class gameHUD {
    public Stage stage;
    private final Viewport viewport;
    private Table table;
    private Label scoreLabel;

    public gameHUD(SpriteBatch sb) {
        viewport = new FitViewport(TankStars.WIDTH, TankStars.HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, sb);
        scoreLabel = new Label("Score: ", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        table = new Table();
        table.top();
        table.setFillParent(true);
        table.add(scoreLabel).expandX().padTop(10);
        table.row();
        stage.addActor(table);
    }
}
