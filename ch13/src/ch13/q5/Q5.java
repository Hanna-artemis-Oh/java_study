package ch13.q5;

class A {
	int a = 3;
	static int b = 4;
	void method1() {
		
	}
	
	static void method2() {
		
	}
	
	static class B {
		void bcd() {
//			System.out.println(a); //오류
			System.out.println(b);
//			method1(); //오류
			method2();
		}
	}
}

public class Q5 {

	public static void main(String[] args) {
		//내부 static 클래스는 외부 클래스의 static 인스턴스나 메서드만 접근 가능
	}

}
