package com.github.hanyaeger.brandweerman_mark.entities.enemies.boss;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Boss_Projectile extends DynamicSpriteEntity {
    public Boss_Projectile(Coordinate2D initialLocation) {
        super("enemy_sprites/firesprite.png", initialLocation);

    }
}
