import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        System.out.println("Enter a num");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=num;j>i;j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
