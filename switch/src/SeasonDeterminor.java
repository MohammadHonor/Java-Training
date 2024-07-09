import java.util.Scanner;

public class SeasonDeterminor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Month Name:");
        String month=sc.next();
        switch (month.toUpperCase()){
            case "JULY":
            case "AUGUST":
                System.out.println("Monsoon(Versa Rotu)");
                break;
            case"SEPTEMBER":
            case "OCTOBER":
                System.out.println("Autumn(Sharad Ritu)");

                break;
            case "NOVEBER":
            case "DECEMBER":
                System.out.println("Pre_winter(Hemant Ritu)");
                break;
            case"JANUARY":
            case"FEBRUARY":
                System.out.println("winter(Shishir or Shita Ritu");
                break;
            case"APRIL":
            case"MARCH":
                System.out.println("Spring Season(Vasant Ritu)");
                break;
            case "MAY":
            case"JUNE":
                System.out.println("Summer(Grishma Ritu)");
                break;
            default:
                System.out.println("it is wrong name ");
        }
    }
}
