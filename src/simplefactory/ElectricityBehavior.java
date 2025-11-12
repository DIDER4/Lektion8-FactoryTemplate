package simplefactory;

public class ElectricityBehavior implements FuelBehavior {
    @Override
    public FuelType getFuelType() {
        return FuelType.ELECTIRCITY;
    }
}

