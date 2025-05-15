package com.github.hanyaeger.brandweerman_mark.scenes.rooms;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.brandweerman_mark.entities.player.water_gun.WaterStream;
import javafx.scene.input.MouseButton;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;
import java.util.ArrayList;


public abstract class Room extends DynamicScene implements MouseButtonPressedListener {

    private int roomWidth = 960;
    private int roomHeight = 720;
    public static boolean kamerKlaar = false;
    private YaegerGame game;
    public static ArrayList<Enemy> enemiesList = new ArrayList<Enemy>();

    public Room() {
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
    }

    public static boolean checkEnemiesDefeated() {
        kamerKlaar = false;
        if(enemiesList.isEmpty())
        {
            kamerKlaar = true;
        }else{
            kamerKlaar = false;
        }
        return(kamerKlaar);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate) {
        var waterstream = new WaterStream(Player.currentcoords, coordinate );
        addEntity(waterstream);


    }


}