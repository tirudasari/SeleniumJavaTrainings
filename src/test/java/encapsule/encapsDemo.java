package encapsule;

public class encapsDemo
{
    int x;
    int y;

    String name;

    public int getx()
    {
        return x;
    }

    public void gety()
    {
        System.out.println("djfgsdfs");
    }

    public String setName(String name)
    {
       this.name =name;
       return name;

    }

    public int setX(int x)
    {
        if(x>100)
        {
            this.x=x;
        }
        return x;
    }


}
