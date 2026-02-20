package by.antonina.entities.thing;

import by.antonina.entities.others.Entity;

import java.util.Objects;

public abstract class Thing extends Entity {
    private int weight;
    private boolean fragile;

    public Thing(String name, int weight, boolean fragile) {
        super(name);
        this.weight = weight;
        this.fragile = fragile;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isFragile() {
        return fragile;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return weight == thing.weight && fragile == thing.fragile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, fragile);
    }

    @Override
    public String toString() {
        return "\n"+ "вес: "+this.weight +" название "+this.getName();
    }
}