package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.Brandweerman_Mark.Game;
import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.Enemy;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.Water_Gun;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.DynamicTextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.google.errorprone.annotations.Var;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import org.checkerframework.checker.units.qual.C;
import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal.Vuur_Sprite;
import java.util.Set;


public class Normal_Room extends DynamicScene implements KeyListener {

    private TextEntity player;
    private YaegerGame game;
    private int enemy_aantal;


    public Normal_Room(Game game, int enemy_aantal)
    {
        this.game = game;
        this.enemy_aantal = enemy_aantal;


    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.LIGHTGREEN);

    }

    @Override
    public void setupEntities() {
        var player = new Player(new Coordinate2D(200, 200));
        addEntity(player);
        var water_gun = new Water_Gun(player.playerCoords(), game);
        addEntity(water_gun);
        var door = new Door(new Coordinate2D(100, 100), game);
        addEntity(door);
        var vuur_sprite1 = new Vuur_Sprite(new Coordinate2D(100, 100), 10, 5, game);
        addEntity(vuur_sprite1);
        var vuur_sprite2 = new Vuur_Sprite(new Coordinate2D(200, 100), 10, 5, game);
        addEntity(vuur_sprite2);
        var vuur_sprite3 = new Vuur_Sprite(new Coordinate2D(300, 200), 10, 5, game);
        addEntity(vuur_sprite3);
        if(Water_Gun.isGeschoten()){
            var waterstream = new WaterStream(water_gun.GunCoords(), 90);
            addEntity(waterstream);
        }
        spawnEnemies(enemy_aantal);



//        if(Water_Gun.isGeschoten()){ addEntity(bullet);}
//        else{}
//        int h = 0;
//        for(int i = 0; i < enemy_aantal; i++) {
//            int j = i;
//            int k = i;
//            (i.toString()) = new Vuur_Sprite(new Coordinate2D(50 * j, 50 * j), 10, 5, game);
//            addEntity(i.toString());
//
//
//        }

    }
    private void spawnEnemies(int enemyCount) {
        // Maak een loop om een aantal vijanden te spawnen
        for (int i = 0; i < enemyCount; i++) {
            // Bepaal de spawnlocatie voor elke vijand
            Coordinate2D spawnPosition = new Coordinate2D(Math.random() * 960, Math.random() * 720); // Willekeurige posities

            // Maak een nieuwe vijand
            Vuur_Sprite enemy = new Vuur_Sprite(spawnPosition, 10, 10, game);

            // Voeg de vijand toe aan de scène
            addEntity(enemy);
        }
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {

    }
}



