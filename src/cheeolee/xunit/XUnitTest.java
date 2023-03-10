package cheeolee.xunit;

public class XUnitTest {

    public static void main(String[] args) {
        suiteRun(getAllTestCase());
        suiteRun(getAllTestCaseByCompositePattern());
    }

    private static TestSuite getAllTestCase() {
        return TestCaseTest.suite();
    }


    private static TestSuite getAllTestCaseByCompositePattern() {
        TestSuite suite = new TestSuite();
        suite.add(new TestCaseTest("testTemplateMethod"));
        suite.add(getAllTestCase());

        return suite;
    }

    private static void suiteRun(TestSuite suite) {
        TestResult result = new TestResult();
        suite.run(result);

        System.out.println(result.getSummary());
    }

}
