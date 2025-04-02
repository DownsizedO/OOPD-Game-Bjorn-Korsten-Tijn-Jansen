package com.github.hanyaeger.tutorial.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.Brandweerman_Mark;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;



public class StartButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener
{

    private Brandweerman_Mark brandweermanMark;

    public StartButton(Coordinate2D initialLocation, String start, Brandweerman_Mark brandweermanMark)
    {
        super(initialLocation, "Play game");
        this.brandweermanMark = brandweermanMark;
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 100));

    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        brandweermanMark.setActiveScene(1);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.VIOLET);
        setCursor(Cursor.HAND);

    }

    @Override
    public void onMouseExited() {
        setFill(Color.PURPLE);
        setCursor(Cursor.DEFAULT);
    }
}
