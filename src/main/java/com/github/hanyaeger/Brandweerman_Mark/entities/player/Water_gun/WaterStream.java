package com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseMovedListener;

public class WaterStream extends DynamicSpriteEntity implements Collider, MouseMovedListener {
    YaegerGame game;
    private double speed = 10;


    public WaterStream(Coordinate2D position) {
        super("player_sprites/bullet.png", position);
        this.game = game;
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        setMotion(4, angleTo(coordinate2D));
    }
}
