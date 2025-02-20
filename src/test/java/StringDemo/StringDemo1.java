package StringDemo;

public class StringDemo1 {

    public static void main(String[] args) {
//        String name = new String("java");
//        name = name.concat("automation");
//        System.out.println("the value :" + name);

//        StringBuffer sb = new StringBuffer("Java Program");
//        sb.append(" automation");
//        System.out.println("String buffer value : " +sb);
//        System.out.println(sb.reverse());
//        System.out.println(sb.delete(4,5));
//        System.out.println(sb.substring(5));
//        System.out.println(sb.replace(4,5,","));
        // String Buffer - Thread Safe - synchronised - suitable for multi threaded concepts
        // since its synchronised - its alwasys slow
        // Thread - each program is going to runas a seprate session

        StringBuilder sbd = new StringBuilder("Java Program");
        sbd.append(" automaiton");
//        System.out.println(sbd.reverse());
        System.out.println(sbd.replace(4,5,","));

        // Strign Builder are not thread safe - non -synchronised process - faster - single threaded environment



    }
}
