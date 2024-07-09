import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){

            num=num/10;
            count++;
        }
        System.out.println("Total digit is "+count);
    }
}
