
public class MyRunnable {

    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i =0; i<5 ;i++){
                System.out.println("Child thread");
            }
        };

        Thread t = new Thread(r);

        t.start();

        for(int i =0; i< 4 ;i++){
            System.out.println("main thread");
        }
    }
    
}
