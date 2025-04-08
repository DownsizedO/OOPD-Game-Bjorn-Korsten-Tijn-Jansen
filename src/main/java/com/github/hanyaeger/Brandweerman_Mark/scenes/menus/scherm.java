package com.github.hanyaeger.Brandweerman_Mark.scenes.menus;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class scherm extends StaticScene {
    private boolean game_started = false;
    private YaegerGame game;

    public scherm(YaegerGame game) {
        this.game = game;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("rooms/titlescreen.png");
    }

    @Override
    public void setupEntities() {



    }
}
