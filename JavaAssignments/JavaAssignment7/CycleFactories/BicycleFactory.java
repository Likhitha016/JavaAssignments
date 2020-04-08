package JavaAssignment7.CycleFactories;

public class BicycleFactory extends CycleFactory {
    @Override
    public Cycle createInstance() {
        return new Bicycle();
    }
}
