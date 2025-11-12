package simplefactory;

public class HybridBehavior implements FuelBehavior {
    @Override
    public FuelType getFuelType() {
        return FuelType.HYBRID;
    }
}

