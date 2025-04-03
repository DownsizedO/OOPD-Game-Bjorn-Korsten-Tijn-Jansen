package com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;

public class WaterStream extends DynamicSpriteEntity {
    YaegerGame game;
    private double speed = 10; // Snelheid van de waterstraal
    private double direction; // De richting waarin de waterstraal beweegt


    public WaterStream(Coordinate2D position, double direction) {
        super("path_to_water_stream_image.png", position);
        this.direction = direction;
        setMotion(speed, direction);
        this.game = game;
    }
}
