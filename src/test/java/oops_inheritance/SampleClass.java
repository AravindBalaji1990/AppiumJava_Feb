package oops_inheritance;

public class SampleClass {
    String name = "sample parent variable";

    //parent class
    void addition() {
        int a = 1;
        int b = 2;
        int result = a + b;
        System.out.println("addition operation: " + result);
    }

    void testdemo(){
        System.out.println("this is private mehtod from parent");
    }
}
