package com.github.hanyaeger.brandweerman_mark.entities.enemies.normal;

import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.Coordinate2D;

public class Vuur_Sprite extends Enemy implements Collider, Collided, SceneBorderTouchingWatcher {

    public Vuur_Sprite(Coordinate2D initialLocation){
        super(5, 1,"enemy_sprites/firesprite.png", initialLocation );
    }



}






