package cheeolee.xunit;

public class TestResult {

    int runCount = 1;


    public String getSummary() {
        return runCount + " run, 0 failed";
    }

}
