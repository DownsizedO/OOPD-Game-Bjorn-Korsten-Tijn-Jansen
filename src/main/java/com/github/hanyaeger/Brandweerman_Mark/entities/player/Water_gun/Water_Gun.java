package com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import java.util.Set;


public class Water_Gun extends DynamicSpriteEntity implements KeyListener {

    private YaegerGame game;
    Coordinate2D coordinate;
    public Water_Gun(Coordinate2D position, YaegerGame game) {
        super("path_to_water_gun_image.png", position); // Zet hier de juiste sprite voor de watergun
        this.game = game;
        this.coordinate = position;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        // Kijk of de speler de schietknop indrukt (bijvoorbeeld de spatiebalk)
        if (pressedKeys.contains(KeyCode.SPACE)) {
            shoot(90);
        }
    }

    public void shoot(float direction) {
        com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream waterStream = new com.github.hanyaeger.Brandweerman_Mark.entities.player.Water_gun.WaterStream(coordinate, direction);
//        addEntity(waterStream);
    }
}
