package collecitons_demo;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        String str = "aapplleee";
        // initialisation of hash map
        Map<Object, Integer> charMap = new HashMap<Object, Integer>();

        // convert string to character array
        char[] arr = str.toCharArray();
        // get the lenght of the character array
        System.out.println("The length of character array : " + arr.length);


        for (char value : arr) {
            // validate the item coming in is a character
            if (Character.isAlphabetic(value)) {
                // validate whether the charmap contains the value or not
                if (charMap.containsKey(value)) {
                    // value is repeated add the value
                    charMap.put(value, charMap.get(value) + 1);

                } else {
                    charMap.put(value, 1);
                }
            }
        }
        System.out.println(charMap);
    }
}
