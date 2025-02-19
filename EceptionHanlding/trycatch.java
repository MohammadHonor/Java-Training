package EceptionHanlding;

public class trycatch {
   public static void main(String[] args) {
    try {
      throw new Exception("My name is khan");
    } catch (Throwable t) {
      // TODO: handle exception
      System.out.println("messaage " + t.getMessage());
      System.out.println("couse" + t.getCause());
      System.out.println("class" + t.getClass());
      System.out.println("local" + t.getLocalizedMessage());
      System.out.println("trace" + t.getStackTrace());
      // System.out.println(t.printStackTrace(t.getStackTrace()));
    }finally{
      System.out.println("I am mohammad");
    }
   }
}
