package by.antonina.entities.thing;

public class Gun extends Weapon {

    private WeaponType type;

    public Gun(String name, int weight, boolean fragile, boolean loaded, int caliber, WeaponType type) {
        super(name, weight, fragile, loaded, caliber);
        this.type = type;
    }
}
