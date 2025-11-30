package util;

public class Loader implements Runnable {
    @Override
    public void run() {
        try {
            System.out.print("Loading");
            
            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                Thread.sleep(150); // 150ms delay per dot
            }
            System.out.println(); 
        } catch (InterruptedException e) {
            System.out.println("\nLoading interrupted.");
        }
    }
}