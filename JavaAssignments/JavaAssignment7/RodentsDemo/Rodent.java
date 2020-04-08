package JavaAssignment7.RodentsDemo;

abstract class Rodent {
    //abstract methods to be overrided by the inheriting classes
    public abstract void tail();
    public abstract void color();
    //base class constructor
    public Rodent()
    {
        System.out.println("Rodent's constructor");
    }
}
