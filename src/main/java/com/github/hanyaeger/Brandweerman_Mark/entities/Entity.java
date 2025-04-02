package com.github.hanyaeger.Brandweerman_Mark.entities;

public interface Entity {
    void beweeg();
    void aanval();
    void Neem_Schade(int schade);
    int getHp();
    int getDamage();
}
