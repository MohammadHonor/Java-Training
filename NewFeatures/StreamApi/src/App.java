import stream.methods.demo.Calculation;

public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("Hello, World!");
      Calculation cl = new Calculation();

      cl.addProducts("laptop", "electronic", 2000);
      cl.addProducts("laptop", "electronic", 2000);
      cl.addProducts("laptop", "electronic", 2000);
      cl.addProducts("laptop", "electronic", 2000);
      cl.addProducts("laptop", "electronic", 2000);

      cl.display();

      cl.increasePrice(300.0);

      cl.display();

      cl.modifiedList("artificial").stream().forEach((p)->System.out.println(p));
    }
}
