package by.antonina.entities.location;

public enum SignsType {
    MOLD("плесень"),
    DAMPNESS("сырость"),
    INSECTS("следы отвратительных насекомых"),
    POISONOUS("ядовитые гады");

    private final String name;

    SignsType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
