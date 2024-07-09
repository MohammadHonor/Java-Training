import java.util.Scanner;

public class WeekEndChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Day :");
        String day=sc.next();
        switch(day){
            case "sunday":
                System.out.println("Today is weekend");
                break;
            default:
                System.out.println("Today is not weekend");
        }
    }
}
