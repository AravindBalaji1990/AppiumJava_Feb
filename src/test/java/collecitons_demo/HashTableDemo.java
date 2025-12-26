package collecitons_demo;

import java.util.*;

public class HashTableDemo {

    public static void main(String[] args) {

        // initialisation of the hashtable
//        Dictionary<Integer, String> ht = new Hashtable<>();
        Hashtable<Integer, String> ht = new Hashtable<>();

        // to add the element in isde the list - put
        ht.put(100,"sample1");
        ht.put(101,"sample2");
        ht.put(102,"sample3");
        ht.put(103,"sample4");
        ht.put(104,"sample5");
        ht.put(105,"sample6");
        ht.put(106,"sample7");
        ht.put(106,"sample8");
        ht.put(null,null); // not accepted in hashtable

        for (Map.Entry<Integer, String> data : ht.entrySet()) {
            System.out.println("the key data from the hashmap  :  "+data.getKey());
            System.out.println("the value data from the hashmap  :  "+data.getValue());
        }





    }
}
