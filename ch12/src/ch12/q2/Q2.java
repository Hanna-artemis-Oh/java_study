package ch12.q2;

public class Q2 {

	public static void main(String[] args) {
		A a = new B();
		a.abc();
	}

}

abstract class A {
	abstract void abc();
}

class B extends A {

	@Override
	void abc() {
		System.out.println("안녕하세요.");
	}
	
}
