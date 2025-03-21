package kk_repo.designpattern.multithreading;

public class DEAThread extends Thread {
    public DEAThread(String name) {
        super(name);
    }
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(Thread.currentThread().getName() + " is DEAThread thread");
        } else {
            System.out.println(Thread.currentThread().getName() + " is User thread");
        }
    }
    public static void main(String[] args) {
        DEAThread t1 = new DEAThread("first-1");
        DEAThread t2 = new DEAThread("second-2");
        DEAThread t3 = new DEAThread("third-3");
        t1.start();
        t1.start();
        t1.start();
    }
}
