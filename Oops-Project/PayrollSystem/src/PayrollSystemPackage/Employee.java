package PayrollSystemPackage;


abstract class Employee {

  private String name;
  
  @Override
  public String toString() {
    return "Employee [name=" + name + ", id=" + id + "]";
  }

  private int id;
  
  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  abstract double calculateSalary();

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }
  
}
