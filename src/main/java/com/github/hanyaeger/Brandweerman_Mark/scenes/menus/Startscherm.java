package com.github.hanyaeger.Brandweerman_Mark.scenes.menus;

import com.github.hanyaeger.Brandweerman_Mark.scenes.menus.Button.StartButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;

public class Startscherm extends scherm {

    private boolean game_started = false;
    private YaegerGame game;

    public Startscherm(YaegerGame game) {
        super(game);
        this.game = game;
    }


    @Override
    public void setupEntities() {
        StartButton startKnop = new StartButton(new Coordinate2D(100, 100), game, "startspel");
        addEntity(startKnop);
    }

    public void startgame() {
        game_started = true;
        game.setActiveScene(1);
    }



}
