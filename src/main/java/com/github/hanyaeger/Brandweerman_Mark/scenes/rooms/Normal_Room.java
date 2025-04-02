package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.DynamicTextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.Set;

public class Normal_Room extends DynamicScene implements KeyListener {

    private TextEntity player;

    @Override
    public void setupScene() {
        setBackgroundColor(Color.LIGHTGREEN);

        // Voeg de speler toe aan de kamer
        var player = new Player(new Coordinate2D(200, 200));
        addEntity(player);
    }

    @Override
    public void setupEntities() {

    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {

    }
}
