package JavaAssignment5.singleton;

public class SingletonClass {
     private String nonStaticMember;
    public static SingletonClass staticMethod(String value){
        //we cannot initialize or access the non static member inside the static method
       // this.nonStaticMember=value;
        return new SingletonClass();
    }
    public void nonStaticMethod(){
        System.out.println("String: "+nonStaticMember);
    }

}
