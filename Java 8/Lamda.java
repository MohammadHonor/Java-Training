@FunctionalInterface
interface Cal {
    int play(int a, int b);
}
public class Lamda {
  
    public static void main(String[] args) {
        Cal add =(a,b)->a+b;

        System.out.println(add.play(10, 20));
    }

    
}
