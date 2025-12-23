package testjavaproject;

public class TestArraySplit {

    public static void main(String[] args) {
        String name = "sample";
        char[] test = name.toCharArray();// this will convert the string to each character as arrays
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

}
