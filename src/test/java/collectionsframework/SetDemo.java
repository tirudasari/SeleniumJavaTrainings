package collectionsframework;

import java.util.*;

public class SetDemo {

    public static void main(String args[]) {

        Set<String> s1 = new HashSet<String>();
        Set <String> s2= new LinkedHashSet<String>();
        Set <String> s3 = new TreeSet<String>();


        HashSet<String> hs = new HashSet<String>();


         hs.add("Sasi");
         hs.add("tiru");
         hs.add("hyd");
        hs.add("pradeep");

//        System.out.println(hs.remove("Tiru"));

        Iterator itr = hs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
