package ch18.exer.gfg;

import java.util.ArrayList;
import java.util.List;

public class GFGEx06 {

	public static void main(String[] args) {
		List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);
		List<Integer> even = arr.stream().reduce(new ArrayList<Integer>(), (a, x) -> {
			if (x % 2 == 0)
				a.add(x); //x는 Integer
			return a;
		}, (a, b) -> { //a, b는 ArrayList<Integer>
			a.addAll(b);
			return b;
		});
		System.out.println(even);
	}
}
