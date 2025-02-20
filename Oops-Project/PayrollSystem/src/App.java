
import PayrollSystemPackage.PayrollSystem;
import PayrollSystemPackage.FullTimeEmployee;
import PayrollSystemPackage.PartTimeEmployee;


public class App {
    public static void main(String[] args) throws Exception {
      PayrollSystem payrollSystem = new PayrollSystem();
      FullTimeEmployee e1 = new FullTimeEmployee("Jack", 1, 20000.0);
      PartTimeEmployee e2 = new PartTimeEmployee("Tome", 2, 4, 5000);

      payrollSystem.addEmployees(e1);
      payrollSystem.addEmployees(e2);
      payrollSystem.displayEmployee();
      payrollSystem.removeEmployee(1);
      payrollSystem.displayEmployee();    

    }
}
