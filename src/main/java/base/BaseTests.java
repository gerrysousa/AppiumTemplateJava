package base;

import helpers.DriverFactory;
import helpers.ExtentReportsUtils;
import org.testng.ITestResult;
import org.testng.annotations.*;
import helpers.GlobalParameters;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseTests {

    @BeforeSuite
    public void beforeSuite() {
        new GlobalParameters();
        new DriverFactory();
        ExtentReportsUtils.createReport();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method method) {
        ExtentReportsUtils.addTest(method.getName(), method.getDeclaringClass().getSimpleName());
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) throws IOException
    {
        ExtentReportsUtils.addTestResult(result);
        ExtentReportsUtils.generateReport();
        DriverFactory.killDriver();
    }

    @AfterSuite
    public void afterSuite(){
        ExtentReportsUtils.generateReport();
        DriverFactory.killDriver();
    }

    /** Sets thread name which includes thread id */
    private void setCurrentThreadName() {
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        String threadId = String.valueOf(thread.getId());
        if (!threadName.contains(threadId)) {
            thread.setName(threadName + " " + threadId);
        }
    }
}