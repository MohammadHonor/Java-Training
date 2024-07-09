import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of line");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){

            for(int j=0;j<=size;j++){
                if(j==0|| i==size-1) {
                    System.out.print("*");
                }
            }
            for(int space=0;space<i;space++) {
                System.out.print(" ");
            }
            if(i>0||i<size-1) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
