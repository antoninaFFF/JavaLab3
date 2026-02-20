package by.antonina.entities.location;

import by.antonina.entities.thing.Thing;
import by.antonina.exception.LocationThingException;

import java.util.List;

public class OldHouse extends Location{

    public OldHouse(List<Thing> containedItems, List<StateType> emotions, List<SignsType> signsTypes) throws LocationThingException {
        super("старый дом", containedItems, emotions, signsTypes);
    }
}
