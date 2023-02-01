package Excetions;

import java.io.File;
import java.io.IOException;

public class finallyDemo
{
    int x; int y;
     String str;

    public static void main(String args[]){
        finallyDemo obj1= new finallyDemo();
        obj1.method1(10,0);
        System.out.println("this is finally block with result");

    }
    public void method1(int x, int y){
        int z = 0;
        try {
            if(y==0)
            {
                y=20;
                z = x / y;
            }

            try{
                z=z/z;

            }
            catch(ArrayIndexOutOfBoundsException ai)
            {
                System.out.println("this is finally block with result");
            }
        }

        catch(NullPointerException e)
        {
            System.out.println("this is finally block with result");
        }

        System.out.println("this is finally block with result");
        System.out.println(z);


    }

    }



