import java.util.ArrayList;
import java.util.Scanner;

public class hello {
    //string substing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
       String s=sc.next();
        ArrayList<String> l=new ArrayList<>();
        for(int i=0; i<s.length();i++){
            char first=s.charAt(i);
            if(l.size()==0){
                l.add("");
                l.add(""+first);
                continue;
            }
            int listSize=l.size();
            for(int j=0;j<listSize;j++){
                String temp=l.get(j)+first;
                if(!l.contains(temp)){
                    l.add(temp);
                }
            }
        }
        System.out.println(l);
            
        
        
        sc.close();
        
    }
    
}
