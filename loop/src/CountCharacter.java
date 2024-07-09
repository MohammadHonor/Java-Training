import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int counter=0;
        char c='p';
        char[]ch=s1.toCharArray();
        for(char value:ch){
            if(value==c){
                counter++;

            }

        }
        System.out.println(counter);
    }
}
