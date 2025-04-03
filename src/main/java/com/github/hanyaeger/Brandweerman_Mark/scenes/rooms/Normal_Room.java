package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.Brandweerman_Mark.Game;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.Water_Gun;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.DynamicTextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import org.checkerframework.checker.units.qual.C;

import java.util.Set;

public class Normal_Room extends DynamicScene implements KeyListener {

    private TextEntity player;
    private YaegerGame game;

    public Normal_Room(Game game)
    {
        this.game = game;

    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.LIGHTGREEN);
        var player = new Player(new Coordinate2D(200, 200));
        addEntity(player);
    }

    @Override
    public void setupEntities() {
        var door = new Door(new Coordinate2D(100, 100), game);
        addEntity(door);
        var bullet = new WaterStream(new Coordinate2D(100, 100), 90);
        addEntity(bullet);
//        if(Water_Gun.isGeschoten()){ addEntity(bullet);}
//        else{}
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {

    }
}
