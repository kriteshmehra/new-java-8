package kk_repo.designpattern.programs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor and getters/setters

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

class CustomizedSortingExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"a",12);
        Employee emp2 = new Employee(1,"a",12);
        if (emp1.equals(emp2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
/*        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000));
        employees.add(new Employee(2, "Jane", 60000));
        employees.add(new Employee(3, "Doe", 45000));

        System.out.println("Before sorting:");
        printEmployees(employees);

        // Customized sorting based on salary
        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("\nAfter sorting based on salary:");
        printEmployees(employees);*/

        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee(1, "John", 50000), "employee1");
        map.put(new Employee(1, "John", 50000), "employee1");
        System.out.println(map);

    }

    private static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
