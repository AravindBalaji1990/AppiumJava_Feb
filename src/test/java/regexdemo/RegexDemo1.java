package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

    public static void main(String[] args) {
        String email = "testuser@gmail.com";
        System.out.println(email.matches("([a-zA-Z]){8}([@])(\\bgmail\\b)+([.])(\\bcom\\b)"));


        String otpvalidation = "you have the otp as 098765";
        Pattern pattern = Pattern.compile("[0-9]{6}");
        Matcher matcher = pattern.matcher(otpvalidation);

        while(matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
