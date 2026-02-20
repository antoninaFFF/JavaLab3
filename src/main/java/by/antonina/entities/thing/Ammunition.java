package by.antonina.entities.thing;

public class Ammunition extends Thing {
    private int quantity;

    public Ammunition(String name, int weight, boolean fragile, int quantity) {
        super(name, weight, fragile);
        this.quantity = quantity;
    }

    @Override
    public int getWeight() {
        return super.getWeight() * quantity;
    }
}