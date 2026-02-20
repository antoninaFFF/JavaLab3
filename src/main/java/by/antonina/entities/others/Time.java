package by.antonina.entities.others;

public record Time(int hours, int minute) {
    @Override
    public String toString() {
        return hours +"ч." + minute +"мин.";
    }
}
