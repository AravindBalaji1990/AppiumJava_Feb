package oops_inheritance;

public class ChildDemoCheck extends SampleClass implements ITestDemoInterface, ITestDemo1 {
    @Override
    public void addition() {
        System.out.println("this is addition sample from interface");
    }

    @Override
    public int multiply() {
        return 0 * 7;
    }

    @Override
    public void demo() {
        System.out.println("this is demo sample from interface");

    }

    public void parentRepresent() {
        super.addition();
    }

    public static void main(String[] args) {
        ChildDemoCheck childdemocheck = new ChildDemoCheck();
        childdemocheck.addition();
        childdemocheck.parentRepresent();
        childdemocheck.test1();
//        childdemocheck.test();// this is cannot be called as its private to interface
        ITestDemo1.test2(); // directly call the static via interface
        childdemocheck.testdemo();
    }

    @Override
    public void demoRun1() {

    }

    public void demoRun() {
        System.out.println("this is from another interface");
    }
}
