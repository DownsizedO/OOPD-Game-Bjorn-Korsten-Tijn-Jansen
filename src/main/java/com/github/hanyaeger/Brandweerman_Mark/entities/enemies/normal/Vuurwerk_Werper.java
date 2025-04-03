package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;

import javafx.scene.input.MouseButton;

public class Vuurwerk_Werper extends DynamicSpriteEntity implements MouseButtonPressedListener {


    protected Vuurwerk_Werper(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
