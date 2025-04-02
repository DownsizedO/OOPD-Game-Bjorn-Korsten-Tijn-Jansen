public class Player extends DynamicSpriteEntity implements Entity, KeyListener {

    private Water_Gun waterGun;
    private List<Abilities> abilities;
    private int speed;
    private int speed_boost;
    private int gold;
    private int damage;
    private int defense;
    private int hp;
    private int max_hp;

    @Override
    public void beweeg() {}

    @Override
    public void aanval() {}

    @Override
    public void Neem_Schade(int schade) {}

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {}
}