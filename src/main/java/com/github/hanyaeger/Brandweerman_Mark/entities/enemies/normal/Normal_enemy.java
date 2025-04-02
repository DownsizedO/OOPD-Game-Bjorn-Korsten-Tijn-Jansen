package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;
import com.github.hanyaeger.Brandweerman_Mark.entities.enemies.Enemy;

public abstract class Normal_enemy extends Enemy {

    public Normal_enemy(int health, int damage, int speed, int defense) {
        super(health, damage, speed, defense);  // Roep de constructor van Enemy aan met de juiste argumenten
    }

    @Override
    public abstract void aanval();

    @Override
    public abstract void beweeg();

    @Override
    public abstract void Neem_Schade(int schade);
}
