package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import java.util.ArrayList;
import java.util.List;

import com.github.hanyaeger.Brandweerman_Mark.Game;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;
import com.github.hanyaeger.Brandweerman_Mark.entities.upgrades.Upgrade;
import com.github.hanyaeger.Brandweerman_Mark.scenes.rooms.Rooms;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.userinput.KeyListener;



public class Shop extends DynamicScene {

    private Game game;

    public Shop(Game game) {
        this.game = game;  // Sla de Game instantie op
    }

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities() {

    }
}