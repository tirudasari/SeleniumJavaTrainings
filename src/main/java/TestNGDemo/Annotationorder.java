package TestNGDemo;

import org.testng.annotations.*;

public class Annotationorder {


    @BeforeSuite
    public void BeforeSuite()
    {
        System.out.println("This is BeforeSuite");
    }

    @BeforeTest
    public void Beforetest()
    {
        System.out.println("This is BeforeTest");
    }
    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("This is BeforeClass");
    }


    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("This is BeforeMethod");
    }

    @Test
    public void MainTest()
    {
        System.out.println("This is MainTest");
    }
    @Test
    public void MainTest2()
    {
        System.out.println("This is MainTest2");
    }
    @Test
    public void MainTest3()
    {
        System.out.println("This is MainTest3");
    }

    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("This is AfterMethod");
    }

    @AfterClass
    public void AfterClass()
    {
        System.out.println("This is AfterClass");
    }

    @AfterTest
    public void Aftertest()
    {
        System.out.println("This is AfterTest");
    }

    @AfterSuite
    public void AfterSuite()
    {
        System.out.println("This is AfterSuite");
    }
}
