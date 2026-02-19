package by.antonina.entities.location;

import by.antonina.entities.thing.Thing;

import java.util.List;

public class Grotto extends Location {
    public Grotto(String name, boolean clean, List<Thing> containedItems, boolean dry, boolean narrowPassage) {
        super(name, clean, containedItems, dry, narrowPassage);
    }
}