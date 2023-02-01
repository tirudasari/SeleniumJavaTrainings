package Abstraction;

import interfaces.interface1;
import interfaces.interface2;
import interfaces.interfacedemo;

public abstract class Abstractmethoddemo implements interfacedemo, interface1, interface2
{

    int x=10;

    int y=20;
    String name= "hyderabad";

//    void addition(int x, int y){  // concret method
//
//        int z= x+y;
//        System.out.println("the added values is "+z);
//    }

    abstract void  sub(int x, int y);  // abstract method

//    Abstractmethoddemo obj1 = new Abstractmethoddemo()
//    {
//        @Override
//        void sub(int x, int y)
//        {
//
//        }
//
//        @Override
//        public void multiplication()
//        {
//
//        }
//
//        @Override
//        public void addition(int x, int y)
//        {
//
//        }
//
//    };
//    interfacedemo ifdemo = new interfacedemo()
//   {
//    @Override
//    public void multiplication()
//    {
//
//    }
//
//    @Override
//    public void addition(int x, int y)
//    {
//
//    }
//  };


    void multiplication1(int a, int b)
    {
        int c= a+b;
        System.out.println(c);
    }
}
