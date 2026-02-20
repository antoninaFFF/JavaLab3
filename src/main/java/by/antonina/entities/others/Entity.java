package by.antonina.entities.others;

public abstract class Entity {

    private final String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
