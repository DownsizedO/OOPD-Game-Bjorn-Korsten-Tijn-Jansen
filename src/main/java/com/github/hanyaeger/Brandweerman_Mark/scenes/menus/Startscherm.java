package com.github.hanyaeger.Brandweerman_Mark.scenes.menus;

import com.github.hanyaeger.Brandweerman_Mark.Game;
import com.github.hanyaeger.Brandweerman_Mark.scenes.rooms.Door;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Startscherm extends StaticScene {

    private boolean game_started = false;
    private YaegerGame game;

    public Startscherm(YaegerGame game) {
        this.game = game;
    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.LIGHTBLUE);
    }

    @Override
    public void setupEntities() {
        TextEntity titel = new TextEntity(new Coordinate2D(250, 150), "Brandweerman Mark");
        titel.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        titel.setFill(Color.DARKRED);

        StartButton startKnop = new StartButton(new Coordinate2D(300, 300), game);

        addEntity(titel);
        addEntity(startKnop);
    }

    public void startgame() {
        game_started = true;
        game.setActiveScene(1); // Naar eerste kamer (Normal_Room bijv.)
    }

    private class StartButton extends TextEntity implements MouseButtonPressedListener {
        private YaegerGame game;

        public StartButton(Coordinate2D position, YaegerGame game) {
            super(position, "Start Spel");
            this.game = game;
            setFill(Color.DARKBLUE);
            setFont(Font.font("Arial", FontWeight.BOLD, 24));
        }

        @Override
        public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate) {
                game.setActiveScene(1);

        }
    }
}
