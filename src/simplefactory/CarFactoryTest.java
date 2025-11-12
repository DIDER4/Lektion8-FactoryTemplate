package simplefactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTest {

    @Test
    public void createSedan() {
        CarFactory factory = new CarFactory(CarType.SEDAN, FuelType.GASOLINE);
        Car car = factory.createCar(CarType.SEDAN, 5, 4);
        assertTrue(car instanceof SedanCar);
        assertEquals(5, car.getSeats());
        assertEquals(4, car.getDoors());
        assertEquals(FuelType.GASOLINE, car.getFuelType());
    }

    @Test
    public void createConvertible() {
        CarFactory factory = new CarFactory(CarType.CONVERTIBLE, FuelType.ELECTIRCITY);
        Car car = factory.createCar(CarType.CONVERTIBLE, 2, 2);
        assertTrue(car instanceof ConvertibleCar);
        assertEquals(2, car.getSeats());
        assertEquals(2, car.getDoors());
        assertEquals(FuelType.ELECTIRCITY, car.getFuelType());
    }

    @Test
    public void createPickup() {
        CarFactory factory = new CarFactory(CarType.PICKUP, FuelType.HYBRID);
        Car car = factory.createCar(CarType.PICKUP, 2, 2);
        assertTrue(car instanceof PickupCar);
        assertEquals(2, car.getSeats());
        assertEquals(2, car.getDoors());
        assertEquals(FuelType.HYBRID, car.getFuelType());
    }
}

