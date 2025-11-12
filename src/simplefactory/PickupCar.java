package simplefactory;

public class PickupCar extends Car {
    public PickupCar(int seats, int doors, FuelBehavior fuelBehavior) {
        super(CarType.PICKUP, seats, doors, fuelBehavior);
    }
}
