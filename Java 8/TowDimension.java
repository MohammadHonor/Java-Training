import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class TowDimension {

        public static void main(String[] args) {
                
                List<List<List<Integer>>> arr =  new ArrayList<>(
                        Arrays.asList(
                            new ArrayList<>(Arrays.asList(
                                new ArrayList<>(Arrays.asList(1, 2, 3)),
                                new ArrayList<>(Arrays.asList(4, 5, 6)),
                                new ArrayList<>(Arrays.asList(7, 8, 9))
                            )),
                            new ArrayList<>(Arrays.asList(
                                new ArrayList<>(Arrays.asList(10, 11, 12)),
                                new ArrayList<>(Arrays.asList(13, 14, 15)),
                                new ArrayList<>(Arrays.asList(16, 17, 18))
                            ))
                        )
                    );
                

                System.out.println(arr);

                List<List<Integer>> ls = arr.stream().flatMap(List::stream).collect(Collectors.toList());
                List<Integer> lsit = arr.stream().flatMap(List::stream).flatMap(List::stream).collect(Collectors.toList());
                //  arr.stream().flatMap(List::stream).flatMap((t)->{
                //    t
                //  }).forEach((v)->{
                //         System.out.println(v);
                // });

                // System.out.println(ls);
                // System.out.println(lsit);
        //         for( int i = 0;i<3 ;i++){
        //                arr.add(new ArrayList<>());
        //         }
        //         arr.get(0).add(1);
        //         arr.get(0).add(2);
        //         arr.get(0).add(3);
        //         arr.get(1).add(8);
        //         arr.get(1).add(7);
        //         arr.get(1).add(9);
        //         arr.get(2).add(9);
        //         arr.get(2).add(3);
        //         arr.get(2).add(7);
                
        //         System.out.println(arr);

        //  List<Integer> flattenedList = arr.stream()
        //        .flatMap()
        //        .collect(Collectors.toList());
        // System.out.println(flattenedList);
        }
        
        
}
