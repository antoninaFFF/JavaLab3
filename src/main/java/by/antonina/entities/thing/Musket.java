package by.antonina.entities.thing;

public class Musket extends Weapon {
    private boolean onLafet;

    public Musket(String name, int weight, boolean fragile, boolean loaded, int caliber) {
        super(name, weight, fragile, loaded, caliber);
        this.onLafet = false;
    }

    public void mountOnLafet() {
        this.onLafet = true;
        System.out.println(getName() + " установлен на лафет.");
    }

    public boolean isOnLafet() {
        return onLafet;
    }
}