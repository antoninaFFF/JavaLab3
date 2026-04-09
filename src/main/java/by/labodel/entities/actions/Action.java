package by.labodel.entities.actions;


import by.labodel.entities.others.Time;

public abstract class Action {

    private final String name;
    private final Time duration;

    public Action(String name, Time duration) {
        this.duration = duration;
        this.name = name;
    }

    public Time getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public abstract void doo();
}
