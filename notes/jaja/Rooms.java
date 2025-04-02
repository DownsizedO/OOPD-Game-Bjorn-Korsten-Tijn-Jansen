package org.example.classes;

import java.util.List;

public abstract class Rooms {
    protected List<Rooms> rooms;

    public abstract void On_Enter();
    public abstract void On_Exit();
}
