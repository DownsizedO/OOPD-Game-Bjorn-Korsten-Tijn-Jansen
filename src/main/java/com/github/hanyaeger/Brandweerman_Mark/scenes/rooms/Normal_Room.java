package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.Brandweerman_Mark.Game;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.Water_Gun;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal.Vuur_Sprite;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;


public class Normal_Room extends Rooms implements KeyListener, MouseMovedListener, MouseButtonPressedListener {

    private TextEntity player;
    private YaegerGame game;
    private int enemy_aantal;
    Random random = new Random();
    Random random1 = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    private int direction;
    public Water_Gun water_gun;

    public Normal_Room(Game game, int enemy_aantal)
    {
        super(game);
        this.enemy_aantal = enemy_aantal;


    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.LIGHTGREEN);
        setBackgroundImage("backgrounds/normal_room.png");
        direction = random1.nextInt(300);

    }

    @Override
    public void setupEntities() {
        var player = new Player(new Coordinate2D(0, 0), game);
        addEntity(player);
        var water_gun = new Water_Gun(player.playerCoords(), game);
        addEntity(water_gun);
        var door = new Door(new Coordinate2D(getWidth() - 20, getHeight()/2), game);
        addEntity(door);
        //TextEntity titel = new TextEntity(new Coordinate2D(getWidth()/2, getHeight()-50), toString(Player.hp));




        spawnEnemies(enemy_aantal);


    }
    public static ArrayList<Vuur_Sprite> enemiesList = new ArrayList<>();
    private void spawnEnemies(int enemyCount) {
        for (int i = 0; i < enemyCount; i++) {
            Coordinate2D spawnPosition = new Coordinate2D(Math.random() * 960, Math.random() * 720);
            var enemy = new Vuur_Sprite(spawnPosition, 10, 10, game);
            enemiesList.add(enemy);
            addEntity(enemy);
        }
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        random2 = new Random();
        int random = random2.nextInt(2);
        if(random == 1)
        {
            direction = direction + 40;
        }
        else
        {
            direction = direction - 40;
        }
        for(int i = 0; i < enemiesList.size();i++){
            enemiesList.get(i).setMotion(3, direction);
        }
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        for(int i = 0; i < enemiesList.size();i++){
            enemiesList.get(i).setMotion(3, direction);
        }


    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        var waterstream = new WaterStream(Player.currentcoords);
        addEntity(waterstream);
    }
}


