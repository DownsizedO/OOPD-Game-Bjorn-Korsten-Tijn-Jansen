package com.github.hanyaeger.Brandweerman_Mark.entities.upgrades.Water_Gun_Upgrade;

import com.github.hanyaeger.Brandweerman_Mark.entities.upgrades.Upgrade;

public class Lengte_Upgrade extends Upgrade {
    private int lengthIncrease;

    public Lengte_Upgrade(int cost, int lengthIncrease) {
        super("Length Upgrade", cost);
        this.lengthIncrease = lengthIncrease;
    }

    public int getLengthIncrease() {
        return lengthIncrease;
    }

    public void applyUpgrade() {
        // Implementatie om de lengte te verhogen
    }
}
