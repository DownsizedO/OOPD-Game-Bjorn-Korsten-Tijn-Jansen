package com.github.hanyaeger.Brandweerman_Mark.scenes.menus;

import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.api.YaegerGame;
import javafx.scene.paint.Color;

public class Eindscherm extends StaticScene {

    private YaegerGame game;

    public Eindscherm(YaegerGame game) {
        this.game = game;
    }

    @Override
    protected void setupScene() {
        setBackgroundColor(Color.DARKRED); // Je kunt de kleur veranderen
    }

    @Override
    protected void setupEntities() {
        // Voeg hier je entities toe (bijv. tekst of knoppen)
    }

    public void showStats() {
        // Voeg hier de logica toe om de statistieken weer te geven
    }
}
