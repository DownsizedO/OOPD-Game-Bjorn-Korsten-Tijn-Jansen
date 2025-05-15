package com.github.hanyaeger.brandweerman_mark.entities.enemies.boss;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;

public class Lava_Monster extends Enemy implements SceneBorderTouchingWatcher, Collider, Collided {

    public Lava_Monster(int hp, int damage, Coordinate2D location) {
        super(1000, 5, "enemy_sprites/lava_monster.png", location);
    }


    public void boss_attack()
    {


    }
}


