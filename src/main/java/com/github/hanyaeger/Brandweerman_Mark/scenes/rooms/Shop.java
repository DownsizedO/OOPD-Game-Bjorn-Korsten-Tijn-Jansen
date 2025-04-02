package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import java.util.ArrayList;
import java.util.List;

import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;
import com.github.hanyaeger.Brandweerman_Mark.entities.upgrades.Upgrade;
import com.github.hanyaeger.Brandweerman_Mark.scenes.rooms.Rooms;



public class Shop extends Rooms {

    public Shop(String roomName, Player player) {
        super(roomName, player);
    }

    private ArrayList<Upgrade> upgrades = new ArrayList<Upgrade>();



    @Override
    public void On_Enter() {}

    @Override
    public void On_Exit() {}
}
