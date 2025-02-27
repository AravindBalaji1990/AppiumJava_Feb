package oops_inheritance;

public interface ITestDemoInterface {
    // inside a interface you can have only declaration no implementation

    String name = null;

    public void addition();
    void demoRun();

     int multiply();

    public void demo();

    //after java 8 we can also use methods with declaraion tin iinterface
    // but its not mandatory to use as in methods withpout implementation
     default void Print() {
        System.out.println("this is print method from interface");
    }

}
