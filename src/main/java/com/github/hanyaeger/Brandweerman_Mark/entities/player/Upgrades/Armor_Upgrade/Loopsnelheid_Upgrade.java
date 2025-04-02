package com.github.hanyaeger.Brandweerman_Mark.entities.upgrades;

import com.github.hanyaeger.Brandweerman_Mark.entities.upgrades.Upgrade;

public class Loopsnelheid_Upgrade extends Upgrade {
    private int speedBoost;

    public Loopsnelheid_Upgrade(int cost, int speedBoost) {
        super("Speed Upgrade", cost);
        this.speedBoost = speedBoost;
    }

    public int getSpeedBoost() {
        return speedBoost;
    }

    public void applyUpgrade() {
        // Implementatie om de loopsnelheid te verhogen
    }
}
