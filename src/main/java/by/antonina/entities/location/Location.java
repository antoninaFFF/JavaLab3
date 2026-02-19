package by.antonina.entities.location;

import by.antonina.entities.Entity;
import by.antonina.entities.thing.Thing;

import java.util.List;

public abstract class Location extends Entity {
    private List<Thing> containedItems;
    private boolean dry;
    private boolean clean;
    private boolean narrowPassage;

    public Location(String name, boolean clean, List<Thing> containedItems, boolean dry, boolean narrowPassage) {
        super(name);
        this.clean = clean;
        this.containedItems = containedItems;
        this.dry = dry;
        this.narrowPassage = narrowPassage;
    }

    public void addItem(Thing entity) {
        this.containedItems.add(entity);
        System.out.println(entity.getName() + " помещен в " + getName() + ".");
    }

    public void removeItem(Thing entity) {
        if (this.containedItems.remove(entity)) {
            System.out.println(entity.getName() + " удален из " + getName() + ".");
        }
    }

    public List<Thing> getContainedItems() {
        return containedItems;
    }

    public boolean isClean() {
        return clean;
    }

    public boolean isDry() {
        return dry;
    }

    public boolean isNarrowPassage() {
        return narrowPassage;
    }
}