package StringDemo;

public class StringBUffervsStringBUilder {

    public static void main(String[] args) {
        long starttime;
        long endtime;

        StringBuffer sb = new StringBuffer("ABC");
        starttime = System.nanoTime();
        for(int  i=0; i<10000; i++){
            sb.append(" String buffer");
        }
        endtime = System.nanoTime();
        System.out.println("time for String buffer : " + (endtime - starttime));

        StringBuilder sbd = new StringBuilder("ABC");
        starttime = System.nanoTime();
        for(int  i=0; i<10000; i++){
            sbd.append(" String buffer");
        }
        endtime = System.nanoTime();
        System.out.println("time for String builder : " + (endtime - starttime));
    }
}
