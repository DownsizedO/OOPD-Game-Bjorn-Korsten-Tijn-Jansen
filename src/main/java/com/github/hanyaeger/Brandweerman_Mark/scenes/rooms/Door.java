package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.boss.Lava_Monster;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicRectangleEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.YaegerGame;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import com.github.hanyaeger.Brandweerman_Mark.Game;


public class Door extends DynamicSpriteEntity implements MouseButtonPressedListener, Collider {

    private YaegerGame game;





    public Door(Coordinate2D position, YaegerGame game) {
        super("rooms/door.png", position);
        this.game = game;
    }

    public void RoomGeneration(){
        int typeKamer = (Game.kamer % 6) + 1;
        switch (typeKamer) {
            case 1:
                game.addScene(Game.kamer+6, new Normal_Room((Game) game, (Game.kamer *2)));  // Normale kamer
                break;
            case 2:
                game.addScene(Game.kamer+6, new Normal_Room((Game) game, (Game.kamer *2)));  // Normale kamer 2
                break;
            case 3:
                game.addScene(Game.kamer+6, new Normal_Room((Game) game, (Game.kamer *2)));  // Normale kamer 3
                break;
            case 4:
                game.addScene(Game.kamer+6, new Normal_Room((Game) game, (Game.kamer *2)));  // Normale kamer 4
                break;
            case 5:
                game.addScene(Game.kamer+6, new Boss_Room((Game) game));  // Boss kamer
                break;
            case 6:
                game.addScene(Game.kamer+6, new Treasure_Room( (Game) game));  // Treasure kamer
                break;
        }
    }
    public void goToNextRoom() {
        Game.kamer++;
        game.setActiveScene(Game.kamer);
        RoomGeneration();
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        if (Rooms.checkEnemiesDefeated()) {
            goToNextRoom();

        }
    }



}

