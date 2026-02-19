package by.antonina.entities.location;

import by.antonina.entities.thing.Thing;
import by.antonina.entities.thing.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Fortress extends Location {
    private DefensiveType type;
    private Wall outerWall;

    public Fortress(String name, boolean clean, List<Thing> containedItems, boolean dry, boolean narrowPassage, DefensiveType type) {
        super(name, clean, containedItems, dry, narrowPassage);
        this.type = type;
        this.outerWall = new Wall();
    }

    public DefensiveType getType() {
        return type;
    }

    public Wall getOuterWall() {
        return outerWall;
    }
    public static class Wall {
        private List<Weapon> mountedWeapons;

        public Wall() {
            this.mountedWeapons = new ArrayList<>();
        }

        public void mountWeapon(Weapon weapon) {
            mountedWeapons.add(weapon);
            System.out.println(weapon.getName() + " установлен на стену.");
        }

        public List<Weapon> getMountedWeapons() {
            return mountedWeapons;
        }
    }
}