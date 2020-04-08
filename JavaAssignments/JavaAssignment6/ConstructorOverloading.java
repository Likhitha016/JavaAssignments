package JavaAssignment6;

public class ConstructorOverloading {
    private String value;
    public ConstructorOverloading(){
        //intilializes the variable
        this.value="Default Constructor";
    }
    public ConstructorOverloading(String val){
        //calling default constructor
        this();
        //appends value given to parameterized constructor with value initialized with default constructor
        value=value+val;
        System.out.println(value);
    }
    public static void main(String args[]){
    ConstructorOverloading obj=new ConstructorOverloading(" Parameterized constructor");
    }
}
