package oops_inheritance;

public interface ITestDemo1 {

    public void demoRun1();

    void demoRun();

    private void test() {
        System.out.println("this is private in interface");
    }

    default void test1(){
        System.out.println("test data");
    }

    static void test2(){
        System.out.println("test data static");
    }
}
