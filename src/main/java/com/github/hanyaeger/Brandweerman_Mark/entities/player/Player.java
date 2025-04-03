package com.github.hanyaeger.Brandweerman_Mark.entities.player;

import com.github.hanyaeger.Brandweerman_Mark.Game;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.Water_Gun;

import java.util.List;
import java.util.Set;
import javafx.scene.input.KeyCode;
import com.github.hanyaeger.Brandweerman_Mark.entities.Entity;

public class Player extends DynamicSpriteEntity implements Entity, KeyListener, Collider, Collided {

    private Saucijzen_Broodje Saucijzen_Broodje;
    private static int speed;
    private static int speed_boost;
    private static int gold;
    private static int damage;
    private static int defense;
    private static int hp;
    private static int max_hp;
    private YaegerGame game;


    public Coordinate2D coordinate;
    public Player(Coordinate2D coordinate) {
        super("player_sprites/brandweerman_mark.png", coordinate);
        this.game = game;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        int Movement_Speed = 8;

        if(pressedKeys.contains(KeyCode.A) || pressedKeys.contains(KeyCode.LEFT)){
            if(pressedKeys.contains(KeyCode.W) || pressedKeys.contains(KeyCode.UP))
            {
                setMotion(Movement_Speed, 225d);
            }else if(pressedKeys.contains(KeyCode.S) || pressedKeys.contains(KeyCode.DOWN))
            {
                setMotion(Movement_Speed, 315);

            }else{setMotion(Movement_Speed, 270d);}
        } else if(pressedKeys.contains(KeyCode.D) || pressedKeys.contains(KeyCode.RIGHT))
        {
            if(pressedKeys.contains(KeyCode.W) || pressedKeys.contains(KeyCode.UP))
            {
                setMotion(Movement_Speed, 135);
            }else if(pressedKeys.contains(KeyCode.S) || pressedKeys.contains(KeyCode.DOWN)){
                setMotion(Movement_Speed, 45);
            }
            else{
                setMotion(Movement_Speed,90d);
            }} else if(pressedKeys.contains(KeyCode.W) || pressedKeys.contains(KeyCode.UP))
        {
            setMotion(Movement_Speed,180d);
        } else if(pressedKeys.contains(KeyCode.S) || pressedKeys.contains(KeyCode.DOWN)){
            setMotion(Movement_Speed,0d);
        }
        else if(pressedKeys.isEmpty()){
            setSpeed(0);
        }
        if (pressedKeys.contains(KeyCode.SPACE)) {
            Coordinate2D start = coordinate;
           // Water_Gun.shoot(90);
        }
//start, getRotation(), 4 ,4

    }
    @Override
    public void aanval() {}

    @Override
    public void Neem_Schade(int schade) {}

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    public Coordinate2D getCoordinate() {
        return coordinate;
    }

    @Override
    public void onCollision(List<Collider> list) {
        System.out.println("collision");

    }
}