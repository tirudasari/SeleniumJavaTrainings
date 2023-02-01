package TestNGDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenersDemo implements ITestListener {


    public void onTestFailure(ITestResult result)
    {
        System.out.println("This is the listeners for test failure");
    }

    public void onTestSuccess(ITestResult result)
    {
        System.out.println("This is the listeners for test test success");
    }
}
