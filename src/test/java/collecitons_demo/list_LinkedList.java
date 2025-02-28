package collecitons_demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class list_LinkedList {

    public static void main(String[] args) {
        // differnet ways to initialise the list
//        List<String> data = new ArrayList<>();
        LinkedList<String> data1 = new LinkedList<>();

        // store daat to the list
        data1.add("sample1");//0
        data1.add("sample2");//1
        data1.add("sample3");//2
        data1.add("sample4");//3
        data1.add("sample5");//4

        System.out.println("to get the total items in the list : " + data1.size());
        System.out.println("to get specific data  : " + data1.get(3));

        for (int i = 0; i < data1.size(); i++) {
            System.out.println("the data : " + data1.get(i));
        }

        data1.remove(0);

        data1.add("sample6");

        for (int i = 0; i < data1.size(); i++) {
            System.out.println("the data : " + data1.get(i));
        }


    }
}
