import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// class Mycomp implements Comparator<Integer>{
    
//     public int compare(Integer I1,Integer I2){

//         return I1>I2 ? +1:I1<I2?-1:0;
//         // if(I1>I2){
//         //     return +1;
//         // }
//         // else if(I1<I2){
//         //     return -1;
//         // }
//         // else{
//         //     return 0;
//         // }
//     }
    
// }
public class com{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Comparator<Integer> c = (I1,I2)-> I1>I2 ? +1:I1<I2?-1:0;
        list.add(12);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(22);
        list.add(0);
System.out.println(list);

Collections.sort(list,c);

System.out.println(list);
        
    }
}
