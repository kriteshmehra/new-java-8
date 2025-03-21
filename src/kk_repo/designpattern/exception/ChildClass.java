package kk_repo.designpattern.exception;

import java.io.FileNotFoundException;

public class ChildClass implements ParentClass {
    @Override
    public String test() throws RuntimeException {
        return "abc";
    }

    @Override
    public String test1() throws NullPointerException {
        return "test1";
    }

    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        ParentClass p = new ChildClass();
        System.out.println(c.test1());
        //System.out.println(p.test1());
    }
}
