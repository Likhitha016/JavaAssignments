package JavaAssignment7.CycleFactories;

public class TricycleFactory extends CycleFactory {
    @Override
    public Cycle createInstance() {
        return new Tricycle();
    }
}
