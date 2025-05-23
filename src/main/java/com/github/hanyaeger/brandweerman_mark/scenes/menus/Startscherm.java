package com.github.hanyaeger.brandweerman_mark.scenes.menus;

import com.github.hanyaeger.brandweerman_mark.scenes.menus.button.StartButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;

public class Startscherm extends Scherm {

    private YaegerGame game;

    public Startscherm(YaegerGame game) {
        this.game = game;
    }


    @Override
    public void setupEntities() {
        StartButton startKnop = new StartButton(new Coordinate2D(100, 100), game, "startspel");
        addEntity(startKnop);
    }
}
