package oops_inheritance;

public class SampleChildClass extends SampleClass{

    //child class
    public void multiply(){
        int a =3;
        int b =3;
        int result = a*b;
        System.out.println("the result of multiply : " + result);
    }


    public static void main(String[] args) {

        SampleChildClass samplechildclass = new SampleChildClass();
        samplechildclass.addition();
        samplechildclass.multiply();
        System.out.println("getting the variable from parent  : " + samplechildclass.name);
    }
}
