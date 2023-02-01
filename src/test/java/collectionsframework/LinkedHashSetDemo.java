package collectionsframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String args[]) {

        LinkedHashSet<String> lhs= new LinkedHashSet<String>();
//        LinkedHashSet<String> lhsclone= new LinkedHashSet<String>();

        lhs.add("sasi");
        lhs.add("Pradeep");
        lhs.add("tiru");
        lhs.add("venky");
        lhs.add("ram");
        lhs.add(null);
        lhs.add(null);

        Object  lhsclone=lhs.clone();
        System.out.println(lhsclone.toString());

        Iterator itr = lhs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }



    }

}
