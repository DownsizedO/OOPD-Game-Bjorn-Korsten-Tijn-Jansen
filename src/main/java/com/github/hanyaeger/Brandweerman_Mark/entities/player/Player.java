package com.github.hanyaeger.Brandweerman_Mark.entities.player;

import com.github.hanyaeger.Brandweerman_Mark.Game;
import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.Enemy;

import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal.Vuur_Sprite;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.Coordinate2D;
import java.util.List;
import java.util.Set;

import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import javafx.scene.input.KeyCode;
import com.github.hanyaeger.Brandweerman_Mark.entities.Entity;
import javafx.scene.input.MouseButton;

public class Player extends DynamicSpriteEntity implements Entity, KeyListener, Collider, Collided, SceneBorderTouchingWatcher, MouseMovedListener, MouseButtonPressedListener {

    private Saucijzen_Broodje Saucijzen_Broodje;
    private static int speed;
    private static int speed_boost;
    private static int gold;
    private static int damage;
    private static int defense;
    public static int hp;
    private static int max_hp;
    private YaegerGame game;
    public boolean mousepressed;
    public static Coordinate2D currentcoords;


    public Coordinate2D coordinate;
    public Player(Coordinate2D coordinate, YaegerGame game) {
        super("player_sprites/brandweerman_mark.png", coordinate);
        this.game = game;
        this.hp = 10;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        int Movement_Speed = 8;
        currentcoords = getLocationInScene();

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

    public Coordinate2D getCoordinate() {
        return currentcoords;
    }
    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        setSpeed(0);

        switch(sceneBorder){
            case TOP:
                setAnchorLocationY(1);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
                break;
            case LEFT:
                setAnchorLocationX(1);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 1);
            default:
                break;
        }

    }
    public Coordinate2D playerCoords(){
        return getLocationInScene();
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {

    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        mousepressed = true;
    }

    @Override
    public void onCollision(List<Collider> list) {
        if (list.get(0) instanceof Vuur_Sprite) {
            Player.hp--;
            System.out.println("hp-1");
            if(hp <= 0){
                game.setActiveScene(100);
            }
        }
    }
}