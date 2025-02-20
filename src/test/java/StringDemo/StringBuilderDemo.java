package StringDemo;

public class StringBuilderDemo implements Runnable {
    StringBuilder sb = new StringBuilder("Hi ");
    public void appendBuffer(String str){
        sb.append(str);
        System.out.println(Thread.currentThread().getName() + " - " +sb);

    }

    public void run(){
        appendBuffer(" data");
    }

    public static void main(String[] args) {
        StringBuilderDemo sbd = new StringBuilderDemo();
        Thread t1 = new Thread( sbd,"sample1");
        Thread t2 = new Thread( sbd,"sample2");
        Thread t3 = new Thread( sbd,"sample3");

        t1.start();
        t2.start();
        t3.start();

    }
}
