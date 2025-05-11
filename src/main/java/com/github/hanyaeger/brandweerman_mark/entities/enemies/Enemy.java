package com.github.hanyaeger.brandweerman_mark.entities.enemies;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.brandweerman_mark.entities.Entity;

public abstract class Enemy extends DynamicSpriteEntity implements Entity {

    protected int hp;
    protected int damage;
    protected int speed;
    protected int gold;
    protected boolean isLevend;

    public Enemy(int hp, int damage, int speed, int gold) {
        super();
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
