import java.util.Scanner;

public class SimpleTraficLight {
    public static void main(String[] args) {
        System.out.println("1.Red\n2.Yellow\n3.Green\nChoose From Above");
        Scanner sc=new Scanner(System.in);
        int check=sc.nextInt();
        switch (check){
            case 1:
                System.out.println("Signal is Red");
                break;
            case 2:
                System.out.println("Siganal is Yellow");
                break;
            case 3:
                System.out.println("Signal is Green");
                break;
            default:
                System.out.println("please Enter valied");
        }
    }
}
