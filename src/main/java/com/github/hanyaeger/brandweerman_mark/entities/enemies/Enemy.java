package com.github.hanyaeger.brandweerman_mark.entities.enemies;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.brandweerman_mark.Game;
import com.github.hanyaeger.brandweerman_mark.entities.Entity;
import com.github.hanyaeger.brandweerman_mark.entities.player.water_gun.WaterStream;
import com.github.hanyaeger.brandweerman_mark.scenes.rooms.Room;

import java.util.List;
import java.util.Random;

public abstract class Enemy extends DynamicSpriteEntity implements Entity, Collided {


    private static Coordinate2D location;
    protected int hp;
    protected int damage;
    protected boolean isLevend;
    private final Random random = new Random();

    public Enemy(int hp, int damage, String photo ,Coordinate2D location) {
        super(photo, location);
        this.hp = hp;
        this.damage = damage;
        this.isLevend = true;
        this.location = location;
    }



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

    public boolean getisLevend(){
       return isLevend;
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        setSpeed(0);

        switch (sceneBorder) {
            case TOP:
                setAnchorLocationY(3);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 3);
                break;
            case LEFT:
                setAnchorLocationX(3);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 3);
            default:
                break;
        }

    }

    public void beweeg() {
        int timer = 1000;
        if (timer <= 1) {;
            setMotion(3, random.nextInt(359));
            timer = 1000;
        } else timer--;
    }
    @Override
    public void onCollision(List<Collider> collisions) {
        int i = (Game.kamer % 5) + 1;
        if (hp > 0) {
            collisions.forEach(collider -> {
                if (collider instanceof WaterStream) {

                    hp = hp - 100;
                    setMotion(10, random.nextInt(359));
                    System.out.println("enemy collided with bullet");
                    if (hp <= 0) {
                        Room.enemiesList.remove(Room.enemiesList.get(0));
                        remove();

                    }
                    remove();//---------------------------------------
                }
            });
        } else {
            if(i <= 4){
                Room.enemiesList.remove(Room.enemiesList.get(0));
            remove();
            }
        }
    }
    @Override
    public void checkForCollisions(List<Collider> colliders) {
        Collided.super.checkForCollisions(colliders);
    }
}
