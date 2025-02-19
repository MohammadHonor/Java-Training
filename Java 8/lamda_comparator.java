import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lamda_comparator {
    public static void main(String[] args) {
        
        List<Integer> ls = new ArrayList<>();

        ls.add(20);
        ls.add(9);
        ls.add(92);
        ls.add(5);
        ls.add(59);
        Comparator<Integer> c = (I1,I2)->(I1 < I2) ? -1 : (I1 > I2) ? +1 :0 ;
        Collections.sort(ls,c);

        ls.stream().forEach((v)->System.out.println(v));
        List<Integer> ls2 = ls.stream().filter((i)->i % 2 == 0).collect(Collectors.toList());
        System.out.println(ls2);
        System.out.println(ls);
    }
}
