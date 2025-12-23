package oops_overloading;

public class OverloadingDemoSample {

    public void demoOperation() {
        System.out.println("this is mehtod without parameter");
    }

    public void demoOperation(int a, int b) {
        int result = a * b;
        System.out.println("the reuslt of operation :" + result);
    }

    public void demoOperation(int a, int b, String data) {
        int result = a * b;
        System.out.println(data + ":" + result);
    }

    public static void main(String[] args) {
        OverloadingDemoSample obj = new OverloadingDemoSample();
        obj.demoOperation();
        obj.demoOperation(2,3);
        obj.demoOperation(4,5,"this is my result");
    }
}
