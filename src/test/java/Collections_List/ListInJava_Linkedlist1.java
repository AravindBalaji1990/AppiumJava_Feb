package Collections_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInJava_Linkedlist1 {

    public static void main(String[] args) {
        // initialise a array list
//        List<String> listofstring = new ArrayList<>();
        LinkedList<String> listofstring1 = new LinkedList<>();
        listofstring1.add("sample1");
        listofstring1.add("sample2");
        listofstring1.add("sample3");
        listofstring1.add("sample4");
        listofstring1.add("sample5");



        LinkedList<String> listofstring2 = new LinkedList<>();
        listofstring2.add("sample6");
        listofstring2.add("sample7");
        listofstring2.add("sample8");
        listofstring2.add("sample9");
        listofstring2.add("sample1");

        //how can i combine both the list

//        listofstring1.addAll(listofstring2);
//        System.out.println(listofstring1);

        // i need to remove the common elements from the list
//        listofstring1.retainAll(listofstring2);
//        System.out.println(listofstring1);

        listofstring1.removeAll(listofstring2);
        System.out.println(listofstring1);

    }
}
