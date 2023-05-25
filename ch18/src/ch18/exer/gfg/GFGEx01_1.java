package ch18.exer.gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class GFGEx01_1 {

	public static void main(String args[]) {
		// Consumer to display a number
		Consumer<Integer> display = a -> System.out.println(a);

		// Implement display using accept()
		display.accept(10);

		AtomicInteger i = new AtomicInteger(0);
		Consumer<List<Integer>> modify = list -> list.stream().forEach(a -> list.set(i.getAndIncrement(), a*2));
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
		

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		// Implement modify using accept()
		modify.accept(list);

		// Implement dispList using accept()
		dispList.accept(list);
		
	}
}
