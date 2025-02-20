package Collections_List;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> test = new HashSet<>();
        test.add("sample1");
        test.add("sample2");
        test.add("sample3");
        test.add("sample4");
        test.add("sample5");

        for (String data: test){
            System.out.println("items in the set : " +data);
        }

        System.out.println("-------------------");
        test.remove("sample3");
        for (String data: test){
            System.out.println("items in the set : " +data);
        }
    }
}
