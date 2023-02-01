package inheritanceDemo;

public class parentclass {

    int rollnum=10;
    String name="nellore";
    String college = "NEC";

    public static void main(String args[])
    {
        parentclass prt = new parentclass();
        System.out.println("added values is "+prt.college);
        prt.addition(4,8);
    }

    void addition(int a, int b)
    {
        int c= a+b;
        System.out.println("added values is "+c);
    }
}
