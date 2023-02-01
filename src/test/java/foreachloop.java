public class foreachloop {

    public static void main(String[]args){

        String[] names= {"sasi","Pradeep","venkat","Tiru","Kishore"};

        int[] rollnuber={433,43,43,43,4343};
        for(String i:names)
        {
                 System.out.println("the candidate name is"+i);
                 if(i.equals("sasi"))
                 {
                     break;
                 }
        }


    }

}
