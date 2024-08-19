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

    }
    
}
