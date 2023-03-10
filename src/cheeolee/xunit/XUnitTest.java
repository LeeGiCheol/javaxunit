package cheeolee.xunit;

/**
 * 기존의 테스트를 테스트 할 수 있도록 TestCaseTest 클래스로 옮긴다.
 */
public class XUnitTest {

    public static void main(String[] args) {
        new TestCaseTest("testRunning").run();
    }

}
