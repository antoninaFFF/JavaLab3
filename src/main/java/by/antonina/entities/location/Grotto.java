package by.antonina.entities.location;

import by.antonina.entities.thing.Thing;

import java.util.List;

public class Grotto extends Location {

    private final List<SignsType> sings;

    public Grotto(List<Thing> containedItems, List<StateType> emotions, List<SignsType> sings) {
        super("грот", containedItems, emotions, sings);
        this.sings = sings;
    }
}