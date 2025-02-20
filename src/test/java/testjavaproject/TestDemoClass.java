package testjavaproject;

public class TestDemoClass {

    public static void main(String[] args) {
        System.out.println("test");
        addition();


        // non static method cannot be accessed by a static method
        // we need to have a object created in order to access a statis method
        // BaseClass object = new ReferenceClass()
        TestDemoClass testdemoclass = new TestDemoClass();
        System.out.println(testdemoclass.multiple());
        testdemoclass.subtraction(5,4);
        testdemoclass.subtraction(7,9);
    }

    //Method without return type
    public static void addition(){
        int a =1;
        int b =2;
        int result = a+b;
        System.out.println("the result of addition : " + result);
    }

    //Method with return type
    public int multiple(){
        int a =1;
        int b =2;
        int result = a*b;
        return result;
    }


    //methdo with paramter
    public  void  subtraction(int a, int b){
        int result = a-b;
        System.out.println("subtraction result: " +result);
    }


}
