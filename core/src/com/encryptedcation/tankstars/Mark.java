package com.encryptedcation.tankstars;

import com.badlogic.gdx.graphics.Texture;

public class Mark extends Tank {
    public Mark(String name, int positionX, int positionY, int direction, int fuel, Attack defaultAttack) {
        super(name, positionX, positionY, direction, fuel, defaultAttack);
        this.texture = new Texture("gameTanks/markSmall.png");
    }
}
