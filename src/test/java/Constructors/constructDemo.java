package Constructors;

public class constructDemo extends Object{

    int x;

    private String name;

    public String getName()
    {
        return name;
    }
//    public constructDemo()
//    {
//        System.out.println("this is parent constructors");
//
//    }

//    public constructDemo( String name)
//    {
//        this.name= name;
//        System.out.println("this is No args constructors"+name);
//
//    }

    public static void main(String args[])
    {
        constructDemo obj1 = new constructDemo();
        System.out.println(obj1.x);
        System.out.println(obj1.name);

    }


}
