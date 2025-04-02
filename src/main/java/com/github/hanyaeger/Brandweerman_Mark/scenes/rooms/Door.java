package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.api.entities.impl.DynamicRectangleEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.YaegerGame;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import com.github.hanyaeger.Brandweerman_Mark.Game;

public class Door extends DynamicRectangleEntity implements MouseButtonPressedListener {

    private YaegerGame game;

    public Door(Coordinate2D position, YaegerGame game) {
        super(position);
        this.game = game;
        setFill(Color.RED);
    }

    public Door(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    public void goToNextRoom() {
        kamer++;
        Game.setActiveScene(kamer);
    }
    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        if(Rooms.checkEnemiesDefeated()){
        Game.goToNextRoom();
        Game.setActiveScene(Kamer);
        }
    }
}
