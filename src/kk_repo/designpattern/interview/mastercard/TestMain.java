package kk_repo.designpattern.interview.mastercard;

import java.util.Arrays;
import java.util.List;

public class TestMain {
		public static void main(String[] args) {
				List<Order> orders = Arrays.asList(
						new Order(Arrays.asList(
								new Item("Apple", 50),
								new Item("Banana", 20)
						)),
						new Order(Arrays.asList(
								new Item("Avocado", 60),
								new Item("Orange", 30)
						)),
						new Order(Arrays.asList(
								new Item("Apricot", 50),
								new Item("Blueberry", 30)
						))
				);

				double a = orders.stream().flatMap(order -> order.getItems().stream()
						.filter(item -> item.getName().startsWith("A")))
						.mapToDouble(Item::getPrice)
						.sum();
				System.out.println(a);
		}
}
