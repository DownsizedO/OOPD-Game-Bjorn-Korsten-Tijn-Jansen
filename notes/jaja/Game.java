package org.example.classes;

import java.util.List;

public interface Game {

    void startScreen();
    Eindscherm endScreen();
    List<Rooms> rooms();
    Player player();
    Statistics stats();
    int ronde();
    int winst_level();
}
