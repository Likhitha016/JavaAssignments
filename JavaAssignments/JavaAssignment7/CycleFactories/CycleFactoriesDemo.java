package JavaAssignment7.CycleFactories;

import java.util.ArrayList;

public class CycleFactoriesDemo
{
    public static void main(String args[]) {
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();
        //add instances to arraylist
        ArrayList<Cycle> arr = new ArrayList<>();
        arr.add(unicycleFactory.createInstance());
        arr.add(bicycleFactory.createInstance());
        arr.add(tricycleFactory.createInstance());
        //for every item array list i.e instances of classes we are calling the method
        for(Cycle c:arr)
            c.typeDescription();
    }
}
