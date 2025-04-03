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

public class Eindscherm extends StaticScene {

    private boolean game_started = false;
    private YaegerGame game;

    public Eindscherm(YaegerGame game) {
        this.game = game;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("rooms/titlescreen.png");
    }

    @Override
    public void setupEntities() {


        StartButton startKnop = new StartButton(new Coordinate2D(100, 100), game);
        addEntity(startKnop);
    }

    public void startgame() {
        game_started = true;
        game.setActiveScene(1);
    }

    private class StartButton extends TextEntity implements MouseButtonPressedListener {
        private YaegerGame game2;

        public StartButton(Coordinate2D position, YaegerGame game2) {
            super(position, "Exit");
            this.game2 = game2;
            setFill(Color.DARKBLUE);
            setFont(Font.font("Arial", FontWeight.BOLD, 24));

        }

        @Override
        public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate) {
            game2.setActiveScene(1);
            System.exit(69);
        }
    }
}
