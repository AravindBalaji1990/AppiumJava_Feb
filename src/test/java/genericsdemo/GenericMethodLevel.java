package genericsdemo;

public class GenericMethodLevel {

    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] intarr = {1,2,3,4,5};
        String[] strarray = {"sample1","sample2","sample3"};

        printArray(intarr);
        System.out.println("-------------");
        printArray(strarray);
    }
}
