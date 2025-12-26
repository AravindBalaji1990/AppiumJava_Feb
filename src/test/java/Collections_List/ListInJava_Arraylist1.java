package Collections_List;

//import java.util.ArrayList;
//import java.util.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInJava_Arraylist1 {

    public static void main(String[] args) {
        // initialise a array list
//        List<String> listofstring = new ArrayList<>();

        ArrayList<String> listofstring1 = new ArrayList<>();

        // add the element inside the list we use add keyword

        listofstring1.add("sample1");
        listofstring1.add("sample2");
        listofstring1.add("sample3");
        listofstring1.add("sample5");
        listofstring1.add("sample4");
        listofstring1.add("sample4");

        // size will help us to get the total items from the list
//        for(int i =0 ;i< listofstring1.size();i++){
//            //listofstring1.get(i) - this will help us to get the individual element from the list
//            System.out.println("the items inside the list : " + listofstring1.get(i));
//        }


        ArrayList<String> listofstring2 = new ArrayList<>();
        listofstring2.add("sample6");
        listofstring2.add("sample7");
        listofstring2.add("sample8");
        listofstring2.add("sample9");
        listofstring2.add("sample1");

        //how can i combine both the list

        listofstring1.addAll(listofstring2);
        System.out.println(listofstring1);

//         i need to remove the common elements from the list
        listofstring1.retainAll(listofstring2);
        System.out.println(listofstring1);

//         removeall willremove the common element from the two lists
        listofstring1.removeAll(listofstring2);
        System.out.println(listofstring1);

    }
}
