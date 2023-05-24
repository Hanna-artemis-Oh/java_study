package ch18.exer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		c1.accept("안녕하세요");
		
		ArrayList<String> greetings = new ArrayList<>();
		greetings.add("안녕");
		greetings.add("Hello");
		greetings.add("반가워");
		greetings.add("어서오세요");
		greetings.add("알로");
		greetings.add("올라");
		greetings.add("챠오");
		
		System.out.println("===================Normal For Loop====================");
		for (int i=0; i<greetings.size(); i++) {
			String msg = greetings.get(i);
			System.out.println(msg + " => " + msg.length());
		}
		
		System.out.println("====================Enhanced For Loop===================");
		for (String greeting : greetings) {
			System.out.println(greeting + " => " + greeting.length());
		}
		
		System.out.println("===================Iterator====================");
		Iterator<String> iter = greetings.iterator();
		while (iter.hasNext()) {
			String msg = iter.next();
			System.out.println(msg + " => " + msg.length());
		}
		
		System.out.println("===================ForEach====================");
		Consumer<String> c2 = greeting -> System.out.println(greeting + " => " + greeting.length());
		greetings.forEach(c2);
		
		System.out.println("===================another ForEach====================");
		greetings.forEach(greeting -> System.out.println(greeting + " => " + greeting.length()));
		
		System.out.println("===================another ForEach Even length====================");
		greetings.forEach(greeting -> {
			if (greeting.length() % 2 == 0) System.out.println(greeting + " => " + greeting.length());
		});
		
		System.out.println("===================Predicate====================");
		Predicate<String> p1;
		p1 = s -> s.length() > 1 ? true : false;
		System.out.println(p1.test(""));
		System.out.println(p1.test("자바"));
		
		System.out.println("===================BiPredicate====================");
		BiPredicate<String, String> p2 = (s1, s2) -> s1.equals(s2);
		System.out.println(p2.test("홍길동", "홍길똥"));
		
		System.out.println("===================another BiPredicate====================");
		BiPredicate<String, String> p3 = String::equals;
		System.out.println(p3.test("홍길동", "홍길동"));
	}

}
