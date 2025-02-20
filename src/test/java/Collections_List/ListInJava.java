package Collections_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInJava {

    public static void main(String[] args) {
        // initialise a array list
//        List<String> listofstring = new ArrayList<>();
        ArrayList<String> listofstring = new ArrayList<>();
        listofstring.add("sample1");
        listofstring.add("sample2");
        listofstring.add("sample3");
        listofstring.add("sample4");
        listofstring.add("sample5");




        for (int i =0;i < listofstring.size();i++){
            System.out.println(listofstring.get(i));
        }

        listofstring.remove(1); //where we can remove the items from the list
        for(String data: listofstring){
            System.out.println("this is from foreach loop : " +data);
        }
//
//        Iterator<String> iterator = listofstring.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
