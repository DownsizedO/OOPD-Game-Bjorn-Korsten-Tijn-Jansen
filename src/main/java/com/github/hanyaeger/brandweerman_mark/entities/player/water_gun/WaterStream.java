package com.github.hanyaeger.brandweerman_mark.entities.player.water_gun;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;

public class WaterStream extends DynamicSpriteEntity implements Collider, MouseButtonPressedListener {

    private YaegerGame game;
    private double speed = 10;


    public WaterStream(Coordinate2D position ,Coordinate2D coordinate2D) {
        super("player_sprites/bullet.png", position);
        this.game = game;

        angleTo(coordinate2D);

    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        setMotion(speed, angleTo(coordinate2D));
    }
}
