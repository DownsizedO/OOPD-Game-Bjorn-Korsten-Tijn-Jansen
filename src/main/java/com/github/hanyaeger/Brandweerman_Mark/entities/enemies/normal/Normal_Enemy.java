package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;

public class Normal_Enemy extends DynamicSpriteEntity {
    private YaegerGame game;
    protected Normal_Enemy(String resource, Coordinate2D initialLocation, YaegerGame game) {
        super(resource, initialLocation);
        this.game = game;
    }
}
