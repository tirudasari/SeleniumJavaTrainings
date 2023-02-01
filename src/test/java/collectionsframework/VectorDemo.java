package collectionsframework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String args[]) {
        List<Integer> v1= new Vector<Integer>();

          v1.add(77);
          v1.add(88);
        Vector <Integer> v= new Vector<Integer>();
         v.add(7);
        v.add(9);
        v.add(2,99);
        v.addAll(v1);
       System.out.println(v.isEmpty());
        Iterator itr = v.iterator();

        for(int x:v)
        {
            System.out.println(itr.next());
        }

//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }

    }

}
