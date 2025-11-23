package parking;
public class car extends vehicle {
    public car(int id, int hours) {
        super(id, hours);
    }
    public double calculateFee() {
        return hours * 20.0;
    }
}
