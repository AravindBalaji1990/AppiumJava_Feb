package oops_inheritance;

public class TestDemoInterface2 implements ITestDemoInterface {
    @Override
    public void addition() {
        int a = 2;
        int b = 3;
        int result = a + b;
        System.out.println("the addition result : " + result);

    }

    @Override
    public int multiply() {
        return 6 * 7;
    }

    @Override
    public void demo() {

    }
}
