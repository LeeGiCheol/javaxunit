package cheeolee.xunit;

import java.lang.reflect.Method;

public class TestCase {

    protected final String name;

    public TestCase(String name) {
        this.name = name;
    }


    public void run(TestResult testResult) {
        testResult.testStarted();

        setUp();

        try {
            Method method = this.getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
            testResult.testFailed();
        }

        tearDown();
    }


    public void setUp() {

    }

    public void tearDown() {

    }
}
