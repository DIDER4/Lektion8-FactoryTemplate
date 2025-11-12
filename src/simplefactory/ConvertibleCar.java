package simplefactory;

public class ConvertibleCar extends Car {
    public ConvertibleCar(int seats, int doors, FuelBehavior fuelBehavior) {
        super(CarType.CONVERTIBLE, seats, doors, fuelBehavior);
    }
}
