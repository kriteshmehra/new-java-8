package kk_repo.designpattern.interview.cdkglobal;

public class EmployeeCdk {
		private String id;
		private Double salary;

		public String getId() {
				return id;
		}

		public Double getSalary() {
				return salary;
		}

		public EmployeeCdk(String id, Double salary) {
				this.id = id;
				this.salary = salary;
		}

		@Override
		public String toString() {
				return "EmployeeCdk{" +
						"id='" + id + '\'' +
						", salary=" + salary +
						'}';
		}
}
