package kk_repo.designpattern.interview.cdkglobal;

import java.util.*;
import java.util.stream.Collectors;

public class TestMainCdk {
		public static void main(String[] args) {
				EmployeeCdk emp1 = new EmployeeCdk("1",4000.0);
				EmployeeCdk emp2 = new EmployeeCdk("2",9000.0);
				EmployeeCdk emp3 = new EmployeeCdk("3",7000.0);
				EmployeeCdk emp4 = new EmployeeCdk("4",1000.0);
				Map<String, EmployeeCdk> map = new HashMap<>();
				map.put("1",emp1);
				map.put("2",emp2);
				map.put("3",emp3);
				map.put("4",emp4);

				//Find the details of 3rd highest salary
				Optional<EmployeeCdk> collect = map.values().stream()
						.sorted(Comparator.comparingDouble(EmployeeCdk::getSalary).reversed())
						//.map(it -> it.getValue())
						.skip(2).findFirst();
				System.out.println(collect.get()); // EmployeeCdk{id='1', salary=4000.0}
		}
}
