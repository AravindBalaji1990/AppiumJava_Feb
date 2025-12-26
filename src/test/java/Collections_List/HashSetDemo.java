package Collections_List;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        //initialise the hashset as below
//        HashSet<String> data = new HashSet<>();
        Set<String> test = new HashSet<>();

        //keyword add will behelp to add the elements inside the list
        test.add("sample1");
        test.add("sample2");
        test.add("sample3");
        test.add("sample4");
        test.add("sample4");
        test.add("sample5");
        test.add("sample5");

        for (String data: test){
            System.out.println("items in the set : " +data);
        }

        System.out.println("-------------------");
        //remove keyword to remove any elemnet within the set
//        test.remove("sample3");

//        for (String data: test){
//            System.out.println("items in the set after remove: " +data);
//        }
    }
}
