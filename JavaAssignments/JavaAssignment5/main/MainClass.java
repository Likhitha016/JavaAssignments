package JavaAssignment5.main;

import JavaAssignment5.data.DataClass;
import JavaAssignment5.singleton.SingletonClass;

public class MainClass {
    public static void main(String args[]){
        DataClass dataobj=new DataClass();
        dataobj.printVariables();
        SingletonClass singletonobj=SingletonClass.staticMethod("instance");
        singletonobj.nonStaticMethod();
    }
}
