package com.github.hanyaeger.brandweerman_mark.scenes.menus.button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Button extends TextEntity implements MouseButtonPressedListener {



    public Button(Coordinate2D position, String text) {
        super(position, text);
        setFill(Color.DARKBLUE);
        setFont(Font.font("Arial", FontWeight.BOLD, 24));

    }

    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
