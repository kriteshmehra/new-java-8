package kk_repo.designpattern.functioalinterface;

public interface Test1 {
        void abc();
        default String test() {
                return "hi";
        }
        static String testStatic() {
                return "hi";
        }
}
