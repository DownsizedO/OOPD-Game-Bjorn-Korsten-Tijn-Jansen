package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.normal;

public abstract class Normal_enemy extends Enemy {

    @Override
    public abstract void aanval();

    @Override
    public abstract void beweeg();

    @Override
    public abstract void Neem_Schade(int schade);
}
