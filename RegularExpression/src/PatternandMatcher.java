import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pratik on 10/27/2017.
 */
public class PatternandMatcher {


    public static void main(String[] args){

        String email = "vivek.mitra@gmail.com";
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);

        if(mat.matches()){

            System.out.println("Valid email address");
        }else{

            System.out.println("Not a valid email address");
        }
    }

}
