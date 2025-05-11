package com.github.hanyaeger.brandweerman_mark.entities;

public interface Entity {

    void aanval();
    void Neem_Schade(int schade);
    int getHp();
    int getDamage();
}
