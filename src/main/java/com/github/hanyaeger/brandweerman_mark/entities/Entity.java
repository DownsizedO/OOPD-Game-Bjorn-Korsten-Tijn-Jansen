package com.github.hanyaeger.brandweerman_mark.entities;

import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.List;

public interface Entity {

    void Neem_Schade(int schade);
    int getHp();
    int getDamage();

    public void onCollision(List<Collider> collisions);
    public void notifyBoundaryTouching(SceneBorder sceneBorder);
}
