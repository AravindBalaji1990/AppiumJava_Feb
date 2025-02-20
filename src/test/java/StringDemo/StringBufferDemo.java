package StringDemo;

public class StringBufferDemo {
    StringBuffer sb = new StringBuffer("Hi ");
    public void appendBuffer(String str){
        sb.append(str);
        System.out.println(Thread.currentThread().getName() + " - " +sb);

    }

    public static void main(String[] args) {
        StringBufferDemo sbd = new StringBufferDemo();
        Thread t1 = new Thread(() -> sbd.appendBuffer(" sampel1"));
        Thread t2 = new Thread(() -> sbd.appendBuffer(" sampel2"));
        Thread t3 = new Thread(() -> sbd.appendBuffer(" sampel3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
