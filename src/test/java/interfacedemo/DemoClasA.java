package interfacedemo;

public class DemoClasA extends DemoClassC implements ISampleInterface {

    @Override
    public void demo1() {
        System.out.println("this is form DemoClassA");
    }

    @Override
    public int demo2() {
        return 1000;
    }

    public static void main(String[] args) {
        DemoClasA obj_democlassa = new DemoClasA();
        obj_democlassa.demo1();
        obj_democlassa.arithmeticOperation();
        System.out.println(obj_democlassa.demo2());
        ISampleInterface.demo3();

        DemoClasB obj_democlassb = new DemoClasB();
        obj_democlassb.demo1();
        System.out.println(obj_democlassb.demo2());
    }
}
