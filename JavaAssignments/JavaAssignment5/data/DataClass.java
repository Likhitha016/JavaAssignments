package JavaAssignment5.data;

public class DataClass {
    private int datamember1;
    private char datamember2;
    //Printing non initialized member variables can be initialized to default values
    public void printVariables(){
        System.out.println("Integer DataMember: "+datamember1);
        System.out.println("Character DataMember: "+datamember2);
    }
    //Printing local variables without initializing
  /* void printLocalVariables(){
        int datamember1;
        char datamember2;
       //printing local variables without initializing gives error.
       //local variables are not initialized to default value by declaration
        System.out.println("Integer DataMember: "+datamember1);
        System.out.println("Character DataMember: "+datamember2);
    }*/
}
