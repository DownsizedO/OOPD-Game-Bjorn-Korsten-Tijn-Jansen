package com.github.hanyaeger.brandweerman_mark.entities.enemies.normal;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.brandweerman_mark.entities.enemies.Enemy;
import com.github.hanyaeger.brandweerman_mark.scenes.rooms.Normal_Room;

import java.util.ArrayList;
import java.util.Random;


    public class Vuur_Gooier extends Enemy implements Collider, Collided, SceneBorderTouchingWatcher {

        private int hp;
        private int dmg;
        private final Random random = new Random();
        public boolean move;
        public Coordinate2D coordinate;
        private ArrayList<com.github.hanyaeger.brandweerman_mark.entities.enemies.normal.Vuur_Sprite> enemies;
        public static ArrayList<Gooier_Aanval> Aanvallist = new ArrayList<Gooier_Aanval>();
        private YaegerGame game;
        DynamicScene scene;
        public Vuur_Gooier(Coordinate2D coordinate, int hp, int dmg, YaegerGame game, DynamicScene scene) {
            super(1, 1,"enemy_sprites/vlammen_werper.png", coordinate );
            this.coordinate = coordinate;
            this.game = game;
            this.scene = scene;
        }

        public void Aanval(Coordinate2D target) {
           var Gooier_Aanval= new Gooier_Aanval(this.coordinate);
            Normal_Room.Aanvallist.add(Gooier_Aanval);
        }

    }

