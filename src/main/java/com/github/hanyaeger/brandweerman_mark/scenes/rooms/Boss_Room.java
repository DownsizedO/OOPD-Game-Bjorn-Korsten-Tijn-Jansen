package com.github.hanyaeger.brandweerman_mark.scenes.rooms;

import com.github.hanyaeger.brandweerman_mark.Game;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.boss.Boss_Projectile;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.boss.Lava_Monster;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;
import com.github.hanyaeger.brandweerman_mark.entities.player.water_gun.Water_Gun;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.Random;
import java.util.Set;

public class Boss_Room extends Room implements KeyListener, MouseMovedListener, MouseButtonPressedListener {
    private TextEntity player;
    private YaegerGame game;
    private int enemy_aantal;
    Random random = new Random();
    Random random1 = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
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
            var enemy = new Lava_Monster(10, 10, spawnPositionBoss);
            Room.enemiesList.add(enemy);
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
        for(int i = 0; i < Room.enemiesList.size();i++){
            Room.enemiesList.get(i).setMotion(3, direction);
        }
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        for(int i = 0; i < Room.enemiesList.size();i++){
            Room.enemiesList.get(i).setMotion(3, direction);
        }


    }

    @Override
    public void onMouseButtonPressed() {

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


    public void boss_attack()
    {
        for(int i = 1; i < 4; i++)
        {
            var fireball = new Boss_Projectile("enemy_sprites/fireball.png", new Coordinate2D(getWidth()/i,0));
            addEntity(fireball);
        }
    }
}

