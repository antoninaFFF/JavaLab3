package by.antonina.entities.location;

import by.antonina.entities.thing.Thing;

import java.util.List;

public class OldHouse extends Location{

    public OldHouse(List<Thing> containedItems, List<StateType> emotions, List<SignsType> signsTypes) {
        super("старый дом", containedItems, emotions, signsTypes);
    }
}
