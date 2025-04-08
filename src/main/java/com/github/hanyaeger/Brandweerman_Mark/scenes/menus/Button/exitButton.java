package com.github.hanyaeger.Brandweerman_Mark.scenes.menus.Button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class exitButton extends Button {
    YaegerGame game;
    public exitButton(Coordinate2D position, YaegerGame game, String text) {
        super(position, game, text);
        this.game = game;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate) {
        game.setActiveScene(1);

    }
}
