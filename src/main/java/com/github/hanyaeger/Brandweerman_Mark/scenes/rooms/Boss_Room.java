package com.github.hanyaeger.Brandweerman_Mark.scenes.rooms;

import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.boss.Boss;
import com.github.hanyaeger.Brandweerman_Mark.entities.player.Player;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class Boss_Room extends Rooms {

    private Boss boss;

    public Boss_Room(String roomName, Player player) {
        super(roomName, player);
    }

    @Override
    public void On_Enter() {}

    @Override
    public void On_Exit() {}
}
