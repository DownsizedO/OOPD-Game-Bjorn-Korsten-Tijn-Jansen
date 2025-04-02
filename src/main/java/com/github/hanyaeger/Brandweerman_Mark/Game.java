package com.github.hanyaeger.Brandweerman_Mark;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.Size;

import com.github.hanyaeger.Brandweerman_Mark.scenes.menus.Startscherm;
import com.github.hanyaeger.Brandweerman_Mark.scenes.menus.Eindscherm;
import com.github.hanyaeger.Brandweerman_Mark.scenes.rooms.Normal_Room;
import com.github.hanyaeger.Brandweerman_Mark.scenes.rooms.Rooms;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;

import java.util.List;

public class Game extends YaegerGame {

    private Startscherm startScreen;
    private Eindscherm endScreen;
    private List<Rooms> rooms;
    private Player _player;
    private int ronde;
    private int winst_level;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Brandweerman Mark");
        setSize(new Size(960, 720));
    }

    @Override
    public void setupScenes() {
        startScreen = new Startscherm(this);
        endScreen = new Eindscherm(this);

        addScene(0, startScreen);
        addScene(1, new Normal_Room());
        addScene(2, endScreen);
    }

    public Player getPlayer() {
        return _player;
    }

    public int getWinstLevel() {
        return winst_level;
    }

    public int getRonde() {
        return ronde;
    }


    public List<Rooms> getRooms() {
        return rooms;
    }
}
