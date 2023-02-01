package StudentDetails;

import LoginModule.ArraysDemo;

public class BufferDemo extends ArraysDemo{

    ArraysDemo adm = new ArraysDemo();


    public static void main(String args[]) {

        ArraysDemo adm = new ArraysDemo();

        BufferDemo bdm = new BufferDemo();
          System.out.println(bdm.search);
           bdm.msg();

        StringBuffer sbf = new StringBuffer("java");

        System.out.println(sbf.hashCode());

        sbf.append(" course");

        System.out.println(sbf);
        System.out.println(sbf.hashCode());

        StringBuilder sbd = new StringBuilder("selenium");

        System.out.println(sbd.hashCode());
        sbd.append(4);
        System.out.println(sbd);
        System.out.println(sbd.reverse());
        sbd.replace(0, 8, "Automation");
        System.out.println(sbd);
//
//        System.out.println(adm.search);

    }
}

