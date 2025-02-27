package oops_abstraction;

public class TestDemoRun extends testabstractdemo{
    @Override
    void demoPrint() {
        System.out.println("this is a demo print");
    }

    @Override
    int arithmeticOperation() {
        int result = 1+2;
        return result;
    }

    public static void main(String[] args) {
        // here the base class is the abstract class - where the methodsa re defined
        // reference class is where the implementation ois existing
        testabstractdemo obj = new TestDemoRun();
        System.out.println(obj.arithmeticOperation());
        obj.demoPrint();
        obj.sampletext();
    }
}
