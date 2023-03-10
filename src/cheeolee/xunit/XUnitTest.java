package cheeolee.xunit;

/**
 * testMethod를 수행 한 후 wasRun이 false에서 true로 변경되길 기대한다.
 */
public class XUnitTest {

    public static void main(String[] args) {
        WasRun wasRun = new WasRun();
        System.out.println(wasRun.wasRun); // false

        wasRun.testMethod();

        System.out.println(wasRun.wasRun); // true
    }

}
