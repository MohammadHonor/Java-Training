import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;
public class ArraysClass {

    public static void main(String[] args) {
        int arr[] = {
                1, 3, 4, 6, 7, 2
        };
        int arr1[] = {
                2, 3, 4, 6, 7, 2
        };

        // Arrays.sort(arr);
        // int a=Arrays.binarySearch(arr, 0);
        // Arrays.sort(arr,2,5);
        // Arrays.fill(arr,0,4,5);
        // System.out.println(a);
        // int a = Arrays.compare(arr, arr1);
        // System.out.println(a);
        // for (int value : arr) {
        //     System.out.println(value);
        // }

       System.out.println( Arrays.equals(arr, arr1));
      IntStream a=Arrays.stream(arr);
    //   System.out.println(a);
    //   for (int value : arr) {
    //         System.out.println(value);
    //     }

    // List<Integer> number = Arrays.asList(2,3,4,5,6,8);

    // System.out.println( number.stream().filter(n->n%2==0).collect(Collectors.toList()));
    // number.stream().filter(n->n%2==0).forEach(System.out::println);
    // System.out.println();


     List<String> name = Arrays.asList("ali","mohammad","john","sjifijaj");

     List<String>filter_name= new ArrayList<String>();

    filter_name=name.stream().filter(str->str.length()>3 && str.length()<5).collect(Collectors.toList());

     System.out.println(filter_name);
    }

}
