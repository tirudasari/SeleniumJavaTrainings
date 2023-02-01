package inheritanceDemo;

public class childclass extends parentclass{

    int batchnum = 223;

    String studentname="Tiru";

    public static void main(String args[])
    {
        childclass cd = new childclass();

        parentclass prt = new parentclass();
        prt.addition(7,9);
        System.out.println(prt.college);
        System.out.println(prt.name);
        System.out.println(prt.rollnum);

        cd.multiplication(7,9);
        System.out.println(cd.batchnum);
        System.out.println(cd.studentname);

        System.out.println(cd.name);
        System.out.println(cd.rollnum);
        System.out.println(cd.college);
        cd.addition(6,9);
    }

    void multiplication(int x, int y)
    {
        int z= x*y;
        System.out.println(" values is "+z);
    }
}
