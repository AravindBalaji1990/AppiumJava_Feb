package Collections_List;

import java.util.*;

public class ListInJava_linkedList {

    public static void main(String[] args) {
        // initialise a array list
//        List<String> listofstring = new LinkedList<>();
        LinkedList<String> listofstring = new LinkedList<>();
        listofstring.add("sample1");
        listofstring.add("sample2");
        listofstring.add("sample3");
        listofstring.add("sample4");
        listofstring.add("sample5");

        System.out.println("to get one time from the list : " + listofstring.get(0));
        System.out.println("to get total items from  list : " + listofstring.size());

        // scenario to get the random element from the list
//        Random random1 = new Random();
//        System.out.println(random1.nextInt(1000));

        System.out.println("to get random items from  list : " + listofstring.get(new Random().nextInt(listofstring.size())));

        for (int i = 0; i < listofstring.size(); i++) {
            System.out.println(listofstring.get(i));
        }

        //where we can remove the items from the list
//        listofstring.remove(1);

        for (String data : listofstring) {
            System.out.println("this is from foreach loop : " + data);
        }

        Iterator<String> iterator = listofstring.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
