package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class lava_ball extends DynamicSpriteEntity {

    protected lava_ball(String resource, Coordinate2D initialLocation) {
        super("enemy_sprites/fireball.png", initialLocation);
    }
}
