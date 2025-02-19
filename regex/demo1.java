import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo1{
    public static void main(String[] args) {
        
        String s = "mohammad";

        Pattern p = Pattern.compile("a-z");
        Matcher match = p.matcher(s);
        boolean b = match.matches();
        System.out.println(b);
    }
}