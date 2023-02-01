public class switchdemo {

    public static void main(String[] args)
    {
        String dayname="Sunday";

        switch(dayname)
        {

            case "Sunday":

                System.out.println("Today is "+ dayname);
                break;

            case "Monday":

                System.out.println("Today is "+ dayname);
                break;

            case "Tuesday":
                System.out.println("Today is "+ dayname);
                break;

            case "Wednesday":
                System.out.println("Today is "+ dayname);
                break;

            default: System.out.println("No conditon has met");



        }


    }
}
