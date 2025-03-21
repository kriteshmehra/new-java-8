package kk_repo.designpattern.someinterface;


interface MyFirstInterface {

    int abc = 10;
    void first();
    default void second(){
        System.out.println("second in interface");
    }

    static void third(){
        System.out.println("third in interface");
    }
}
public class FunctionalInterfaceExample implements MyFirstInterface {
    @Override
    public void first() {
        System.out.println("First in class");
    }

    @Override
    public void second() {
        System.out.println("abc = "+abc);
        System.out.println("inside second");
        MyFirstInterface.super.second();
        System.out.println("done second");
    }


    public static void main(String[] args) {
        FunctionalInterfaceExample f = new FunctionalInterfaceExample();
        f.first();
        f.second();
        MyFirstInterface.third();
    }
}
