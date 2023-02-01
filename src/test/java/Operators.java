import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Operators {

    public static void main(String[] args)
    {
        int x=20;
        int y=50;
        int z;
        z=x+y;
        int p=y-x;
        x+=5; // x=x+5;

        System.out.println("After assigning"+x);
        x-=2; //x=x-2
        System.out.println("After assigning"+x);

        // if--- else
        if(x>20)
        {
            System.out.println(" New Value"+x);
        }
        else
        {
            System.out.println("not meeting the conditon"+x);
        }


//        else if


        if(x>200)
        {
            System.out.println(" New Value"+x);
        }
        else if (x<15)
        {

            System.out.println(" New Value"+x);
        }
        else if(x==23)
        {
            System.out.println(" New Value"+x);
        }
        else
        {
            System.out.println(" else block value"+x);
        }





    }
}
