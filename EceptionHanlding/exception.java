package EceptionHanlding;

public class exception {

  public static void main(String[] args) {
    int ans;
    try {
      ans = 10;
      int devide = ans / 0;
    } catch (ArithmeticException e) {
      // TODO: handle exception
      System.out.println(e);

    }

    // System.out.print(ans / 0);
  }
  
}
