package cheeolee.xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

    protected final String name;

    public TestCase(String name) {
        this.name = name;
    }


    public TestResult run() {
        TestResult testResult = new TestResult();
        testResult.testStarted();

        setUp();

        try {
            Method method = this.getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        tearDown();


        return testResult;
    }


    public void setUp() {

    }

    public void tearDown() {

    }
}
