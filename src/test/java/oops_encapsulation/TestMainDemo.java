package oops_encapsulation;

public class TestMainDemo {
    String orderid = "abc123";

    public static void main(String[] args) {
        EncapsulationDemo object_encapsulationDemo = new EncapsulationDemo();
        object_encapsulationDemo.setName("sample java");
        System.out.println("this is forom pojo class : " + object_encapsulationDemo.getName());


        object_encapsulationDemo.setAge(34);
        System.out.println(object_encapsulationDemo.getAge());
    }
}
