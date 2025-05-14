package com.github.hanyaeger.brandweerman_mark;

import com.github.hanyaeger.api.*;

import com.github.hanyaeger.brandweerman_mark.scenes.menus.Startscherm;
import com.github.hanyaeger.brandweerman_mark.scenes.menus.Eindscherm;
import com.github.hanyaeger.brandweerman_mark.scenes.rooms.Boss_Room;
import com.github.hanyaeger.brandweerman_mark.scenes.rooms.Normal_Room;
import com.github.hanyaeger.brandweerman_mark.scenes.rooms.Room;
import com.github.hanyaeger.brandweerman_mark.entities.player.Player;

import java.util.List;

public class Game extends YaegerGame {

    private Startscherm startScreen;
    private Eindscherm endScreen;
    private List<Room> rooms;
    private Player _player;
    private int ronde;
    private int winst_level;
    public static int kamer = 1;
    private YaegerGame game;


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
        addScene(1, new Normal_Room(this, 3));  // Normale kamer
        addScene(2, new Normal_Room(this, 5));  // Normale kamer 2
        addScene(3, new Normal_Room(this,7));  // Normale kamer 3
        addScene(4, new Normal_Room(this, 9));  // Normale kamer 4
         addScene(100, endScreen);
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


    public List<Room> getRooms() {
        return rooms;
    }

    public int getKamer() {
        return kamer;
    }
    public void setKamer(int kamer) {
        kamer = kamer;
    }

}
