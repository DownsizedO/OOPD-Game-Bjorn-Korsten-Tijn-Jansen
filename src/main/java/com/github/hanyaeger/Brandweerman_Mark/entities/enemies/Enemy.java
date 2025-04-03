package com.github.hanyaeger.Brandweerman_Mark.entities.enemies;
import com.github.hanyaeger.Brandweerman_Mark.entities.Entity;

public abstract class Enemy implements Entity {

    protected int hp;
    protected int damage;
    protected int speed;
    protected int gold;
    protected boolean isLevend;

    public Enemy(int hp, int damage, int speed, int gold) {
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.gold = gold;
        this.isLevend = true;
    }


    public abstract void beweeg();

    @Override
    public abstract void aanval();

    @Override
    public void Neem_Schade(int schade) {
        hp -= schade;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGold() {
        return gold;
    }

    public boolean getisLevend(){
       return isLevend;
    }
}
