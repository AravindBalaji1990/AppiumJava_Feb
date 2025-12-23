package exceptionhandling;

public class TestExceptionDemo1 {

    public static void main(String[] args) throws Exception {
//        demoArithmetic();
        demoTest();
    }


    public static void demoArithmetic() {
        try {
            //logic will exists
            int a = 5 / 5;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("this si specific exception");
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("this is being excuted");
        }
    }

    public static void demoTest() throws ArithmeticException, Exception{
        int a = 5 / 0;
        System.out.println("this is the result : " +a);
    }
}
