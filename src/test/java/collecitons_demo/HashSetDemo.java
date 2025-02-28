package collecitons_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
//        Set<String > setdemo = new HashSet<>();
        HashSet<String> setdemo = new HashSet<>();

        //add data inside a set
        setdemo.add("sample1");
        setdemo.add("sample2");
        setdemo.add("sample3");
        setdemo.add("sample3");
        setdemo.add("sample4");
        setdemo.add("sample5");

        System.out.println("get the total items : " + setdemo.size());

        //for each loop to loop through the items in the set
        for (String data : setdemo) {
            System.out.println("items inside set : " + data);
        }


        Iterator<String> iterator = setdemo.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
