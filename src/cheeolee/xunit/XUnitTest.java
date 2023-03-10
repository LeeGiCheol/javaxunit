package cheeolee.xunit;

/**
 * 이 테스트 코드는 testMethod만을 위한 것이 아니기 때문에 이름을 run으로 수정하고,
 * 생성자를 통해 테스트를 수행할 메서드 명을 전달한다.
 */
public class XUnitTest {

    public static void main(String[] args) {
        WasRun wasRun = new WasRun("testMethod");
        System.out.println(wasRun.wasRun); // false

        wasRun.run();

        System.out.println(wasRun.wasRun); // true
    }

}
