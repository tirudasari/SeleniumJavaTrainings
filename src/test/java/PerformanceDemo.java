public class PerformanceDemo {

    public static void main(String args[])
    {

        long startTime = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer("selenium");

            for( int x=0; x<=5000;x++){
                sbf.append("abc");
            }
        System.out.println(sbf);
            System.out.println("Time for Buffer task is: "+(System.currentTimeMillis()-startTime)+"ms");

        long startTime1 = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder("selenium");
        for( int x=0; x<=5000;x++){
            sbd.append("abc");
        }
        System.out.println(sbd);
        System.out.println("Time for Builder task is: "+(System.currentTimeMillis()-startTime1)+"ms");

    }
}
