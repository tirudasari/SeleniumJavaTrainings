package collectionsframework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]) {

        PriorityQueue<String> q1 = new PriorityQueue<String>();
        q1.add("hyd");
        q1.add("nellore");
        q1.add("chennai");
        System.out.println(q1.contains("hyd"));
        System.out.println(q1.element());
        System.out.println(q1.peek());

        Iterator itr = q1.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }


}
