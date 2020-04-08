package JavaAssignment7.InnerClassDemo;

public class Main {
    public static void main(String args[]){
        FirstOuterClass firstOuterClass=new FirstOuterClass();
        //creating first inner class object using instance of outer class
        FirstOuterClass.FirstInnerClass firstInnerClass=firstOuterClass.new FirstInnerClass("Hello");
        SecondOuterClass secondOuterClass=new SecondOuterClass();
        SecondOuterClass.SecondInnerClass secondInnerClass=secondOuterClass.new SecondInnerClass("World");
    }
}
