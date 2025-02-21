package constrcutordemo;

public class ConstrcutorDefaultExample {

    //global variable
    String name = "Java Automation";
    String lastname = null;
    String address = null;

    // constructor name should be same as the class name
    // default constrcutor - there is no parameter just the name of hte class is used
    public ConstrcutorDefaultExample() {
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
        ConstrcutorDefaultExample objectdemo = new ConstrcutorDefaultExample();
        objectdemo.demoApp();
    }
}
