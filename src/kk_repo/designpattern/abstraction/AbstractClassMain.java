package kk_repo.designpattern.abstraction;

public class AbstractClassMain extends AbstractClass {
    public AbstractClassMain(int var1) {
        super(var1);
    }
    public static void abc() {
        System.out.println("abc");
    }
    public void method1() {
        System.out.println("var1 = "+ var1);
    }
    public static void main(String[] args) {
        AbstractClassMain abstractClassMain = new AbstractClassMain(20);
        abstractClassMain.method1();
        AbstractClass.abc();
    }

}
