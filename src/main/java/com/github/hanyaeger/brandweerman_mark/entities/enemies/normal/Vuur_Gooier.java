package com.github.hanyaeger.brandweerman_mark.entities.enemies.normal;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;

    public class Vuur_Gooier extends Enemy implements Collider, Collided, SceneBorderTouchingWatcher {

        public Coordinate2D coordinate;
        private YaegerGame game;
        DynamicScene scene;
        public Vuur_Gooier(Coordinate2D coordinate, YaegerGame game, DynamicScene scene) {
            super(1, 1,"enemy_sprites/vlammen_werper.png", coordinate );
            this.coordinate = coordinate;
            this.game = game;
            this.scene = scene;
        }
    }

