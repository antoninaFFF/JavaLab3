package by.labodel.entities.others;

public abstract class Entity implements Nameble {

    private final String name;

    public Entity(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
