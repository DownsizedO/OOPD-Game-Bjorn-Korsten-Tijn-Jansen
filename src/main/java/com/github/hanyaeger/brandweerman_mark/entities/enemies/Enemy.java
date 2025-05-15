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



    protected int hp;
    protected int damage;
    protected boolean isLevend;
    private final Random random = new Random();

    public Enemy(int hp, int damage, String photo ,Coordinate2D location) {
        super(photo, location);
        this.hp = hp;
        this.damage = damage;
        this.isLevend = true;

    }

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
    @Override
    public void onCollision(List<Collider> collisions) {
        int i = (Game.kamer % 5) + 1;
        if (hp > 0) {
            collisions.forEach(collider -> {
                if (collider instanceof WaterStream) {

                    hp = hp - 10;
                    setMotion(10, random.nextInt(359));
                    if (hp <= 0 && !Room.enemiesList.isEmpty()) {
                        Room.enemiesList.remove(Room.enemiesList.getFirst());
                        remove();

                    }

                }
            });
        } else {
            if(i <= 4 && !Room.enemiesList.isEmpty()){
                Room.enemiesList.remove(Room.enemiesList.getFirst());
            remove();
            }
        }
    }
    @Override
    public void checkForCollisions(List<Collider> colliders) {
        Collided.super.checkForCollisions(colliders);
    }


}


