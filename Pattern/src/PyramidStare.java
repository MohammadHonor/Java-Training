public class PyramidStare {
    public static void main(String[] args) {
        int n = 5;
        for (int line = 0; line < n; line++) {
            for (int space = n; space > line; space--) {
                System.out.print(" ");
            }
            for (int stare1 = 0; stare1 < line; stare1++) {
                System.out.print("*");
            }
           // for()

            System.out.println();
        }
    }
}
