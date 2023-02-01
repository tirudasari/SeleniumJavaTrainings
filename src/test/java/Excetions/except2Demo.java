package Excetions;
import java.lang.String;

public class except2Demo {

    int roll[]={10,20,30};  // index value starts from ZERO

    public static void main(String args[]) {

        except2Demo obj2 = new except2Demo();

        obj2.addarray();

        }

    void addarray()
    {
        System.out.println(roll[4]);


    }


}
