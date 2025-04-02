package com.github.hanyaeger.Brandweerman_Mark.entities.player;

import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;

import java.util.Set;
import javafx.scene.input.KeyCode;

import com.github.hanyaeger.Brandweerman_Mark.entities.Entity;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_Gun;

public class Player extends DynamicSpriteEntity implements Entity, KeyListener {

    private Water_Gun waterGun;
    private int speed;
    private int speed_boost;
    private int gold;
    private int damage;
    private int defense;
    private int hp;
    private int max_hp;
    public Player(String spritePath, Coordinate2D coordinate) {
        super(spritePath, coordinate);
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

    }