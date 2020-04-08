package JavaAssignment7.Interfaces;

public class InterfacesDemo extends ConcreteClass implements ExtendingInterface {

    @Override
    public void firstMethod1() {
        System.out.println("First Interface First Method");
    }

    @Override
    public void firstMethod2() {
        System.out.println("First Interface Second Method");
    }

    @Override
    public void secondMethod1() {
        System.out.println("Second Interface First Method");
    }

    @Override
    public void secondMethod2() {
        System.out.println("Second Interface Second Method");
    }

    @Override
    public void thirdMethod1() {
        System.out.println("Third Interface First Method");
    }

    @Override
    public void thirdMethod2() {
        System.out.println("third Interface Second Method");
    }

    @Override
    public void extendingMethod()
    {
        System.out.println("Extending Interface Method");
    }
    public void First(FirstInterface firstInterface){
        firstInterface.firstMethod1();
        firstInterface.firstMethod2();
    }
    public void Second(SecondInterface secondInterface){
        secondInterface.secondMethod1();
        secondInterface.secondMethod2();
    }
    public void Third(ThirdInterface thirdInterface){
        thirdInterface.thirdMethod1();
        thirdInterface.thirdMethod2();
    }
    public void Extended(ExtendingInterface extendingInterface){
        extendingInterface.extendingMethod();
    }
    public static void main(String args[]){
        InterfacesDemo demo=new InterfacesDemo();
        demo.First(demo);
        demo.Second(demo);
        demo.Third(demo);
        demo.Extended(demo);
    }

}
