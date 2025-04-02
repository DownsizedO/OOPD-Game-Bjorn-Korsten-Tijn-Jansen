package com.github.hanyaeger.Brandweerman_Mark.entities.player.modifiers;

public abstract class Cursed extends Modifiers {

    public Cursed(String naam, String type, String effect, String nadeel) {
        super(naam, type, effect, nadeel);
    }

    public abstract void Geef_Bonus();
}
