package kk_repo.designpattern.singleton;

public class Singleton {

    // Static variable reference of single_instance of type Singleton
    private static Singleton singleton_instance = null;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    public Singleton() {
    }

    // Static method
    // Static method to create instance of Singleton class
    public static synchronized Singleton getInstance() {
        if (singleton_instance == null)
            singleton_instance = new Singleton();

        return singleton_instance;
    }

}
