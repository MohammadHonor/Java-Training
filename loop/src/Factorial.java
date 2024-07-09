import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Calculate Factorials");
        long num=sc.nextLong();
        long fact=1;
        while (num!=0){
            fact=fact*num;
            num--;
        }
        System.out.println("Factorials is "+fact);

    }
}
