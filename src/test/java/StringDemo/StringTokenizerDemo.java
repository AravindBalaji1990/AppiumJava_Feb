package StringDemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        // String tokenoizert - is used to segregrate the data or divide the data
        StringTokenizer st = new StringTokenizer("Hi I am , from India");

        StringTokenizer st1 = new StringTokenizer("Hi I am , from India", ",");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

        System.out.println("-------------");
        StringTokenizer st2 = new StringTokenizer("Hi I am , from India", ",", true);

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }


}
