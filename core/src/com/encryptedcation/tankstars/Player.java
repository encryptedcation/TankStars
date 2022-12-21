package com.encryptedcation.tankstars;

public class Player implements java.io.Serializable {
    public int x; public int y;
    private int id;
    private Tank tank;
    private int health;
    private int angleOfShooting;
    private int powerOfShooting;
    private int fuel;

    public Player(int id, Tank tank, int health, int angleOfShooting, int powerOfShooting, int fuel) {
        this.id = id;
        this.tank = tank;
        this.health = health;
        this.angleOfShooting = angleOfShooting;
        this.powerOfShooting = powerOfShooting;
        this.fuel = fuel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tank getTank() {
        return tank;
    }

    public void increasePlayerHealth(int health) {
        this.health += health;
    }

    public void decreasePlayerHealth(int health) {
        this.health -= health;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAngleOfShooting() {
        return angleOfShooting;
    }

    public void setAngleOfShooting(int angleOfShooting) {
        this.angleOfShooting = angleOfShooting;
    }

    public int getPowerOfShooting() {
        return powerOfShooting;
    }

    public void setPowerOfShooting(int powerOfShooting) {
        this.powerOfShooting = powerOfShooting;
    }

    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // shooting function
    private void shoot() {
        // TODO
    }

    // moving function
    private void move() {
        // TODO
    }
}