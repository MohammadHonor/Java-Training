import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        boolean check=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()!=s2.length()){
            check=false;
        }
        else {
            char[]chars=s1.toCharArray();
        }


    }
}
