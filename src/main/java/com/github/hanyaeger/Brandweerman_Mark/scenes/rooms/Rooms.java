package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;


import com.github.hanyaeger.Brandweerman_Mark.Game;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;

import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.Enemy;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.github.hanyaeger.Brandweerman_Mark.scenes.rooms.Door;

public abstract class Rooms extends DynamicScene implements MouseButtonPressedListener {

    private int roomWidth = 960;
    private int roomHeight = 720;
    private String roomName;
    private Player player;
    private List<Enemy> enemies;  // Lijst van vijanden in de kamer
    private boolean allEnemiesDefeated = false;
    public static boolean kamerKlaar = false;
    private YaegerGame game;
    public static ArrayList<Enemy> enemiesInRoom = new ArrayList<Enemy>();

    public Rooms(YaegerGame game) {
   //     this.enemies = new ArrayList<>();
        this.game = game;
    }

    @Override
    public void setupScene() {
        setupDoor();
    }

    private void setupDoor() {
    var door = new Door(new Coordinate2D(roomWidth - 50, roomHeight - 50), game);
    addEntity(door);
    }






    @Override
    public void setupEntities() {
        addEntity(player);
    }





    public static boolean checkEnemiesDefeated() {
        kamerKlaar = false;
        if(enemiesInRoom.isEmpty())
        {
            kamerKlaar = true;
        }else{
            kamerKlaar = false;
        }
        return(kamerKlaar);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
