package com.github.hanyaeger.Brandweerman_Mark.entities.enemies;

import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;

public class Normal_Enemy extends DynamicSpriteEntity {

    protected Normal_Enemy(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }
}
