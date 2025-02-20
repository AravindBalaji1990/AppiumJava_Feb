package StringDemo;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokeniserExample {
    public static void main(String[] args) {
        // it will split the string
//        StringTokenizer st = new StringTokenizer("sample session, for appium",",");
//
//        while (st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }

        //split - alternatoive to string tokeniser
        String sentence = "this, is going ,to be, a good session";
        System.out.println(sentence.split(","));

        String [] splitsentence = sentence.split(",");

        System.out.println(splitsentence.toString());
        System.out.println(Arrays.toString(splitsentence));

        //for each loop - just loop in the values
        for(String splitsentencevalue :splitsentence){
            System.out.println(splitsentencevalue);
        }

    }
}
