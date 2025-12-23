package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDemoExample {

    public static void main(String[] args) {
        int[] sample = {2, 5, 1, 9, 3, 1};
        System.out.println("Before sorting: " + sample[0]);
        Arrays.sort(sample);
        for (int i = 0; i < sample.length; i++) {
            System.out.println("the values inside array : " + sample[i]);
        }

        for (int data : sample) {
            System.out.println("the value inside array other forloop: " + data);
        }
        System.out.println("After sorting: " + sample[0]);

        System.out.println("----- 2 dimensional object array -----");
//        Object[][] sample2 = {{1, 2}, {3, 4}, {5, 6}};
        Object[][] sample2 = {{"Appium", 2, 234}, {"session", 3, 4}, {"welcome", 5, 6}};

        for (int i = 0; i < sample2.length; i++) {
            for (int j = 0; j < sample2[i].length; j++) {
                System.out.println("the values inside 2 dimensioanl  object array : " + i + " - " + sample2[i][j]);
            }
        }

//        List<Integer> intsam = new ArrayList<>();
//        intsam.add(1);
//        intsam.add(2);
//        intsam.add(1);
//        intsam.add(5);
//        intsam.add(5);
//        List<Integer> result = intsam.stream().distinct().collect(Collectors.toList());
//        System.out.println(result);
//
//        System.out.println(findDuplicates(intsam));
    }

    public static Set<Integer> findDuplicates(List<Integer> listContainingDuplicates) {
        final Set<Integer> setToReturn = new HashSet<>();
        final Set<Integer> set1 = new HashSet<>();

        for (Integer yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        return setToReturn;
    }

}
