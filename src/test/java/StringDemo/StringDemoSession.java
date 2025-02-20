package StringDemo;

public class StringDemoSession {

    public static void main(String[] args) {
        String name = "appium";
        System.out.println(name);
        name = "appium demo";
        System.out.println(name);

        // if i want to combine 2 strings together

        String firstname ="appium";
        String lastname ="session";
        System.out.println(firstname.concat(lastname));

        // how does this string operaiton happenin StringBuilder

        StringBuilder sp = new StringBuilder("sample");
        System.out.println(sp);

        sp.append(" example");
        System.out.println(sp);

//        sp.reverse();
//        System.out.println(sp);
//        sp.substring(1,5);
        System.out.println(sp.replace(1,5, "y"));

        //String BUffer

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);

        sb.append("good afternoon");

        System.out.println(sb);

        System.out.println(sb.reverse());





    }
}
