package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;

import javafx.scene.input.MouseButton;

public class Vuurwerk_Werper extends DynamicSpriteEntity implements MouseButtonPressedListener {

    private YaegerGame game;
    protected Vuurwerk_Werper(String resource, Coordinate2D initialLocation, YaegerGame game) {
        super(resource, initialLocation);
        this.game = game;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
