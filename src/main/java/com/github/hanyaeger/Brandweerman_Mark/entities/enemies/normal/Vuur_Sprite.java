package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.Normal_Enemy;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.List;

public class Vuur_Sprite extends DynamicSpriteEntity implements Collider, Collided, SceneBorderTouchingWatcher {

    private int hp;
    private int dmg;
private YaegerGame game;

    public Vuur_Sprite(Coordinate2D initialLocation, int hp, int dmg, YaegerGame game) {
        super("enemy_sprites/firesprite.png", initialLocation);
        this.hp = hp;
        this.dmg = dmg;
        this.game = game;
    }

    @Override
    public void onCollision(List<Collider> collisions) {

        if(hp > 0) {
            for (Collider WaterStream : collisions) {
                hp--;
                System.out.println("enemy collided with player");
            }
        }else {
            remove();
        }




    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {

    }
}
