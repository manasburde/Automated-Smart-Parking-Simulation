package parking;
public class bike extends vehicle {
    public bike(int id, int hours) {
        this.id = id;
        this.hours = hours;
    }
    public double calculateFee() {
        return hours * 15.0;
    }
}
