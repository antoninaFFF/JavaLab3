package by.labodel.entities.location;

import by.labodel.entities.thing.Thing;
import by.labodel.exception.LocationThingException;

import java.util.List;

public class Grotto extends Location {

    private final List<SignsType> sings;

    public Grotto(List<Thing> containedItems, List<StateType> emotions, List<SignsType> sings) throws LocationThingException {
        super("грот", containedItems, emotions, sings);
        this.sings = sings;
    }
}