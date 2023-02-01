package Abstraction;

public class abstractDemo   // partial abstration
{
  int x=10;
   int y=20;
    String str = "hyderabad";


   public void sum(int x, int y){      // implemented method
         int z=x*y;
         System.out.println(z);
    }
//    abstract void sub(int x, int y); // abstract method
//
//    abstract void sub(int x, int y, int z);

    // Abstract class can have ZERO or more abstract methods

    // but Abstract method should be in abstract class only

    // to access abstract class, we cannot create an object

}
