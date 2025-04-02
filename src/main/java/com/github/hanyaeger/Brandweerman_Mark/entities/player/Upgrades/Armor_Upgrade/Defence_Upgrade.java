package com.github.hanyaeger.Brandweerman_Mark.entities.upgrades;

import com.github.hanyaeger.Brandweerman_Mark.entities.upgrades.Upgrade;

public class Defence_Upgrade extends Upgrade {
    private int defenceBoost;

    public Defence_Upgrade(int cost, int defenceBoost) {
        super("Defence Upgrade", cost);
        this.defenceBoost = defenceBoost;
    }

    public int getDefenceBoost() {
        return defenceBoost;
    }

    public void applyUpgrade() {
        // Implementatie om de verdediging te verbeteren
    }
}
