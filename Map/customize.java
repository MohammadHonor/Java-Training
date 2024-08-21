import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;
/**
 * InnerCustomizeComparator
 */
 class Person {
    String name;
    int age;
    String city;

    Person(String n,int age,String city){
        this.name=n;
        this.age=age;
        this.city=city;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name"+" "+this.name+" Age"+" "+this.age+" city"+" "+this.city;
       
    }

    
}

class SortByAge implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        // TODO Auto-generated method stub
        return o1.age-o2.age;
    }
    
}

/**
 * Innercustomize
 */
 class SortByName implements Comparator<Person> {

    @Override
    public int compare (Person p1,Person p2){
        return p1.name.compareTo(p2.name);
    }
    
}
public class customize {

    public static void main(String[] args) {
        ArrayList<Person>list = new ArrayList<>();
        list.add(new Person("jack", 20, "Ghaziabad"));
        list.add(new Person("Lucifer", 18, "up"));
        list.add(new Person("logan", 24, "Gujarat"));
        list.add(new Person("iron", 12, "Hydrabad"));

    
       // Collections.sort(list,new SortByAge());
        Collections.sort(list,new SortByName());

        for(Person p : list){
            System.out.println(p);
        }
    }

    
}


       

        
