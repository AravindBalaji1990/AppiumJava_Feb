package oops_inheritance;

public class SampleChildClass extends SampleClass implements ISampleInterface{

    public void multiply(){
        int a =3;
        int b =3;
        int result = a*b;
        System.out.println("the result of multiply : " + result);
    }

    @Override
    public void subtraction() {
        int result = 9-8;
        System.out.println("subtraciton result : " + result);
    }


    public static void main(String[] args) {
        SampleChildClass obj = new SampleChildClass();
        obj.addition();
        obj.multiply();
        obj.subtraction();
    }
}
