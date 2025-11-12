package simplefactory;

public class SedanCar extends Car {
    public SedanCar(int seats, int doors, FuelBehavior fuelBehavior) {
        super(CarType.SEDAN, seats, doors, fuelBehavior);
    }
}
