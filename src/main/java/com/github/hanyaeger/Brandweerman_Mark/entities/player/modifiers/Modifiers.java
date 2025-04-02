package com.github.hanyaeger.Brandweerman_Mark.entities.player.modifiers;

public class Modifiers {

    private String naam;
    private String effect;
    private String nadeel;

    public Modifiers(String naam, String effect, String nadeel) {
        this.naam = naam;
        this.effect = effect;
        this.nadeel = nadeel;
    }

    public String getNaam() {
        return naam;
    }


    public String getEffect() {
        return effect;
    }

    public String getNadeel() {
        return nadeel;
    }
}
