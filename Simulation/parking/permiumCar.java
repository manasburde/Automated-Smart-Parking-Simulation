package parking;
public class premimumCar extends vehicle {
    public premimumCar(int id, int hours) {
        this.id = id;
        this.hours = hours;
    }
    public double calculateFee() {
        return hours * 40.0;
    }
}
