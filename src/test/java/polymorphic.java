public class polymorphic
{
    public static void main()
    {
        polymorphic obj1 = new polymorphic();
        obj1.add(4,7);
        System.out.println("main");

    }

    public static void main(String args[])
    {
        polymorphic obj1 = new polymorphic();
        obj1.add(4,7);
        System.out.println("main2");
        obj1.add(9,6,2);
        obj1.main(8);
       polymorphic.main(8.0);
       main(8.3);

    }

    void main(int j)
    {
        polymorphic obj1 = new polymorphic();
        obj1.add(4,7);

    }
   static void main(double k)
    {

        polymorphic obj1 = new polymorphic();
        obj1.add(4,7);
    }

    static void add(int x, int y){
        int z= x+y;
        System.out.println("hello"+z);
//        return z;
    }
    void add(int a, int b, int p)
    {
        System.out.println("hello");

    }

}
