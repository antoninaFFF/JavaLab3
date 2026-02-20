package by.antonina;

import by.antonina.entities.actions.Huge;
import by.antonina.entities.location.OldHouse;
import by.antonina.entities.location.StateType;
import by.antonina.entities.alive.MainPerson;
import by.antonina.entities.location.Grotto;
import by.antonina.entities.location.Location;
import by.antonina.entities.thing.Ammunition;
import by.antonina.entities.thing.Gun;
import by.antonina.entities.thing.Musket;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Location loc1 = new Grotto(List.of(), List.of(
                StateType.DELIGHTFUL, StateType.DARK, StateType.DRY, StateType.SANDING
        ), null);
        Location from = new OldHouse(List.of(
                new Musket("мушкет 1", 3, false, false, 10),
                new Musket("мушкет 2", 4, false, true, 10),
                new Musket("мушкет 3", 4, false, true, 10),
                new Gun("охотничее ружье 1", 7, false, false, 16),
                new Gun("охотничее ружье 2", 8, false, true, 16),
                new Ammunition("порох/аптечка", 15, true, 3)),
                List.of(StateType.OLD_HOUSE), List.of());
        MainPerson person = new MainPerson("Я", loc1);
        person.getCurrentLocation().descriptionLocation();
        person.getCurrentLocation().descriptionSings();
        person.fillEmotion();
        int allWeight = 0;
        for (int i = 0; i < from.getContainedItems().toArray().length; i++) {
            allWeight+=from.getContainedItems().get(i).getWeight();
        }
        person.doo(new Huge(allWeight, from, loc1));
        from.descriptionLocation();
    }
}