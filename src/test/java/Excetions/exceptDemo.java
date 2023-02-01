package Excetions;

public class exceptDemo {

    int x=10;
     int y=5,z;
    int roll[]={10,20,30};

    public static void main(String args[])
     {
         System.out.println("");
         exceptDemo ob1= new exceptDemo();
         ob1.opt();
         ob1.addarray();
     }

     void opt()
     {
         try
         {
             z = x / 0;
         }
         catch (Exception e)
         {
           e.printStackTrace();
           z=x/y;
         }
         System.out.println(z+1);
         System.out.println(z+2);
         System.out.println(z+3);

     }
    void addarray()
    {
        try {

            System.out.println(roll[4]);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(roll[2]);
        }

    }


}
