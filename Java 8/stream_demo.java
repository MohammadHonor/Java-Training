import java.util.ArrayList;
import java.util.Collections;
public class stream_demo {

    public static void main(String[] args) {
       
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0 ;i<3 ;i++){
            list.add(new ArrayList<>());
        }
      
        list.get(0).add(4);
        list.get(0).add(3);
        list.get(1).add(1);
        list.get(1).add(9);
        list.get(1).add(3);
        list.get(1).add(0);

        list.get(2).add(1);
        list.get(2).add(9);
        list.get(2).add(3);

        System.out.println(list);

        list.stream().forEach((ArrayList<Integer> ls)->{
            System.out.println(ls.size());
        });

        Collections.sort(list,(a,b)->{
           int n = Math.min(a.size(),b.size());
            for( int i = 0 ;i<n ; i++ ){
                return Integer.compare(a.get(i),b.get(i));
            }
            return Integer.compare(a.size(), b.size());

        });

        System.out.println(list);


        
    }
    
}
