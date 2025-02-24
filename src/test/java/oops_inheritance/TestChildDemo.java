package oops_inheritance;

public class TestChildDemo extends TestParentDemo {
    String name = "this is from child";

    public void demoPrint() {
        System.out.println("this is a function from child");
    }

    public void callingFromParent(){
        // it will always point to the parent
        System.out.println(super.name);
        super.demoPrint();

    }

    public static void main(String[] args) {
        TestChildDemo testchilddemo = new TestChildDemo();
        testchilddemo.demoPrint();
        System.out.println(testchilddemo.name);
        testchilddemo.callingFromParent();

        // this is a work a around for if the same name and mehtod is there in the parent and child
//        TestParentDemo testParentDemo = new TestParentDemo();
//        testParentDemo.demoPrint();
//        System.out.println(testParentDemo.name);

    }
}
