package Refunds;

public class B extends A{

    public void method4()
    {

    }
    public void method5()
    {

    }
    public void method6()
    {

    }

    public static void main(String args[])
    {

        A a = new A(); // only parent methods will be accessible

        B b = new B(); // both child method and parent methods will come

        A a1 = new A(); // only parent A methods will be accessible
        B b1 = new B(); // All the parent and  child methods will be accessible

      wefdriver dr = new B();





    }
}
