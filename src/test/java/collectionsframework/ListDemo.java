package collectionsframework;

import java.util.*;

public class ListDemo {

    public static <iterator> void main(String args[]) {
        List<String> list1 = new ArrayList<>();  // xpath---> all elements fetch

        List<String> LL = new LinkedList<>();

        List<String> vl = new Vector<>();

        List<String> st = new Stack<>();

        ArrayList<Object> Al = new ArrayList<Object>();

        Al.add("Hyd");
        Al.add(6);
        Al.add("chennai");
        Al.add(3, "banglore");
        Al.add(6);
        Al.add("nellore");
        Al.add(34.7);
        Al.add(null);
        Al.add(null);
        Al.add(true);

//        System.out.println(Al.isEmpty());
//        System.out.println(Al.size());
//        System.out.println(Al.contains("Hyd"));
//        System.out.println(Al.get(3));
//        System.out.println(Al.get(0));
        Iterator itr = Al.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }



    }
}




