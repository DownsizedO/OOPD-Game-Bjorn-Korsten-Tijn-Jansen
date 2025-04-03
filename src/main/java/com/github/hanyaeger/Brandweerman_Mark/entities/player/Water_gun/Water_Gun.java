package com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun;
import com.github.hanyaeger.Brandweerman_Mark.scenes.rooms.Normal_Room;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseButtonReleasedListener;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

import java.util.Set;


public class Water_Gun extends DynamicSpriteEntity implements MouseButtonPressedListener, MouseButtonReleasedListener {

    private YaegerGame game;
    Coordinate2D coordinate;
    public boolean geschoten;
    public Water_Gun(Coordinate2D position, YaegerGame game, boolean geschoten) {
        super("player_sprites/watergun.png", position); // Zet hier de juiste sprite voor de watergun
        this.game = game;
        this.coordinate = position;
        this.geschoten = false;
    }


    public void shoot(float direction) {
        com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream waterStream = new com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream(coordinate, direction);
        //Normal_Room.shot();
    }


    public boolean isGeschoten() {
        return geschoten;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        geschoten = true;
    }


    @Override
    public void onMouseButtonReleased(MouseButton mouseButton, Coordinate2D coordinate2D) {
        geschoten = false;
    }
}
