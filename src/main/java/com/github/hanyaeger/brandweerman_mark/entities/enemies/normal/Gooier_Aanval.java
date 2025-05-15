package com.github.hanyaeger.brandweerman_mark.entities.enemies.normal;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;
import java.util.List;
import static com.github.hanyaeger.brandweerman_mark.entities.player.Player.hp;

public class Gooier_Aanval extends DynamicSpriteEntity implements Collider, Collided {
    private YaegerGame game;

    public Gooier_Aanval(Coordinate2D position, YaegerGame game) {
        super("enemy_sprites/bullet.png", position);
        this.game = game;
        setMotion(5, angleTo(Player.currentcoords));
    }

    public void onCollision(List<Collider> list) {
        if (list.get(0) instanceof Player) {
            hp--;
            System.out.println("hp-1");
            if(hp <= 0){
                Player.isLevend = false;

                game.setActiveScene(100);
            }
        }
    }
}
