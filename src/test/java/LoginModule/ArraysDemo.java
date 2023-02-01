package LoginModule;

import javamethods.methodsdemo;

public class ArraysDemo {

     protected String search="sasi";

     protected void msg(){
         System.out.println("this is protected method");
     }

    public static void main(String args[]){

        methodsdemo mdm1 = new methodsdemo();  // copy of variables--> x, y, str
        methodsdemo mdm2 = new methodsdemo();  // copy of variables-->x, y, str
        methodsdemo mdm3 = new methodsdemo();  // copy of variables-->x, y, str

        System.out.println("before static"+mdm1.x);

        mdm1.x=3;

//      mdm1.str="bangalore";

        methodsdemo.addition(3,6,9);

        System.out.println("before static"+mdm1.x);

//
        methodsdemo mdm4 = new methodsdemo();  // copy of variables-->x, y, str
//        methodsdemo mdm3 = new methodsdemo();  // copy of variables-->x, y, str

        System.out.println(mdm2.x);
        System.out.println(mdm3.x);
        System.out.println(mdm4.x);

        mdm4.x=2000;

        System.out.println(mdm1.x);
        System.out.println(mdm2.x);
        System.out.println(mdm3.x);
        System.out.println(mdm4.x);



//       String rolls[][]= new String[5][4];
//       String rolls2[]= new String[5];
//
//        rolls[0][0]="Sasi1";
//        rolls[0][1]="Sasi2";
//        rolls[0][2]="Sasi3";
//        rolls[0][3]="Sasi4";
//        rolls[1][0]="Sasi5";
//        rolls[1][1]="Sasi6";
//        rolls[1][2]="Sasi7";
//
//       rolls2[0]="sasi";
//       rolls2[1]="pradeep1";
//        rolls2[2]="pradeep2";
//        rolls2[3]="pradeep3";
//        rolls2[4]="pradeep4";

//
//        for(int i=0;i<rolls2.length;i++) {
//            if (rolls2[i] == search)
//            {
//                System.out.println("pass");
//            }
//        }

//        for( String x:rolls){
//            if(x.equalsIgnoreCase(seach))
//            System.out.println("value found"+x);
//        }

//        String rolls[]={"sasi","pradeep"};

//        System.out.println(rolls.length);
//        System.out.println(rolls[0][0]);
//        System.out.println(rolls.getClass().getName());





    }
}
