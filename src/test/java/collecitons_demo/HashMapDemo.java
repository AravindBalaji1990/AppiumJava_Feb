package collecitons_demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
//        Map<String , String> mapdata = new HashMap<>();
        HashMap<Integer, String> mapdata = new HashMap<>();

        //add data to map
        mapdata.put(100, "sample1");
        mapdata.put(101, "sample2");
        mapdata.put(102, "sample3");
        mapdata.put(103, "sample4");
        mapdata.put(104, "sample5");
        mapdata.put(104, "sample6");
        mapdata.put(105, null);
        mapdata.put(null, null);

        System.out.println("get an item fromt he Hashmap : " + mapdata.get(101));

        mapdata.remove(null); // remove data should have the key

        mapdata.put(105, "sample7"); // this is used to appedn or add the data to the map

        // entryset is the data that is inside the hashmap
        //map.entry - this represnt sthe key and value
        // duplciates based only onthe key will be eradicated
        //values can have duplicates
        for (Map.Entry<Integer, String> data : mapdata.entrySet()) {
            System.out.println("the key data from the hashmap  :  " + data.getKey());// to get the key
            System.out.println("the value data from the hashmap  :  " + data.getValue()); // to get the values
        }
    }
}
