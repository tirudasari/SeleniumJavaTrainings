package encapsule;

public class encapse2 extends encapsDemo
{
    public static void main(String args[])
    {
        encapsDemo obj1 = new encapsDemo();

        obj1.x=67;

        obj1.getx();
        obj1.gety();
        obj1.setName("hyderabad");
        obj1.setX(150);

        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj1.name);
        encapse2 obj2= new encapse2();
               obj2.superdemo();
        System.out.println(obj1.name);

    }

    void superdemo()
    {  super.name="hyd";
       System.out.println(super.name);
    }
}
