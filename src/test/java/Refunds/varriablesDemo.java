package Refunds;

public class varriablesDemo
{    //Types variables
    // Scope of each variable type
    // Applicable area of each variable type
    //Usage of each variable type
    //Examples for using each variable
    int x=10;  // x is a  member /instance variable---> object through
    int y= 20; // y is a member. instance variable

    static String Collegename="Narayana Engineering college";

    public static void main(String[] args)   // main method is a static method
    {
        int p=50;   // Local variable

        varriablesDemo varobj1 = new varriablesDemo();  //int x=10, int y=20
        varriablesDemo varobj2 = new varriablesDemo();  // int x=10, int y=20

        System.out.println("the local variable is"+p);

        System.out.println(varobj1.x);
        System.out.println(varobj1.y);
        System.out.println(varobj2.x);
        System.out.println(varobj2.y);
        System.out.println(Collegename);  //staic variable in static method
        varobj1.sum();
    }
    void sum ()    // Sum() method is a Non-static method
    {
        int z= x+y;
        System.out.println(x);
        System.out.println(z);
        System.out.println(Collegename); // staic variable in non-static method
    }




}
