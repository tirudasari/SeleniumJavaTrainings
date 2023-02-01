package Constructors;


public class construct2 extends  constructDemo

{
   int y;

   public construct2( )
    {
        System.out.println("this is child constructor");

    }

    public static void main(String args[])
    {
        constructDemo con2 = new constructDemo();


        construct2 con3 = new construct2();

//        constructDemo con5 = new construct2();

        construct2 con4 = (construct2) new constructDemo();




    }


}
