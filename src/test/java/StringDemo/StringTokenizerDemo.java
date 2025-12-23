package StringDemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        // String tokenoizert - is used to segregrate the data or divide the data
        StringTokenizer st = new StringTokenizer("Hi I am , from India");
        while (st.hasMoreTokens()) {
            System.out.println("this is without delimiter : " + st.nextToken());
        }
        System.out.println("-------------");

        StringTokenizer st1 = new StringTokenizer("Hi I am , from India", ",");
        while (st1.hasMoreTokens()) {
            System.out.println("this is with delimter in string tokeniser : " + st1.nextToken());
        }

        System.out.println("-------------");
        StringTokenizer st2 = new StringTokenizer("Hi I am , from India", ",", true);

        while (st2.hasMoreTokens()) {
            System.out.println("this is with delimter with return in string tokeniser : " + st2.nextToken());
        }
    }


}
