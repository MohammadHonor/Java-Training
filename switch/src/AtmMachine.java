import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        double account=0;
        int r=1;
        Scanner sc=new Scanner(System.in);
        long pin=1234;
        System.out.println("WELCOME TO ATM MACHINE\nEnter your Four Digit PIN Number");
        long p=sc.nextLong();
        while(r==1){
            if(p==pin){
                System.out.println("1.To Check Balance\n2.To Deposit Money In Your Account\n3.To Withdraw Money From Account\n4To Close Account\nCHOOSE YOUR REQUIREMENT FROM ABOVE:");
                int oper=sc.nextInt();
                switch(oper){
                    case 1:
                        System.out.println("Your Balance is "+account+" Rs");
                        break;
                    case 2:

                        System.out.print("Enter Amount=");
                        double amt=sc.nextDouble();
                        account+=amt;
                        System.out.println("Your amount successfully deposit");
                        System.out.println("Now Your Balance is "+account+" Rs");
                        break;
                    case 3:
                        System.out.print("WELCOME TO WITHDRAW INTERFACE\nEnter your amount=");
                        double wtd=sc.nextDouble();
                        if(account>wtd) {
                            account -= wtd;
                            System.out.println("Your Total balance is " + account + " Rs");
                        }
                        else
                            System.out.println("Your Balance is not enough");
                        break;
                    case 4:
                        r=0;
                        break;
                    default:
                        System.out.println("your Requirement is Wrong");
                }

            }
            else{
                System.out.println("Your PIN Number is Wrong");
                r=0;
            }


        }


    }
}
