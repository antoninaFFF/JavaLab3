package by.antonina.entities;

public enum EmotionType {
    DELIGHTFUL("восхищение"),
    DARK("темный"),
    DRY("сухой"),
    SMOOTH("ровный"),
    SMALL("мелкий"),
    WET("сырой"),
    MOLDY("плесневый"),
    DISGUSTING("отвратительный"),
    POISONOUS("ядовитый"),
    NARROW("узкий"),
    SAFE("безопасность"),
    DIFFICULT("трудный"),
    OWN("свой"),
    SPARE("запасной"),
    CLEAN("чистота"),
    CONFIDENT("уверенность"),
    PROUD("гордость"),
    PEACEFUL("умиротворение");

    private final String name;

    EmotionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}