package collectionsframework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String args[]) {

        TreeSet<String> ts = new TreeSet<String>();

        SortedSet<String> ts1= new TreeSet<String>();



        ts1.add("Nellore");
        ts1.add("Hyderabad");
        ts1.add("Bangalore");
        ts1.add("Chennai");
        ts1.add("Delhi");
        ts1.add("Mumbai");
//        ts.add(null);  // null value--> can not compare in tree structure

        Iterator itr = ts1.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
