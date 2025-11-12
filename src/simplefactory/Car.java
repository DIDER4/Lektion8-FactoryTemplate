package simplefactory;

public class Car {
    private final CarType type;
    private final int seats;
    private final int doors;
    private final FuelBehavior fuelBehavior;

    public Car(CarType type, int seats, int doors, FuelBehavior fuelBehavior) {
        if (type == null) throw new IllegalArgumentException("type must not be null");
        if (fuelBehavior == null) throw new IllegalArgumentException("fuelBehavior must not be null");
        this.type = type;
        this.seats = seats;
        this.doors = doors;
        this.fuelBehavior = fuelBehavior;
    }

    public CarType getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

    public FuelType getFuelType() {
        return fuelBehavior.getFuelType();
    }

    public FuelBehavior getFuelBehavior() {
        return fuelBehavior;
    }
}
