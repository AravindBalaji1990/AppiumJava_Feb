package StringDemo;

import java.util.StringTokenizer;

public class StringTokenizerDemoAlternative {

    public static void main(String[] args) {
        String name ="this is java autoamtion session";
        String[] data = name.split(" ");
        for (String dataafter  : data ){
            System.out.println(dataafter);
        }
    }


}
