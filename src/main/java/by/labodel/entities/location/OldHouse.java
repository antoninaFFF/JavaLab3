package by.labodel.entities.location;

import by.labodel.entities.thing.Thing;
import by.labodel.exception.LocationThingException;

import java.util.List;

public class OldHouse extends Location{

    public OldHouse(List<Thing> containedItems, List<StateType> emotions, List<SignsType> signsTypes) throws LocationThingException {
        super("старый дом", containedItems, emotions, signsTypes);
    }
}
