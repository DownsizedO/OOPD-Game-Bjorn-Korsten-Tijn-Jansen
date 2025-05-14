package com.github.hanyaeger.brandweerman_mark.entities.enemies.normal;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;

public class Gooier_Aanval extends DynamicSpriteEntity implements Collider  {
    private YaegerGame game;
    private double speed = 10;


    public Gooier_Aanval(Coordinate2D position) {
        super("player_sprites/bullet.png", position);
        this.game = game;
        setMotion(3, angleTo(Player.currentcoords));
    }



}
