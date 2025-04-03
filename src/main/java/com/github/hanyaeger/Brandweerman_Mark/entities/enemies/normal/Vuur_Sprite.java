package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.Normal_Enemy;

public class Vuur_Sprite extends DynamicSpriteEntity implements Collider {

    private int hp;
    private int dmg;
private YaegerGame game;

    public Vuur_Sprite(Coordinate2D initialLocation, int hp, int dmg, YaegerGame game) {
        super("enemy_sprites/firesprite.png", initialLocation);
        this.hp = hp;
        this.dmg = dmg;
        this.game = game;
    }
}
