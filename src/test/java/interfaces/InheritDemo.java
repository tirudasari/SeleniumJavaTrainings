package interfaces;

public class InheritDemo implements interface1,interface2
{

public static void main(String args[])
{

    InheritDemo obj1 = new InheritDemo();
    obj1.addition(7,9);
    obj1.multiplication(4,8);


}


    @Override
    public void addition(int x, int y)
    {
        int z= x+y;
        System.out.println(z);

    }

    @Override
    public void multiplication(int a, int b)
    {
        int c= a*b;
        System.out.println(c);

    }
}
