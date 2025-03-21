package kk_repo.designpattern.questionsasked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ImmutableEmployee {
		private final String name;
		private final Map<String, String> address;
		private final List<String> abc;


		public ImmutableEmployee(String name, Map<String, String> address, List<String> abc) {
				this.name = name;
				Map<String, String> tempMap = new HashMap<>();
				for (Map.Entry<String, String> entry : address.entrySet()) {
						tempMap.put(entry.getKey(),entry.getValue());
				}
				this.address = tempMap;
				List<String> lsAbc = new ArrayList<>();
				lsAbc.addAll(abc);
				this.abc = lsAbc;
		}

		public String getName() {
				return name;
		}

		public Map<String, String> getAddress() {
				Map<String, String> tempMap = new HashMap<>();
				for (Map.Entry<String, String> entry : address.entrySet()) {
						tempMap.put(entry.getKey(),entry.getValue());
				}
				return tempMap;
		}

		public List<String> getAbc() {
				List<String> tmpAbc = new ArrayList<>();
				tmpAbc.addAll(abc);
				return tmpAbc;
		}
}
