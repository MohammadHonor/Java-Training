public class SecondRohmbus {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=4;j>+i+1;j--){
                System.out.print(" ");
            }
            for (int stare=0;stare<4;stare++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
