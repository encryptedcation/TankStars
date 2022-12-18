package com.encryptedcation.tankstars;

import com.encryptedcation.tankstars.exceptions.OutOfFuelException;

import java.util.ArrayList;

public class Tank {
    // default tank is Mark 1
    private int fuel;
    public String name;
    public int positionX;
    public int positionY;
    public int direction;
    ArrayList<Attack> attacks = new ArrayList<Attack>();
    public Tank(String name, int positionX, int positionY, int direction, int fuel) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
        this.fuel = fuel;
    }

    public void move(int distance) throws OutOfFuelException {
        if (distance > fuel) {
            throw new OutOfFuelException("Not enough fuel to move " + distance + " units");
        }
        fuel -= distance;
        switch (direction) {
            case 0:
                positionY += distance;
                break;
            case 1:
                positionX += distance;
                break;
            case 2:
                positionY -= distance;
                break;
            case 3:
                positionX -= distance;
                break;
        }
    }

    // get position x
    public int getPositionX() {
        return positionX;
    }

    // get position y
    public int getPositionY() {
        return positionY;
    }

    // set position x
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // set position y
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // get direction
    public int getDirection() {
        return direction;
    }

    // set direction
    public void setDirection(int direction) {
        this.direction = direction;
    }

    // get fuel
    public int getFuel() {
        return fuel;
    }

    // set fuel
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // get name
    public String getName() {
        return name;
    }

    // set name
    public void setName(String name) {
        this.name = name;
    }

    // get default attack
//    public Attack getDefaultAttack() {
//        return defaultAttack;
//    }
}
