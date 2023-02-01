package overridingDemo;

public class overrrideDemo {

    int x=10; String name="Hyderabad";

    public static void main(String args[])
    {

    }

   int square(int c)
    {
        int z= x*x;
        System.out.println("the parent Suare values is "+ z);

        return z;
    }

    protected int multiply(int x)
    {
        int p= x*x;
        System.out.println("the multivalues is "+ p);

        return p;
    }


}
