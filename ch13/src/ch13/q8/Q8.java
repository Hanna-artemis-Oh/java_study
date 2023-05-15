package ch13.q8;

class A {
	interface B {
		static void bcd() {
			System.out.println("이너 인터클래스 내 static 메서드");
		}
	}
}

public class Q8 {

	public static void main(String[] args) {
		A.B.bcd();
	}

}
