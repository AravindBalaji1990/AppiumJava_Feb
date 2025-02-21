package constrcutordemo;

public class ConstrcutorDemoExample {

    //global variable
    String name = "Java Automation";
    String lastname = null;
    String address = null;

    // constructor name should be same as the class name
    // default constrcutor - there is no parameter just the name of hte class is used
    public ConstrcutorDemoExample(String name) {
        // this is a keyword which will reference variable to the current instance
        // Java Automaiton = demo run
        this.name = name;
        this.lastname = "sample last name";
        this.address = "demo";
        demoSample();

    }

    public void demoSample() {
        System.out.println("this is a sample mehtod from constructor");
    }

    public void demoApp() {
        // here we are re initialising at the mehtod level
        name = "this is from method level";
        // this is akeyword whihc will call the current instance of the variable
        System.out.println("this is a sample method - " + name);
    }

    public static void main(String[] args) {
        // why we will get error - becasue the constrcutor now has become a parameterised constrcutor
        //so the reference class is expecting a parameter to be passed
        ConstrcutorDemoExample objectdemo = new ConstrcutorDemoExample("demo run");
        objectdemo.demoApp();
//        ConstrcutorDemoExample objectdemo1 = new ConstrcutorDemoExample("demo run 2");
//        objectdemo1.demoApp();

    }
}
