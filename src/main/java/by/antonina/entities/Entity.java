package by.antonina.entities;

public abstract class Entity {

    private final String name;

    Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
