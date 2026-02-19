package by.antonina.entities.thing;

public class Ammunition extends Thing {
    private int quantity;

    public Ammunition(String name, int weight, boolean fragile, int quantity) {
        super(name, weight, fragile);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}