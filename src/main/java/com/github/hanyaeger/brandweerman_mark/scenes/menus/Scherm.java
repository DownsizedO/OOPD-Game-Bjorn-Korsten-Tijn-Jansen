package com.github.hanyaeger.brandweerman_mark.scenes.menus;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.scenes.StaticScene;

public class Scherm extends StaticScene {
    private boolean game_started = false;
    private YaegerGame game;

    public Scherm(YaegerGame game) {
        this.game = game;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("rooms/titlescreen.png");
    }

    @Override
    public void setupEntities() {



    }
}
