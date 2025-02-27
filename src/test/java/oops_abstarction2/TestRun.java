package oops_abstarction2;

public class TestRun extends abstractdemo {
    String data;

    TestRun(String data) {
        super("sample");// this super will refer to the constructor in the abstarct class
        this.data = data;
        System.out.println("sample data : " + data);
    }

    @Override
    void sample() {
        System.out.println("this is a sample method");
    }


    public static void main(String[] args) {
        TestRun obj = new TestRun("xyz");
        obj.sample();
    }
}
