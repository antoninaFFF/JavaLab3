package by.antonina.entities.actions;


import by.antonina.entities.others.Time;

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

    public void doo() {
        System.out.println("это займет " + getDuration());
    }
}
