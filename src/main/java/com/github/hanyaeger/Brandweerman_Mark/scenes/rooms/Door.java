package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.Brandweerman_Mark.Game;

import java.util.List;


public class Door extends DynamicSpriteEntity implements Collider, Collided {

    private YaegerGame game;





    public Door(Coordinate2D position, YaegerGame game) {
        super("rooms/door.png", position);
        this.game = game;
    }

    public void RoomGeneration(){
        int typeKamer = (Game.kamer % 4) + 1;
        switch (typeKamer) {
            case 1:
                game.addScene(Game.kamer+4, new Normal_Room((Game) game, (Game.kamer *2)));  // Normale kamer
                break;
            case 2:
                game.addScene(Game.kamer+4, new Normal_Room((Game) game, (Game.kamer *2)));  // Normale kamer 2
                break;
            case 3:
                game.addScene(Game.kamer+4, new Normal_Room((Game) game, (Game.kamer *2)));  // Normale kamer 3
                break;
            case 4:
                game.addScene(Game.kamer+4, new Normal_Room((Game) game, (Game.kamer *2)));  // Normale kamer 4
                break;
        }
    }
    public void goToNextRoom() {
        Game.kamer++;
        game.setActiveScene(Game.kamer);
        RoomGeneration();
    }




    @Override
    public void onCollision(List<Collider> list) {
        if(Normal_Room.enemiesList.isEmpty())
        {
            goToNextRoom();
        }

    }
}


