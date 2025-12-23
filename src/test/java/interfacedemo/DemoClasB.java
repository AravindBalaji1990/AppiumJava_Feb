package interfacedemo;

public class DemoClasB implements ISampleInterface {

    @Override
    public void demo1() {
        System.out.println("this is form DemoClassB");
    }

    @Override
    public int demo2() {
        return 2000;
    }
}
