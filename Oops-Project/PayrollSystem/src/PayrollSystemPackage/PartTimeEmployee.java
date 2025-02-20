package PayrollSystemPackage;

import PayrollSystemPackage.Employee;

public class PartTimeEmployee extends Employee {
  
  private double workHour;
  private double perHourSalary;

  public PartTimeEmployee(String name, int id, double workHour, double perHourSalary) {
    super(name, id);
    this.perHourSalary = perHourSalary;
    this.workHour = workHour;
  }

  @Override
  public double calculateSalary(){
    return workHour*perHourSalary;
  }
  
}
