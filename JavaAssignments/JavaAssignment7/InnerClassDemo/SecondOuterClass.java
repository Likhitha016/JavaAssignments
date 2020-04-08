package JavaAssignment7.InnerClassDemo;

public class SecondOuterClass extends FirstOuterClass{
    class SecondInnerClass extends FirstInnerClass{

        public SecondInnerClass(String variable) {
            super(variable);
            System.out.println("Second Inner Class  Variable: "+variable);
        }
    }
}
