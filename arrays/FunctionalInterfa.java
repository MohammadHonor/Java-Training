/**
 * InnerFunctionalInterfa
 */
@FunctionalInterface
 interface Interf {

    public void display();
}
public class FunctionalInterfa {

    public static void main(String[] args) {
        Interf i =()->System.out.println("hellow.........");
        i.display();
        i.display();
        i.display();
        i.display();
    }
    
}
