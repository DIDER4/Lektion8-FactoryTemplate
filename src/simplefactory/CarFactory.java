package simplefactory;

public class CarFactory {
    public CarType carType;
    public FuelType fuelType;
    Car car = null;

    public CarFactory(CarType carType, FuelType fuelType) {
        this.carType = carType;
        this.fuelType = fuelType;
    }

    public Car createCar(CarType carType, int seats, int doors){
        switch (carType) {
            case SEDAN:
                return new SedanCar(seats, doors, this.fuelType);
            case CONVERTIBLE:
                return new ConvertibleCar(seats, doors, this.fuelType);
            case PICKUP:
                return new PickupCar(seats, doors, this.fuelType);
            default:
                throw new IllegalArgumentException("Ukendt Biltype: " + carType);
        }
    }


}
