package com.kduda.battleships.models.units;

public abstract class Ship implements Unit {
    public int type;
    public boolean vertical = true;
    private int health;

    public Ship(int type, boolean vertical) {
        this.type = type;
        this.vertical = vertical;
        this.health = type;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public void hit() {

    }
}
