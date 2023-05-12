package ch12.q8;

public class Q8 {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	@Override
	public void abc() {
		A.super.abc();
		System.out.println("B 클래스의 abc()");
	}
}


