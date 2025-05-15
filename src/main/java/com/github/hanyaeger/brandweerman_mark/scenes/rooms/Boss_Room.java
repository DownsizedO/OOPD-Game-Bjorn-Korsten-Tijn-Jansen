package com.github.hanyaeger.brandweerman_mark.scenes.rooms;

import com.github.hanyaeger.brandweerman_mark.Game;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.boss.Boss_Projectile;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.boss.Lava_Monster;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;
import com.github.hanyaeger.brandweerman_mark.entities.player.water_gun.Water_Gun;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import java.util.Random;
import java.util.Set;

public class Boss_Room extends Room implements KeyListener, MouseMovedListener, MouseButtonPressedListener {
    private YaegerGame game;
    private int enemy_aantal;
    Random random1 = new Random();
    Random random2 = new Random();
    private int direction;
    public Water_Gun water_gun;

    public Boss_Room(Game game, int enemy_aantal){
        this.enemy_aantal = enemy_aantal;
        this.game = game;
    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.LIGHTGREEN);
        setBackgroundImage("rooms/bosser_room.png");
        direction = random1.nextInt(300);
    }



    private void spawnEnemies(int enemyCount) {
        for (int i = 0; i < enemyCount; i++) {
            Coordinate2D spawnPositionBoss = new Coordinate2D(300, 300);
            var enemy = new Lava_Monster(spawnPositionBoss);
            Room.enemiesList.add(enemy);
            addEntity(enemy);
        }
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        random2 = new Random();
        int random = random2.nextInt(2);
        if(random == 1) {
            direction = direction + 40;
        }
        else{
            direction = direction - 40;
        }
        for(int i = 0; i < Room.enemiesList.size();i++){
            Room.enemiesList.get(i).setMotion(3, direction);
        }
    }
    long vorigeTijd;
    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        for(int i = 0; i < Room.enemiesList.size();i++){
            Room.enemiesList.get(i).setMotion(3, direction);
        }
        long nu = System.currentTimeMillis();

        long interval = 1000;
        if (nu - vorigeTijd >= interval) {
            vorigeTijd = nu;
            boss_attack();
        }
    }

    @Override
    public void setupEntities() {
        var player = new Player(new Coordinate2D(0, 0), game);
        addEntity(player);
        var water_gun = new Water_Gun(player.playerCoords(), game);
        addEntity(water_gun);
        var door = new Door(new Coordinate2D(getWidth() - 20, getHeight()/2), game);
        addEntity(door);
        spawnEnemies(enemy_aantal);
    }


    public void boss_attack() {
        if(!Normal_Room.enemiesList.isEmpty()){
        var fireball = new Boss_Projectile(new Coordinate2D(Math.random() * 960, Math.random() * 720), game);
        addEntity(fireball);
        }
    }
}

