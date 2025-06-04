package kk_repo.designpattern.java8stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(4,"Alice",15,"female","ECE",2010,5000),
                new Employee(2,"Bob",25,"male","CEC",2010,5000),
                new Employee(1,"Tom",15,"male","ECE",2010,5000),
                new Employee(3,"Charlie",35,"nale","ECE",2010,5000)
        );

        Predicate<Employee> isOlderThan30 = emp -> emp.age > 20;
        employees.stream().filter(isOlderThan30).forEach(System.out::println);

    }
}
