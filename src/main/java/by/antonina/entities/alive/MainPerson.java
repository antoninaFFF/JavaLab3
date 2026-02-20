package by.antonina.entities.alive;

import by.antonina.entities.actions.Action;
import by.antonina.entities.actions.Huge;
import by.antonina.entities.others.Entity;
import by.antonina.entities.location.Grotto;
import by.antonina.entities.location.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainPerson extends Entity {
    private Location currentLocation;
    private List<String> emotions = new ArrayList<>();

    public MainPerson(String name, Location startLocation) {
        super(name);
        this.currentLocation = startLocation;
        if (startLocation instanceof Grotto) {
            this.emotions.add("неудобство, но для меня это неудобство было преимуществом");
            this.emotions.add("безопасность, так как нашел безопасное убежище");
        }
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void fillEmotion() {
        for (String emotion : emotions) {
            System.out.println("Чувствуется " + emotion);
        }
    }

    public void doo(Action action) {
        action.doo();
    }

    @Override
    public String toString() {
        return "MainPerson{" +
               "currentLocation=" + currentLocation +
               ", emotions=" + emotions +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MainPerson that = (MainPerson) o;
        return Objects.equals(currentLocation, that.currentLocation) && Objects.equals(emotions, that.emotions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentLocation, emotions);
    }
}