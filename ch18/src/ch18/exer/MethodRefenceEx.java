package ch18.exer;

import ch18.exer.generic.*;

@FunctionalInterface
interface Hanna {
	void pineapple();
}

class Monitor {
	public void display(Hanna h) {
		h.pineapple();
	}
}

@FunctionalInterface
interface StaticMethodRef {
	int execute(String s);
}

@FunctionalInterface
interface InstanceMethodRef {
	boolean execute(String s1, String s2);
}

@FunctionalInterface
interface ObjectMethodRef {
	void execute(String s);
}

@FunctionalInterface
interface ObjectMethodRef2 {
	boolean execute(String s);
}

@FunctionalInterface
interface ConstructorRef {
	Apple generate();
}


public class MethodRefenceEx {

	public static void main(String[] args) {
		Hanna h = () -> System.out.println("반장님은 파인애플이 싫다고 하셨지");
		h.pineapple();

		Hanna h2 = new Hanna() {
			public void pineapple() {
				System.out.println("반장님은 파인애플이 싫다고 하셨지");
			}
		};
		
		
		// 1. 정적 메서드의 메서드 참조
		StaticMethodRef smr = s -> Integer.parseInt(s);
		System.out.println(smr.execute("110") + 10);
		
		StaticMethodRef smr2 = Integer::parseInt;
		System.out.println(smr2.execute("210") + 10);
		
		
		// 2. 인스턴스 메서드의 메서드 참조
		//    첫번째 인자로 넘어오는 객체를 통해 인스턴스 메서드를 호출하는 경우
		InstanceMethodRef imr;
		imr = (s1, s2) -> s1.equals(s2);
		System.out.println(imr.execute("안녕", "hello"));
		
		imr = String::equals;
		System.out.println(imr.execute("안녕", "안녕"));
		
		
		// 3. 외부 객체의 메서드를 호출시 메서드 참조
		//    외부 객체 = 람다식의 매개변수로 넘겨받지 않은
		//                로컬 객체 또는 인스턴스 객체 또는 정적 객체
		ObjectMethodRef omr;
		omr = s -> System.out.println(s);
		omr.execute("안녕하시지요");
		
		omr = System.out::println;
		omr.execute("반갑습니다");
		
		ObjectMethodRef2 omr2;
		String name = new String("홍길동");
		omr2 = s -> name.equals(s);
		System.out.println(omr2.execute("홍길삼"));
		
		omr2 = name::equals;
		System.out.println(omr2.execute("홍길동"));
		
		
		// 4. 생성자 참조
		ConstructorRef cr = () -> new Apple();
		Apple a = cr.generate();
		a.show();
		
		cr = Apple::new;
		Apple b = cr.generate();
		b.show();
		
	
	}
}
