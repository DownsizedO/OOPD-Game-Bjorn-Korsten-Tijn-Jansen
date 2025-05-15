package com.github.hanyaeger.brandweerman_mark.scenes.menus.button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import javafx.scene.input.MouseButton;


public class ExitButton extends Button {
    private YaegerGame game;
    public ExitButton(Coordinate2D position, YaegerGame game, String text) {
        super(position, text);
        this.game = game;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate) {
        game.setActiveScene(1);

    }
}
