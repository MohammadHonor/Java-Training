import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a Number To Calculate Fibonacci");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int first=0;
        int second=1;
        System.out.print("0"+" ");

        for(int i = 2 ; i <=num ; i++){

                int fib = first + second;
                System.out.print(fib + " ");
                first = second;
                second = fib;

        }

    }
}
