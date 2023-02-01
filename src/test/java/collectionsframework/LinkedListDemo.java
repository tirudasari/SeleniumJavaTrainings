package collectionsframework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[]) {
        LinkedList <String> ll = new LinkedList<String>();

        ll.add("sasi");
        ll.add("pradeep");
        ll.add("tiru");
        ll.add(3,"nellore");
        ll.add("sasi");
        ll.add("pradeep");
        ll.add("tiru");
        ll.add(null);
        ll.add(null);
        ll.remove();
        ll.remove("tiru");


        Iterator itr = ll.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }




    }
}
