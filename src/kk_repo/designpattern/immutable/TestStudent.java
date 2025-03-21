package kk_repo.designpattern.immutable;

public class TestStudent {
    public static void main(String[] args) {
        StudentImmutable stud1 = new StudentImmutable(new FullName("abc", "xyz"));
        System.out.println(stud1.getFullName().getFirstName());
        stud1.getFullName().setFirstName("yyyy");
        System.out.println(stud1.getFullName().getFirstName());
    }
}
