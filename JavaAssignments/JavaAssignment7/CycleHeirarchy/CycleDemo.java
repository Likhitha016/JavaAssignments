package JavaAssignment7.CycleHeirarchy;


import java.util.ArrayList;

public class CycleDemo {
    public static void main(String args[]){
        //creating arralist of child classes by Upcasting them to Cycle class(base class)
        ArrayList<Cycle> cycleArray=new ArrayList<>();
        cycleArray.add((Cycle)new Unicycle());
        cycleArray.add((Cycle)new Bicycle());
        cycleArray.add((Cycle)new Tricycle());
        for(Cycle c:cycleArray){
            //downcasting cycle objects to unicycle object and calling balance method
            Unicycle u=(Unicycle)c;
            u.balance();
        }

    }
}
