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





    public Door(Coordinate2D position) {
        super("rooms/door.png", position);
        this.game = game;


    }


    public void goToNextRoom() {
        Game.kamer++;
        game.setActiveScene(Game.kamer);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        if (Rooms.checkEnemiesDefeated()) {
            goToNextRoom();

        }
    }



}

