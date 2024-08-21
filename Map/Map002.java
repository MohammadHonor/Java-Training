import java.util.*;
public class Map002 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(0,"ali");
        map.put(1,"tom");
        map.put(2,"john");
        map.put(4,"anger");
       

        System.out.println("Map"+" "+map);
        System.out.println( map.entrySet() instanceof Set);


        //hashCode()

       System.out.println( map.hashCode());
        System.out.println(map);
        
        //putAll();

        Map<Integer, String> mp = new HashMap<>();
        mp.put(6,"salvie");

        map.putAll(mp);

        System.out.println(map);

        map.putAll(new HashMap<>());
        System.out.println(map.getClass());

        // value give collection of all 
        System.out.println(map.values() instanceof Collection);

        // getOrDefault value

        System.out.println(map.getOrDefault(7,"john"));

       // forEach()
        map.forEach((key,value)->{
            System.out.println(key*2);
            System.out.println(value+"hard");
        });

       
        }
}
