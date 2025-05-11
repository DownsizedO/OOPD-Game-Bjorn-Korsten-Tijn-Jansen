package com.github.hanyaeger.brandweerman_mark.entities.enemies.normal;

import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;
import com.github.hanyaeger.brandweerman_mark.entities.player.water_gun.WaterStream;
import com.github.hanyaeger.brandweerman_mark.scenes.rooms.Normal_Room;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;

import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.core.Updatable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vuur_Sprite extends Enemy implements Collider, Collided, SceneBorderTouchingWatcher {

    private int hp;
    private int dmg;
    private final Random random = new Random();
    public boolean move;

    private ArrayList<Vuur_Sprite> enemies;

    private YaegerGame game;

    public Vuur_Sprite(Coordinate2D initialLocation, int hp, int dmg, YaegerGame game) {
        super("enemy_sprites/firesprite.png", initialLocation);
        this.hp = hp;
        this.dmg = dmg;
        this.game = game;
        move = true;

    }

    @Override
    public void onCollision(List<Collider> collisions) {

        if (hp > 0) {
            collisions.forEach(collider -> {
                if (collider instanceof WaterStream) {

                    hp = hp - 100;
                    setMotion(10, random.nextInt(359));
                    System.out.println("enemy collided with player");
                    if (hp <= 0) {
                        Normal_Room.enemiesList.remove(Normal_Room.enemiesList.get(0));
                        remove();

                    }
                }
            });
        } else {
            Normal_Room.enemiesList.remove(Normal_Room.enemiesList.get(0));
            remove();
        }
    }

    @Override
    public void checkForCollisions(List<Collider> colliders) {
        Collided.super.checkForCollisions(colliders);
    }

    public void beweeg() {
        int timer = 1000;
        if (timer <= 1) {
            setMotion(3, random.nextInt(359));
            timer = 1000;
        } else timer--;
    }

    @Override
    public void aanval() {

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

}






