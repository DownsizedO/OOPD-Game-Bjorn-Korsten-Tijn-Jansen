package com.github.hanyaeger.Brandweerman_Mark.entities.enemies.boss;

public class Robot extends Boss {

    public Robot(int health, int damage, int speed, int defense) {
        super(health, damage, speed, defense);
    }

    public void stateSwitch() {}

    @Override
    public void aanval() {}

    @Override
    public void beweeg() {}

    @Override
    public void Neem_Schade(int schade) {}
}
