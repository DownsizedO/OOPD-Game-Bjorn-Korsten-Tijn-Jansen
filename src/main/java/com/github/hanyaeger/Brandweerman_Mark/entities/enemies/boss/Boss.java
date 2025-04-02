package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.boss;
import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.Enemy;


import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.Enemy;

public abstract class Boss extends Enemy {

    protected int hp;
    protected int damage;
    protected int speed;
    protected int gold;

    public abstract void stateSwitch();
}
