import java.util.HashMap;

public class Map001 {
    
    // putIfAbsent() implimentation

    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();

        mp.put("roll no ",10);
        mp.put("marks",99);
        mp.put("father name ", 20202);
        System.out.println("old map"+mp);
        mp.putIfAbsent("roll no", 30);
        System.out.println("new map with rool no 30"+mp);
        mp.putIfAbsent("sec", 3);
        System.out.println("new map with section 3"+mp);

        Integer value1 = mp.putIfAbsent("marks",100);
        System.out.println("value "+value1);
       
        Integer value2 = mp.putIfAbsent("e",null);
        System.out.println("value2 "+value2);

        Integer value_3 = mp.putIfAbsent("e", 77);
        System.out.println(value_3);
    }
}
