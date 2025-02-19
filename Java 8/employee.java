import java.util.ArrayList;
import java.util.Collections;
public class employee {
     String name ;
     public employee(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    int rollNo ;
     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "[name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
    }
    int marks ;
     
     public static void main(String[] args) {
        ArrayList<employee> e = new ArrayList<>();
        
        e.add(new employee("a",45454545 , 75));
        e.add(new employee("john",73773773 , 55));
        e.add(new employee("tome",1282928 , 85));
        e.add(new employee("jack",4545429 , 25));
        e.add(new employee("rocky",4542992 , 15));
        // Collections.sort(e,(e1,e2)-> e1.marks < e2.marks ? -1 : e1.marks > e2.marks ? 1 : 0 );
        Collections.sort(e , (e1,e2)->e1.name.compareTo(e2.name));
        
        for( int i = 0; i< e.size() ; i++){

            System.out.println(e.get(i));
        }
     }
}