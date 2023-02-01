package javamethods;

public class methodsdemo {

    public static int x=5;  // static variable

    int y=70;

    public final String str= "hyderabad";

    public static void main(String args[])  // method Signature
    {
        methodsdemo mdemo =  new methodsdemo();
       mdemo.addition(9,6,4);
//        System.out.println();



    }

public static void addition(int a, int b, int c)   // method Signature
    {
        int z=a+b+c;
        System.out.println(z);        // Method body

    }



}
