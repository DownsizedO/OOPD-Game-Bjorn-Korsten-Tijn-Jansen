package com.github.hanyaeger.brandweerman_mark.entities.enemies.normal;

import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.Coordinate2D;
import java.util.ArrayList;
import java.util.Random;

public class Vuur_Sprite extends Enemy implements Collider, Collided, SceneBorderTouchingWatcher {

    private int hp;
    private int dmg;
    private final Random random = new Random();
    public boolean move;
    private Coordinate2D coordinate;
    private ArrayList<Vuur_Sprite> enemies;

    private YaegerGame game;

    public Vuur_Sprite(Coordinate2D initialLocation, int hp, int dmg, YaegerGame game) {
        super(5, 1,"enemy_sprites/firesprite.png", initialLocation );
    }
}






