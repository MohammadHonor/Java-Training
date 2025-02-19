import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Developer {
    private String developerName ;
    private int developerId ;
    private int developerSallary;
    public Developer(String developerName, int developerId, int developerSallary) {
        this.developerName = developerName;
        this.developerId = developerId;
        this.developerSallary = developerSallary;
    }
    @Override
    public String toString() {
        return "Developer [developerName=" + developerName + ", developerId=" + developerId + ", developerSallary="
                + developerSallary + "]";
    }

    public static void main(String[] args) {
       ArrayList<Developer > d = new ArrayList<>();
       
       d.add(new Developer("john", 19, 20000));
       d.add(new Developer("week", 34, 20000));
       d.add(new Developer("horn", 1989, 20000));
       d.add(new Developer("jack", 90, 20000));
       d.add(new Developer("tom", 20, 20000));
       Collections.sort(d , (d1,d2)->d1.developerId < d2.developerId ? -1 : d1.developerId> d2.developerId? 1 : 0 );
     d.stream().filter((id)-> id.developerId<34).collect(Collectors.toList());
    }
}
