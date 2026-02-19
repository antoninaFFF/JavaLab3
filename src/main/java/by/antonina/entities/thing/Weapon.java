package by.antonina.entities.thing;

public class Weapon extends Thing {

    private boolean loaded;
    private int caliber;

    public Weapon(String name, int weight, boolean fragile, boolean loaded, int caliber) {
        super(name, weight, fragile);
        this.loaded = loaded;
        this.caliber = caliber;
    }

    void load() {
    }

    void shoot() {
    }
    //TODO: без реализации

}
