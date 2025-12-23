package oops_inheritance;

public class TestDemoInterface3 implements  ITestDemoInterface, ITestDemo1 {
    @Override
    public void addition() {
        int result = 9+8;
        System.out.println("the addition validation :  "+ result);

    }

    @Override
    public void demoRun1() {

    }

    @Override
    public void demoRun() {
        System.out.println("demo run");
    }

    @Override
    public int multiply() {
        return 7*7;
    }

    @Override
    public void demo() {
        System.out.println("demo run sample");

    }

    public static void main(String[] args) {
        TestDemoInterface3 obj = new TestDemoInterface3();
        obj.addition();
        obj.Print();

        TestDemoInterface4 obj1 = new TestDemoInterface4();
        obj1.addition();
    }
}
