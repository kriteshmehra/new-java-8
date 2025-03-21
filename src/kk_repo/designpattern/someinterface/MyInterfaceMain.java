package kk_repo.designpattern.someinterface;

public class MyInterfaceMain implements MyInterface{
    public void defaultMethod() {
        System.out.println("overridden defaultMethod in class");
    }

    static void staticMethod() {
        System.out.println("Static method in class");
    }

    public static void main(String[] args) {
        MyInterface.staticMethod();
        MyInterfaceMain.staticMethod();
        MyInterfaceMain obj = new MyInterfaceMain();
        obj.defaultMethod();
    }
}
