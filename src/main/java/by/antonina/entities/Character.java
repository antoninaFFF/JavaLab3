package by.antonina.entities;

import by.antonina.entities.location.Grotto;
import by.antonina.entities.location.Location;
import by.antonina.entities.thing.Thing;

import java.util.List;

public class Character extends Entity {
    private List<Thing> inventory;
    private Location currentLocation;
    private EmotionType currentEmotion;

    public Character(String name, List<Thing> inventory, Location startLocation) {
        super(name);
        this.inventory = inventory;
        this.currentLocation = startLocation;
        this.currentEmotion = null;
    }

    public void explore(Location loc) {
        System.out.println(getName() + " осматривает " + loc.getName() + ".");

        if (loc.isClean()) {
            feelEmotion(EmotionType.DELIGHTFUL);
        }
        if (loc.isDry()) {
            feelEmotion(EmotionType.DRY);
        }
        if (loc.isNarrowPassage()) {
            feelEmotion(EmotionType.NARROW);
            System.out.println(getName() + " решает, что узкий ход - это преимущество для безопасности.");
        }

        if (loc instanceof Grotto && loc.isClean() && loc.isDry()) {
            System.out.println(getName() + " в восторге от своего открытия!");
        }
    }

    public void moveTo(Location loc) {
        System.out.println(getName() + " перемещается из " + currentLocation.getName() +
                           " в " + loc.getName() + ".");
        this.currentLocation = loc;
    }

    public void takeItem(Thing item) {
        if (currentLocation.getContainedItems().contains(item)) {
            currentLocation.removeItem(item);
            inventory.add(item);
            System.out.println(getName() + " берет " + item.getName() + ".");
        }
    }

    public void leaveItem(Thing item, Location loc) {
        if (inventory.remove(item)) {
            loc.addItem(item);
            System.out.println(getName() + " оставляет " + item.getName() + " в " + loc.getName() + ".");
        }
    }

    public void feelEmotion(EmotionType emotion) {
        this.currentEmotion = emotion;
        System.out.println(getName() + " испытывает " + emotion.getName() + ".");
    }

    public void decideToMoveItems(List<Thing> items, Location from, Location to) {
        System.out.println("\n" + getName() + " решает перенести ценные вещи из " +
                           from.getName() + " в " + to.getName() + ".");

        for (Thing item : items) {
            if (from.getContainedItems().contains(item)) {
                from.removeItem(item);
                inventory.add(item);
                System.out.println(getName() + " берет " + item.getName() + ".");
            }
        }

        // Затем оставляем их в новом месте
        for (Thing item : items) {
            if (inventory.contains(item)) {
                inventory.remove(item);
                to.addItem(item);
                System.out.println(getName() + " оставляет " + item.getName() + " в " + to.getName() + ".");
            }
        }
    }

    public List<Thing> getInventory() {
        return inventory;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void showInventory() {
        System.out.println("\nИнвентарь " + getName() + ":");
        if (inventory.isEmpty()) {
            System.out.println("  пуст");
        } else {
            for (Thing item : inventory) {
                System.out.println("  - " + item.getName());
            }
        }
    }
}