package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

public class Vuurwerk_Werper extends Normal_enemy {
    public Vuurwerk_Werper(int health, int damage, int speed, int defense) {
        super(health, damage, speed, defense);
    }
    @Override
    public void aanval() {}

    @Override
    public void beweeg() {}

    @Override
    public void Neem_Schade(int schade) {}
}
