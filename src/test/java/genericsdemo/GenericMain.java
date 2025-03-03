package genericsdemo;

public class GenericMain {
    public static void main(String[] args) {
        Box<Integer> obj_box = new Box<>(100);
        System.out.println(obj_box.getItem());
        Box<String> obj_box1 = new Box<>("String sample");
        System.out.println(obj_box1.getItem());
    }
}
