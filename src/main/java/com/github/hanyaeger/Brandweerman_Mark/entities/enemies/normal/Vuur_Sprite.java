package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream;
import com.github.hanyaeger.Brandweerman_Mark.scenes.rooms.Normal_Room;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;

import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import javafx.scene.input.KeyCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Vuur_Sprite extends DynamicSpriteEntity implements Collider, Collided, SceneBorderTouchingWatcher {

    private int hp;
    private int dmg;
    Random random = new Random();
    public boolean move;

    ArrayList<Vuur_Sprite> enemies;

    private YaegerGame game;

    public Vuur_Sprite(Coordinate2D initialLocation, int hp, int dmg, YaegerGame game) {
        super("enemy_sprites/firesprite.png", initialLocation);
        this.hp = hp;
        this.dmg = dmg;
        this.game = game;
        move =true;

    }

    @Override
    public void onCollision(List<Collider> collisions) {

        if(hp > 0) {
            if(collisions.get(0) instanceof WaterStream)
            {
                hp--;
                setMotion(10, random.nextInt(359));
                System.out.println("enemy collided with player");

            }
        }else {
            Normal_Room.enemiesList.remove(Normal_Room.enemiesList.get(0));
            remove();
        }




    }

    public void beweeg(){
        int timer = 1000;
        if(timer <= 1)
        {
            setMotion(3, random.nextInt(359));
            timer = 1000;
        }
        else
            timer--;
    }
    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        setSpeed(0);

        switch(sceneBorder){
            case TOP:
                setAnchorLocationY(3);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 3);
                break;
            case LEFT:
                setAnchorLocationX(3);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 3);
            default:
                break;
        }

    }


}






