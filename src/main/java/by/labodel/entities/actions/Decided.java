package by.labodel.entities.actions;

import by.labodel.entities.others.Time;

public class Decided extends Action {

    private final String what;

    public Decided(String what) {
        super("решить " + what, new Time(0, 5));
        this.what = what;
    }

    @Override
    public void doo() {
        System.out.println("решить " + what);
        System.out.println("это займет " + getDuration());
    }
}
