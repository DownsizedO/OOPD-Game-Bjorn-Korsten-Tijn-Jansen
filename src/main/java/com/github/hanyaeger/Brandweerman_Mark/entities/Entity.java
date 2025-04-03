package com.github.hanyaeger.Brandweerman_Mark.entities;

import com.github.hanyaeger.api.UpdateExposer;

public interface Entity {

    void aanval();
    void Neem_Schade(int schade);
    int getHp();
    int getDamage();
}
