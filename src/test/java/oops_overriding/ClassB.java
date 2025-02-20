package oops_overriding;

public class ClassB extends  ClassA{

    public void Test(int a){
        System.out.println("this is from parent class " + a);
    }

    public void fromParent(){
        super.Test(2000);
    }

    public static void main(String[] args) {

        // runtime polymorphism
        // when it implement the refenrece method then only
        // we can see the implementation dfrom where it is being called
        ClassA obj =new ClassB();
        obj.Test(100); // this will call the implementation from where?

        // fromt he child class
        ClassB obj2 =new ClassB();
        obj2.fromParent();
        obj2.Test(123);

        // object for parent class
        ClassA obj1 =new ClassA();
        obj1.Test(1000);
    }
}
