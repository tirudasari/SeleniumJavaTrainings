package collectionsframework;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String args[]) {
        Stack<String> st = new Stack<String>();
        st.push("item1");
        st.push("item2");
        st.push("item3");
        st.push("item4");
        st.pop();

        System.out.println(st.peek());

        Iterator itr = st.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
