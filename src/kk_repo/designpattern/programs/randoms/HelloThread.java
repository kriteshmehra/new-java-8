package kk_repo.designpattern.programs.randoms;

public class HelloThread {
    public static void main(String[] args) {
        // Print "Hello World" from the main thread
        System.out.println("Hello from main");

        // Create a separate thread and start it
        Thread t = new Thread(() -> {
            // Print "Hello World" from the separate thread
            System.out.println("Hello from thread");
        });
        t.start();
        try {
            // Wait for the separate thread to finish before exiting the main thread
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
