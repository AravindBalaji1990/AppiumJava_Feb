package oops_overloading;

public class OverlaodingDemo {

    public void samplemethod(String name){
        System.out.println("the name given  :  " +name);
    }

    /*public void samplemethod(String fname){
        System.out.println("the name given  :  " +fname);
    }*/

    public void samplemethod(int a , int b){
        int result = a/b;
        System.out.println("the result set : " + result);

    }
    public void samplemethod(){
        System.out.println("methods");
    }

    public void samplemethod(int c, float b){

    }


    public static void main(String[] args) {
        OverlaodingDemo overlaodingdemo = new OverlaodingDemo();
        overlaodingdemo.samplemethod(12,4);
        overlaodingdemo.samplemethod("sample");
        overlaodingdemo.samplemethod();
    }
}
