package kk_repo.designpattern.overriding;

public class Child1 extends Parent1 {
		public int test1() throws NullPointerException {
				int[] i = null;
				System.out.println(i.length);
				return i.length;
		}
}
