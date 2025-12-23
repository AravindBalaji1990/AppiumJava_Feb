package oops_overriding;

import interfacedemo.DemoClasB;

public class DemoSampleB extends DemoSampleA {

    public void demoSample(int a, int b) {
        int result = a * b;
        System.out.println("the result : " + result);
    }


    public static void main(String[] args) {
        DemoSampleA obj = new DemoSampleB();
        obj.demoSample(3,4);
    }
}
