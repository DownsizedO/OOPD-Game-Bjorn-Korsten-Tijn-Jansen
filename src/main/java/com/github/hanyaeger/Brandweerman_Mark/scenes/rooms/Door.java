package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.api.entities.impl.DynamicRectangleEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.YaegerGame;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import com.github.hanyaeger.Brandweerman_Mark.Game;

public class Door extends DynamicSpriteEntity implements MouseButtonPressedListener {

    private YaegerGame game;


    private static int kamer = 0;

    public Door(Coordinate2D position) {
        super("room/door.png", position);
        this.game = game;

    }



    public void goToNextRoom() {
        kamer++;
        game.setActiveScene(kamer);
    }
    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        if(Rooms.checkEnemiesDefeated()){
        goToNextRoom();

        }
    }
    public static int getKamer() {
        return kamer;
    }
}

