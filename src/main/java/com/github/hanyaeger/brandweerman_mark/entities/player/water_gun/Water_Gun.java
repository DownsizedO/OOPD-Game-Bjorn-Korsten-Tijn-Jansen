package com.github.hanyaeger.brandweerman_mark.entities.player.water_gun;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseButtonReleasedListener;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

import java.util.Set;


public class Water_Gun extends DynamicSpriteEntity implements MouseButtonPressedListener, MouseButtonReleasedListener, KeyListener, SceneBorderTouchingWatcher {

    private YaegerGame game;
    private Coordinate2D coordinate;
    public static boolean geschoten;
    public Coordinate2D muiscoords;


    public Water_Gun(Coordinate2D position, YaegerGame game) {
        super("player_sprites/watergun.png", position);
        this.game = game;
        this.coordinate = position;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        muiscoords = coordinate2D;
        geschoten = true;
    }


    @Override
    public void onMouseButtonReleased(MouseButton mouseButton, Coordinate2D coordinate2D) {
        geschoten = false;
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
        }
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
}
