package collectionsframework;

import java.util.*;

public class mapsDemo {


    public static void main(String args[]) {

        Map<String,String> abc = new HashMap<String,String>();
        Map<String,String> abc1= new TreeMap<String,String>();
        Map<String,String> abc2 = new LinkedHashMap<String,String>();

        abc1.put("India","Delhi");
        abc1.put("USA","WDC");
        abc1.put("Canada","Toronto");
        abc1.put("Telangana","Hyderabad");
        System.out.println(abc1.entrySet());
        System.out.println(abc1.keySet());
        System.out.println(abc1.values());
        abc1.put(null,"Securbad");





    }

    }
