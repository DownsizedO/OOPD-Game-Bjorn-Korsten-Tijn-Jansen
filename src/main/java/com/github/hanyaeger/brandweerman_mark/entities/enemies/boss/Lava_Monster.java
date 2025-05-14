package com.github.hanyaeger.brandweerman_mark.entities.enemies.boss;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;

public class Lava_Monster extends Enemy implements SceneBorderTouchingWatcher {

    public Lava_Monster(int hp, int damage, Coordinate2D location) {
        super(100, 5, "enemy_sprites/firesprite.png", location);
    }
}
