package kk_repo.designpattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());


    }
}
