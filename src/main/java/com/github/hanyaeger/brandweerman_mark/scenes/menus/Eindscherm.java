package com.github.hanyaeger.brandweerman_mark.scenes.menus;

import com.github.hanyaeger.brandweerman_mark.scenes.menus.button.ExitButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;

public class Eindscherm extends Scherm {
    private YaegerGame game;

    public Eindscherm(YaegerGame game) {
        super(game);
        this.game = game;
    }
    @Override
    public void setupEntities() {
        ExitButton exitButton = new ExitButton(new Coordinate2D(100, 100), game, "afsluiten");
        addEntity(exitButton);
    }
}
