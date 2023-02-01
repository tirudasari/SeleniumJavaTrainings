package overridingDemo;

public class overridechild extends overrrideDemo
{
  double p=2;
    String location="hyd";

    public static void main(String args[])
    {
        overridechild ovr = new overridechild(); // instance, instantiation, object
        ovr.square(20);
//        overridechild.stat1();
    }

   int square(int x)
    {
      int p= x+x*x;
        stat1();
        System.out.println("the child Suare values is "+ p);
        return p;
    }

    static void stat1()
    {

        System.out.println("this is a static method");
    }
    protected int multiply(int x)
    {
        int p= x*x;
        System.out.println("the multivalues is "+ p);

        return p;
    }

}
