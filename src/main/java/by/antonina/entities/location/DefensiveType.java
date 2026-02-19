package by.antonina.entities.location;

public enum DefensiveType {
    WALL("стена"),
    MOAT("ров"),
    PALISADE("частокол");

    private final String name;

    DefensiveType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}