package JavaAssignment7.RodentsDemo;


import java.util.ArrayList;

public class RodentHeirarchy{
    public static void main(String args[]) {
        ArrayList<Rodent> rodentsArray = new ArrayList<>();
        //adding instances of different rodent classes to arraylist
        rodentsArray.add(new Mouse());
        rodentsArray.add(new Gerbil());
        rodentsArray.add(new Hamster());
        //Printing methods of all objects in list
        for(Rodent r:rodentsArray){
            r.tail();
            r.color();
        }
    }
}
