package kk_repo.designpattern.interview.mastercard;

import java.util.List;

class Order {
		private List<Item> items;
		public Order(List<Item> items) {
				this.items = items;
		}
		public List<Item> getItems() {
				return items;
		}
}
