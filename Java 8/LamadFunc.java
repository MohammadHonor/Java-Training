
@FunctionalInterface
interface Calculator {
    
    int calculate(int a, int b);
    
}

public class LamadFunc{

    // static int squareIt(int a){
    //     return a*a;
    // }
    public static void main(String[] args) {
        // Function<Integer,Integer> f = i->i*i;
        // Function<Integer,String> even = (v)->{
        //     if(v%2 == 0){
        //         return "even";
        //     }
        //     else{
        //         return "odd";
        //     }
        // };
        // System.out.println(even.apply(20));
        // System.out.println(f.apply(10));
        // Predicate<Integer> p = i->i%2==0;
        // System.out.println(p.test(3));
        Calculator addition =(a,b)->a+b;
        System.out.println(addition.calculate(19, 20));
        
    }
    
}


// @FunctionalInterface
// interface Calculator {
//     int calculate(int a, int b);
// }

// public class Main {
//     public static void main(String[] args) {
//         // Lambda expression implementing custom functional interface
//         Calculator addition = (a, b) -> a + b;
//         System.out.println(addition.calculate(5, 3));  // Output: 8
//     }
// }
