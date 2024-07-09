import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int m=num/2;
        int f=0;
        if(num==0 || num==1){
            System.out.println(num+" is not Prime Number");
        }
        else {
            for(int i=2;i<=m; i++){
              if(num%i==0){
                  System.out.println(num+"Is not prime number");
                  f=1;
                  break;
              }
            }
        }
        if(f==0){
            System.out.println(num+"Is prime number");
        }
        sc.close();
    }
}
