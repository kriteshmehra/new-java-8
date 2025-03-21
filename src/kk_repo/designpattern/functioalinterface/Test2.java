package kk_repo.designpattern.functioalinterface;

public interface Test2 {
        void abc2();
        default String test() {
                return "hi";
        }
        static String testStatic() {
                return "hi";
        }
}
