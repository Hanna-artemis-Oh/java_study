package ch12.q3;

public class Q3 {

	public static void main(String[] args) {
		A a = new A(){
			@Override
			void abc() {
				System.out.println("안녕하세요.");
			}
		};
		a.abc();
	}

}

abstract class A {
	abstract void abc();
}
