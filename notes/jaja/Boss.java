package org.example.classes;

public abstract class Boss extends Enemy {

    protected int hp;
    protected int damage;
    protected int speed;
    protected int gold;

    public abstract void stateSwitch();
}
