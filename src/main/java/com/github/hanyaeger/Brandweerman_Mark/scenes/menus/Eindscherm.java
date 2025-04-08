package com.github.hanyaeger.Brandweerman_Mark.scenes.menus;

import com.github.hanyaeger.Brandweerman_Mark.scenes.menus.Button.StartButton;
import com.github.hanyaeger.Brandweerman_Mark.scenes.menus.Button.exitButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;

public class Eindscherm extends scherm {
    private YaegerGame game;

    public Eindscherm(YaegerGame game) {
        super(game);
        this.game = game;
    }
    @Override
    public void setupEntities() {
        exitButton exitButton = new exitButton(new Coordinate2D(100, 100), game, "afsluiten");
        addEntity(exitButton);
    }
}
