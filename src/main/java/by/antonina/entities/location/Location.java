package by.antonina.entities.location;

import by.antonina.entities.others.Entity;
import by.antonina.entities.thing.Thing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Location extends Entity {
    private List<Thing> containedItems = new ArrayList<>();
    private final List<StateType> emotions;
    private final List<SignsType> signsTypes;

    public Location(String name, List<Thing> containedItems, List<StateType> emotions, List<SignsType> signsTypes) {
        super(name);
        if (containedItems!=null){
            this.containedItems = containedItems;
        }
        this.emotions = emotions;
        this.signsTypes = signsTypes;
    }

    public List<StateType> getEmotions() {
        return emotions;
    }

    public void setContainedItems(List<Thing> containedItems) {
        this.containedItems = containedItems;
    }

    public List<Thing> getContainedItems() {
        return containedItems;
    }

    public void descriptionLocation() {
        System.out.print(this.getName() + " был ");
        List<StateType> emotions = this.getEmotions();

        for (StateType emotion : emotions) {
            System.out.print(emotion.getName() + " ");
        }
        System.out.println();
    }

    public void descriptionSings() {
        try {
            if (!signsTypes.isEmpty()) {

                System.out.print("Были признаки ");
                for (SignsType value : signsTypes) {
                    System.out.print(value.getName() + " ");
                }
            }
        } catch (NullPointerException e) {
            System.out.print("Не было никаких ");
            for (SignsType value : SignsType.values()) {
                System.out.print(value.getName() + " ");
            }
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(containedItems, location.containedItems) && Objects.equals(emotions, location.emotions) && Objects.equals(signsTypes, location.signsTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containedItems, emotions, signsTypes);
    }
}