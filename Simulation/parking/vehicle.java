package parking;
public abstract class vehicle {
    protected int id;
    protected int hours;
    public vehicle() {
    }
    public vehicle(int id, int hours) {
        this.id = id;
        this.hours = hours;
    }
    public abstract double calculateFee();
    public int getId() { return id; }
    public void display() {
        System.out.println("ID: " + id + " | Hours: " + hours);
    }
}
