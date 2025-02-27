package oops_abstarction2;

public abstract class abstractdemo {
    String type;

    abstractdemo(String type){
        this.type = type;
        System.out.println("the type : " +type);
    }

    abstract void sample();

}
