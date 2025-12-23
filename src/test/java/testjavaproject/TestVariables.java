package testjavaproject;

public class TestVariables {
    //global
    String name = "appium";
    int number = 10000;
    char character = 'a';
    boolean value = true;

    public static void main(String[] args) {
        //local variable
        String firstname = "sample";
        TestVariables testvariable = new TestVariables();
        testvariable.name = "appium course";
        System.out.println(testvariable.name);
        System.out.println(testvariable.number);
        System.out.println(testvariable.character);
        System.out.println(testvariable.value);
        System.out.println(firstname);
    }
}
