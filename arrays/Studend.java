import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Studend {

    int id;
    int deu;
    String name;

    public Studend(int id, int deu, String name) {
        this.id = id;
        this.deu = deu;
        this.name = name;
    }

public static void main(String[] args) {

    List<Studend> list = new ArrayList<Studend>();

    list.add(new Studend(1, 2000, "john"));
    list.add(new Studend(2, 80000, "tom"));
    list.add(new Studend(3, 75000, "jacky"));
    list.add(new Studend(4, 45000, "wicky"));
    list.add(new Studend(5, 67000, "shame"));
    list.add(new Studend(6, 29000, "shree"));

    list.stream()
    .filter(lst->lst.deu>29000 && lst.deu<80000)
    .forEach(d->System.out.print(d.id+" "+d.deu+" "+d.name+"\n"));


    
}

    
    
}
