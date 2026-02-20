package by.antonina.entities.location;

public enum StateType {
    DELIGHTFUL("восхитительный, хотя"),
    DRY("c сухим и ровным дном"),
    SANDING("покрытый мелким песком"),
    DARK("совершенно темный"),
    OLD_HOUSE("мушкеты стояли у ограды, но всегда были к моим услугам, если я собирался в какой нибудь поход");
    private final String name;

    StateType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}