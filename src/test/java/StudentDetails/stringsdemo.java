package StudentDetails;

public class stringsdemo {
private int p=20;

    public static void main(String args[])
    {

//        String str = " sasi ";// str literal

        String str= new String("Sasi"); // through object

       int x = str.length();

        boolean p = str.isEmpty();

        if (str.equals("Sasi"))
//          if (str.equalsIgnoreCase("SASI"))
        {

            System.out.println("matchingg");
        } else
        {

            System.out.println("not matchingg");
        }
        System.out.println(str.charAt(1));


    }
}
