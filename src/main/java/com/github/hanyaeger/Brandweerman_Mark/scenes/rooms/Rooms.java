package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;


import com.github.hanyaeger.Brandweerman_Mark.Game;
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

public class Rooms extends DynamicScene implements MouseButtonPressedListener {

    private int roomWidth = 960;
    private int roomHeight = 720;
    private String roomName;
    private Player player;
    private List<Enemy> enemies;  // Lijst van vijanden in de kamer
    private boolean allEnemiesDefeated = false;
    public static boolean kamerKlaar = false;

    public static ArrayList<Enemy> enemiesInRoom = new ArrayList<Enemy>();

    public Rooms(String roomName, Player player) {
        this.roomName = roomName;
        this.player = player;
        this.enemies = new ArrayList<>();
    }

    @Override
    public void setupScene() {
        setupDoor();
        setupEnemies();
    }

    private void setupDoor() {
    var door = new Door(new Coordinate2D(roomWidth - 50, roomHeight - 50));
    addEntity(door);
    }


    private void setupEnemies() {
//        Enemy enemy1 = new Enemy(new Coordinate2D(200, 300));
//        Enemy enemy2 = new Enemy(new Coordinate2D(400, 500));
//        enemies.add(enemy1);
//        enemies.add(enemy2);
//        addEntity(enemy1);
//        addEntity(enemy2);
    }

    @Override
    public void setupEntities() {
        addEntity(player);
    }

//    private void goToNextRoom() {
//        if (allEnemiesDefeated) {
//            //Game.setActiveScene(2);  // Hier zou je de juiste scene-id instellen
//        }
//    }



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
