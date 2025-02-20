package PayrollSystemPackage;
import java.util.ArrayList;
public class PayrollSystem {
  private ArrayList<Employee> EmployeesList;

  public PayrollSystem() {
    EmployeesList = new ArrayList<>();
  }

  public void addEmployees(Employee employee) {
    EmployeesList.add(employee);
  }

  public void removeEmployee(int id) {
    for (Employee e : EmployeesList) {
      if (e.getId() == id) {
        EmployeesList.remove(e);
        break;
      }
    }
  }

  public void displayEmployee() {
    for (Employee e : EmployeesList) {
      System.out.println(e);;
    }
  }
}
