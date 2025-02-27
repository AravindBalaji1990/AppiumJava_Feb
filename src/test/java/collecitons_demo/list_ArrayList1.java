package collecitons_demo;

import java.util.ArrayList;

public class list_ArrayList1 {

    public static void main(String[] args) {
        // differnet ways to initialise the list
//        List<String> data = new ArrayList<>();
        ArrayList<String> data1 = new ArrayList<>();

        // store daat to the list
        data1.add("sample1");//0
        data1.add("sample2");//1
        data1.add("sample3");//2
        data1.add("sample4");//4
        data1.add("sample5");//3

        ArrayList<String> data2 = new ArrayList<>();

        data2.add("sample5");//0
        data2.add("sample6");//1
        data2.add("sample7");//2
        data2.add("sample8");//4
        data2.add("sample9");//3

        data1.addAll(data2);

        for (int i =0 ; i< data1.size();i++){
            System.out.println(data1.get(i));
        }

        data1.clear();

        for (int i =0 ; i< data1.size();i++){
            System.out.println(data1.get(i));
        }

    }
}
