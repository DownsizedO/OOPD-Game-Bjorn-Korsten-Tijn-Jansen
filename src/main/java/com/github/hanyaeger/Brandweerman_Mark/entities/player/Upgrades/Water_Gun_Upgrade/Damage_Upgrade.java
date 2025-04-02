package com.github.hanyaeger.Brandweerman_Mark.entities.upgrades;

import com.github.hanyaeger.Brandweerman_Mark.entities.upgrades.Upgrade;

public class Damage_Upgrade extends Upgrade {
    private int damageIncrease;

    public Damage_Upgrade(int cost, int damageIncrease) {
        super("Damage Upgrade", cost);
        this.damageIncrease = damageIncrease;
    }

    public int getDamageIncrease() {
        return damageIncrease;
    }

    public void applyUpgrade() {
        // Implementatie om de schade te verhogen
    }
}
