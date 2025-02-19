//import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * InnerTreeMapCustomizeSorting
 */
class Person  {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}

/**
 * InnerTreeMapCustomizeSorting
 */
 class SortByAge implements Comparator<Person> {

    public int compare(Person p1,Person p2){
        return p1.age-p2.age;
    }
    
}
public class TreeMapCustomizeSorting {

    public static void main(String[] args) {
        

        SortedMap<Person,String> map = new TreeMap<>(new SortByAge());

        map.put(new Person("Jack Sparow",40),"Pirates");
        map.put(new Person("Hillary Clinton",45),"President");
        map.put(new Person("Spider Man",18),"Actor");
        map.put(new Person("Sharukh khan",55),"India famous actor");

       for(Map.Entry<Person,String> entry : map.entrySet()){
        System.out.println(entry);
       }
        
    }
}
