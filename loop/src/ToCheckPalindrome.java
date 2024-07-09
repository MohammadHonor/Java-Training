import java.util.Scanner;
public class ToCheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long rev=0;
        while(num>0){
             long lastDigit=num%10;
            rev=rev*10+lastDigit;
            num=num/10;
        }
        if(num==rev){
            System.out.println("Number is Palindrome");
        }
        else
            System.out.println("Number is not Palindrome");


    }
}

