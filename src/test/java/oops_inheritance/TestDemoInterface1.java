package oops_inheritance;

public class TestDemoInterface1 implements ITestDemoInterface {
    @Override
    public void addition() {
        System.out.println("this is a addition mehtod");

    }

    @Override
    public int multiply() {
        return 2 * 3;
    }

    @Override
    public void demo() {

    }

    public static void main(String[] args) {
        TestDemoInterface1 obj1 = new TestDemoInterface1();
        obj1.addition();
        System.out.println(obj1.multiply());
        TestDemoInterface2 obj2 = new TestDemoInterface2();
        obj2.addition();
        System.out.println(obj2.multiply());
    }
}
