package oops_overriding;

public class ClassB extends  ClassA{

    public void Test(int a , int b){
        int result = a* b;
        System.out.println("Multiply Result : " +result);
    }

    public static void main(String[] args) {

        // runtime polymorphism
        // when it implement the refenrece method then only
        // we can see the implementation dfrom where it is being called
        // name of the method will be from classA but the impolemenetaiton is form classB
        ClassA obj =new ClassB();
        obj.Test(100, 2); // this will call the implementation from where?

        // fromt he child class
//        ClassB obj2 =new ClassB();
//        obj2.fromParent();
//        obj2.Test(123);
//
//        // object for parent cla
    }
}
