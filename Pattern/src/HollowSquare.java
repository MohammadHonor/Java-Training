import java.util.Scanner;
public class HollowSquare {
    public static void main(String[] args) {
        System.out.println("Enter Num of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter num of comlumn");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||i==n-1){
                    System.out.print("*"+" ");
                }
                 else if (j==0||j==m-1) {
                    System.out.print("*"+" ");

                }
                 else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
