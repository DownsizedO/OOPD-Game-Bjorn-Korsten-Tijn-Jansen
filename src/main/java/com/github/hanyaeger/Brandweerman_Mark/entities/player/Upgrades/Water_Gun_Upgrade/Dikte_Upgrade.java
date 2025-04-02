package com.github.hanyaeger.Brandweerman_Mark.entities.upgrades;

import com.github.hanyaeger.Brandweerman_Mark.entities.upgrades.Upgrade;

public class Dikte_Upgrade extends Upgrade {
    private int thicknessIncrease;

    public Dikte_Upgrade(int cost, int thicknessIncrease) {
        super("Thickness Upgrade", cost);
        this.thicknessIncrease = thicknessIncrease;
    }

    public int getThicknessIncrease() {
        return thicknessIncrease;
    }

    public void applyUpgrade() {
        // Implementatie om de dikte te verhogen
    }
}
