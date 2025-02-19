import java.util.Scanner;

public class JaggedArray{

    public static void main(String[] args) {
        
        int arr[][] = new  int [3][];
        Scanner sc = new Scanner(System.in);

        arr[0]=new int[5] ;
        arr[1] = new int [2];
        arr[2]= new int [1];

        for(int i =0; i<arr.length ; i++){

            System.out.print("Enter number");
            for (int j =0; j<arr[i].length ; j++){

                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i =0; i<arr.length ; i++){

            for (int j =0; j<arr[i].length ; j++){      
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        }
}