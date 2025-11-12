package simplefactory;

public abstract class Car {
    protected int seats;
    protected int doors;
    protected FuelType fuelType;

    public Car(int seats, int doors, FuelType fuelType) {
        this.seats = seats;
        this.doors = doors;
        this.fuelType = fuelType;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
