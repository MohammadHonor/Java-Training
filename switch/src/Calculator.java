import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        int repeat=1;
        while(repeat==1){
            System.out.println("1.Addition\n2.Division\n3.Multipliction\n4.Substraction\n5.Exit\nCHOOSE OPERATION SHOWN ABOVE");
            int oper=sc.nextInt();

            switch(oper){
                case 1:
                    System.out.print("Enter The First Number ");
                    num1=sc.nextInt();
                    System.out.print("Enter The Second Number ");
                    num2=sc.nextInt();
                    int add=num1+num2;
                    System.out.println("Sum is "+add);
                    break;
                case 2:
                    System.out.print("Enter The First Number ");
                    num1=sc.nextInt();
                    System.out.print("Enter The Second Number ");
                    num2=sc.nextInt();
                    int mul=num1+num2;
                    System.out.println("Multiplication is "+mul);
                    break;
                case 3:
                    System.out.print("Enter The First Number ");
                    num1=sc.nextInt();
                    System.out.print("Enter The Second Number ");
                    num2=sc.nextInt();
                    int div=num1 / num2;
                    System.out.println("Division"+div);
                    break;
                case 4:
                    System.out.print("Enter The First Number ");
                    num1=sc.nextInt();
                    System.out.print("Enter The Second Number ");
                    num2=sc.nextInt();
                    int sub=num1-num2;
                    System.out.println("Substraction is "+sub);
                    break;
                case 5:
                    repeat=0;
                    break;
                default:
                    System.out.print("Please Choose Valid Operation");
                    break;

            }
        }
    }
}
