package kk_repo.designpattern.someinterface;

interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}
