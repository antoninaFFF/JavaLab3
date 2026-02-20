package by.antonina.entities.actions;

import by.antonina.entities.location.Location;
import by.antonina.entities.others.Time;

public class Huge extends Action {

    private final Location from;
    private final Location to;

    public Huge(int weight, Location from, Location to) {
        // один кг переносить в среднем 1 минуту
        super("перенести", new Time(weight / 60, weight % 60));
        this.from = from;
        this.to = to;
    }

    @Override
    public void doo() {
        System.out.println("вещи будут перемещены из " + from.getName() + " в другоем место: " + to.getName());
        System.out.println("вещи которые будут перемещены" +(from.getContainedItems()));
        to.setContainedItems(from.getContainedItems());
        System.out.println("это займет " + getDuration());
    }

}
