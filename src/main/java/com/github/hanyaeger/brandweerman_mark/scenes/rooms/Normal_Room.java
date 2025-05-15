package com.github.hanyaeger.brandweerman_mark.scenes.rooms;

import com.github.hanyaeger.brandweerman_mark.Game;
import com.github.hanyaeger.brandweerman_mark.entities.Entity;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.normal.Gooier_Aanval;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.normal.Vuur_Gooier;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;
import com.github.hanyaeger.brandweerman_mark.entities.player.water_gun.WaterStream;
import com.github.hanyaeger.brandweerman_mark.entities.player.water_gun.Water_Gun;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.normal.Vuur_Sprite;
import javafx.scene.shape.MoveTo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;


public class Normal_Room extends Room implements KeyListener, MouseMovedListener, MouseButtonPressedListener {

    private TextEntity player;
    private YaegerGame game;
    private int enemy_aantal;
    Random random = new Random();
    Random random1 = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    private int direction;
    public Water_Gun water_gun;
    long vorigeTijd;
    long interval = 1000;
    public static ArrayList<Gooier_Aanval> Aanvallist = new ArrayList<Gooier_Aanval>();


    public Normal_Room(Game game, int enemy_aantal) {
        this.enemy_aantal = enemy_aantal;
        this.game = game;


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
        var door = new Door(new Coordinate2D(getWidth() - 20, getHeight() / 2), game);
        addEntity(door);
        //TextEntity titel = new TextEntity(new Coordinate2D(getWidth()/2, getHeight()-50), toString(Player.hp));
        spawnEnemies(enemy_aantal);


    }

    private void spawnEnemies(int enemyCount) {
        Enemy enemy;
        for (int i = 0; i < enemyCount; i++) {
            int randomDirection = new Random().nextInt(3);
            Coordinate2D spawnPosition = new Coordinate2D(Math.random() * 960, Math.random() * 720);
            if (randomDirection == 1) {
                enemy = new Vuur_Sprite(spawnPosition, 10, 10, game);
            }
            if (randomDirection == 2) {
                enemy = new Vuur_Gooier(spawnPosition, 10, 10, game, this);
            } else enemy = new Vuur_Sprite(spawnPosition, 10, 10, game);
            Room.enemiesList.add(enemy);
            addEntity(enemy);
            System.out.println(Room.enemiesList);
        }
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        random2 = new Random();
        int random = random2.nextInt(2);
        if (random == 1) {
            direction = direction + 40;
        } else {
            direction = direction - 40;
        }
        for (int i = 0; i < Room.enemiesList.size(); i++) {
            Room.enemiesList.get(i).setMotion(3, direction);
        }
    }


    @Override
    public void onMouseButtonPressed() {

    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        System.out.println("mousemoved");
        for (int i = 0; i < Room.enemiesList.size(); i++) {
            Room.enemiesList.get(i).setMotion(3, direction);
        }
        long nu = System.currentTimeMillis();
        if (nu - vorigeTijd >= interval) {
            vorigeTijd = nu;
            System.out.println("Komt door de if statement heen");
            for (Enemy enemy : Normal_Room.enemiesList) {
                if (enemy instanceof Vuur_Gooier vuurGooier) {
                    float y = random.nextFloat() * 360;
                    Coordinate2D locatie = vuurGooier.getAnchorLocation();
                    var Aanval = new Gooier_Aanval(locatie, game);
                    Aanval.setMotion(3, y);
                    addEntity(Aanval);
                }
            }

        }
    }
}

