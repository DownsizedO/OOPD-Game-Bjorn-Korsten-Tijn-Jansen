package com.github.hanyaeger.brandweerman_mark.entities.enemies.boss;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;
import java.util.List;
import static com.github.hanyaeger.brandweerman_mark.entities.player.Player.hp;

public class Boss_Projectile extends DynamicSpriteEntity implements Collider, Collided {
    private final YaegerGame game;

    public Boss_Projectile(Coordinate2D initialLocation, YaegerGame game) {
        super("enemy_sprites/fireball.png", initialLocation);
        this.game = game;
    }


    @Override
    public void onCollision(List<Collider> list) {
        if (list.getFirst() instanceof Player) {
            hp--;
            if(hp <= 0){
                Player.isLevend = false;

                game.setActiveScene(100);
            }
        }
    }
}
