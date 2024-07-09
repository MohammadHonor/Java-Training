import java.util.Scanner;

public class Rohmbus {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int space=0;space<=i;space++){
                System.out.print(" ");
            }

            for(int j=0;j<r;j++){
                System.out.print("*");
                }

            System.out.println();



        }

    }
}
