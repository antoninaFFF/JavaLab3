package by.antonina.entities.thing;

public class Musket extends Weapon{
    private WeaponType type;

    public Musket(String name, int weight, boolean fragile, boolean loaded, int caliber, WeaponType type) {
        super(name, weight, fragile, loaded, caliber);
        this.type = type;
    }
}
