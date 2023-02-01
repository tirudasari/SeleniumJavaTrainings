package Abstraction;

public class abstract3 extends abstractDemo {

    public static void main(String args[]){

        abstract3 ab3 = new abstract3();
//        ab3.sub(30, 40);
    }


//    @Override
//    void sub(int x, int y) {
//        int c= x+y;
//    }

//    @Override
//    void sub(int x, int y, int z) {
//
//        int p= y*x+z;
//        System.out.println("the values is" + p);
//
//    }

    @Override
  public void sum(int x, int y) {
        int p= x+y+x;
    }
}
