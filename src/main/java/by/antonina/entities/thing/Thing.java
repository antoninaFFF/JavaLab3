package by.antonina.entities.thing;

import by.antonina.entities.Entity;

public class Thing extends Entity {
    private int weight;
    private boolean fragile;

    Thing(String name, int weight, boolean fragile) {
        super(name);
        this.weight = weight;
        this.fragile = fragile;
    }

}
