package com.github.hanyaeger.brandweerman_mark.entities.player.water_gun;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;

public class WaterStream extends DynamicSpriteEntity implements Collider {
    private YaegerGame game;
    private double speed = 10;

    public WaterStream(Coordinate2D position, Coordinate2D coordinate) {
        super("player_sprites/bullet.png", position);
        this.game = game;
        Coordinate2D speler = Player.currentcoords;
        Coordinate2D muis = coordinate;
        double dx = muis.getX() - speler.getX();
        double dy = muis.getY() - speler.getY();
        double angle = Math.toDegrees(Math.atan2(dx, dy));
        if (angle < 0) {
            angle += 360;
        }
        setMotion(speed, angle);
    }
}
