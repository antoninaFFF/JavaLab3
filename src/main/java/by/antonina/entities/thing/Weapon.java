package by.antonina.entities.thing;

public abstract class Weapon extends Thing {
    private boolean loaded;
    private int caliber;

    public Weapon(String name, int weight, boolean fragile, boolean loaded, int caliber) {
        super(name, weight, fragile);
        this.loaded = loaded;
        this.caliber = caliber;
    }

    public void load() {
        this.loaded = true;
        System.out.println(getName() + " заряжено.");
    }

    public void shoot() {
        if (loaded) {
            System.out.println(getName() + " производит выстрел!");
            this.loaded = false;
        } else {
            System.out.println(getName() + " не заряжено!");
        }
    }

    public boolean isLoaded() {
        return loaded;
    }

    public int getCaliber() {
        return caliber;
    }
}