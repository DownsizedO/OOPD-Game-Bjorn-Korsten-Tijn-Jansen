package com.github.hanyaeger.Brandweerman_Mark.scenes.menus.Button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Optional;

public class Button extends TextEntity implements MouseButtonPressedListener {
    YaegerGame game;
    public Button(Coordinate2D position, YaegerGame game2, String text) {
        super(position, text);
        this.game = game;
        setFill(Color.DARKBLUE);
        setFont(Font.font("Arial", FontWeight.BOLD, 24));

    }


    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
