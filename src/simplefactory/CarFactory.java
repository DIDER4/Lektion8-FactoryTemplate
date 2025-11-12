package simplefactory;

public class CarFactory {
    public CarType carType;
    public FuelType fuelType;
    Car car = null;

    public CarFactory(CarType carType, FuelType fuelType) {
        this.carType = carType;
        this.fuelType = fuelType;
    }

    public Car createCar(CarType carType, int seats, int doors) {
        FuelBehavior fuelBehavior = createFuelBehavior(this.fuelType);
        return createCarWithBehavior(carType, seats, doors, fuelBehavior);
    }

    // Overloaded method that accepts an explicit FuelType
    public Car createCar(CarType carType, FuelType fuelType, int seats, int doors) {
        if (carType == null) {
            throw new IllegalArgumentException("carType must not be null");
        }
        if (fuelType == null) {
            throw new IllegalArgumentException("fuelType must not be null");
        }
        FuelBehavior fuelBehavior = createFuelBehavior(fuelType);
        return createCarWithBehavior(carType, seats, doors, fuelBehavior);
    }

    // Helper method to create FuelBehavior from FuelType (composition over inheritance)
    private FuelBehavior createFuelBehavior(FuelType fuelType) {
        switch (fuelType) {
            case GASOLINE:
                return new GasolineBehavior();
            case ELECTIRCITY:
                return new ElectricityBehavior();
            case HYBRID:
                return new HybridBehavior();
            default:
                throw new IllegalArgumentException("Ukendt brændstoftype: " + fuelType);
        }
    }

    // Helper method to create the appropriate Car subclass with the given behavior
    private Car createCarWithBehavior(CarType carType, int seats, int doors, FuelBehavior fuelBehavior) {
        switch (carType) {
            case SEDAN:
                return new SedanCar(seats, doors, fuelBehavior);
            case CONVERTIBLE:
                return new ConvertibleCar(seats, doors, fuelBehavior);
            case PICKUP:
                return new PickupCar(seats, doors, fuelBehavior);
            default:
                throw new IllegalArgumentException("Ukendt Biltype: " + carType);
        }
    }
}
