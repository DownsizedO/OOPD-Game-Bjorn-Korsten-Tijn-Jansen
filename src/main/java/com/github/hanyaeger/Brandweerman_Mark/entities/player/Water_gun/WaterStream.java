package com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;

public class WaterStream extends DynamicSpriteEntity {
    YaegerGame game;
    private double speed = 10;
    private double direction;


    public WaterStream(Coordinate2D position, double direction) {
        super("player_sprites/bullet.png", position);
        this.direction = direction;
        setMotion(speed, direction);
        this.game = game;
    }
}
