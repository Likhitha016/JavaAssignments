package JavaAssignment7.CycleFactories;

public class UnicycleFactory extends CycleFactory {
    @Override
    public Cycle createInstance() {
        return new Unicycle();
    }
}
