import java.io.Serializable;

public class Employee implements Serializable{

     String name ;
     int id ;
     int salary ;
    Employee(String n,int id,int s){
        this.name=n;
        this.id=id;
        this.salary=s;
    }
    public static void main(String[] args) {
       Employee e1 = new Employee("jack",32,5000);

       Employee e2 = new Employee("jack",32,5000);

       Employee e3 = new Employee("jack",32,5000);

       
    }

}