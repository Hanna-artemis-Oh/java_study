// 외부 클래스가 구현한 인터페이스의 디폴트 메서드와
// 인터페이스의 디폴트 메서드를 오버라이드한 상위 클래스의 메서드와
// 인터페이스의 디폴트 메서드와 이름이 같은 내부 클래스에 접근하는 예
package ch12.exer;

interface Interface {
	void interfaceMethod();
	
	default void interfaceDefaultMethod() {
		System.out.println("Interface - Default Method!");
	}
}

class Outer implements Interface {
	
	@Override
	public void interfaceMethod() {
		System.out.println("외부 클래스 - 인터페이스 메서드 호출");
		Interface.super.interfaceDefaultMethod();
	}
	
	@Override
	public void interfaceDefaultMethod() {
		System.out.println("외부 클래스 - 인터페이스 디폴트 메서드 호출");
	}
	
//	Inner2 inner2;
//	
//	void setInner2(Inner2 inner) {
//		this.inner2 = inner;
//	}

	
	class Inner { 
		
		public void interfaceDefaultMethod() {
			System.out.println("내부 클래스 - 인터페이스 디폴트 메서드 호출");
		}
		
		public void start() {
			interfaceDefaultMethod();
			this.interfaceDefaultMethod();
			
			Outer.this.interfaceDefaultMethod();	
		
		}
			
	}
}

//class Inner2 {
//	
//}
//
//class Inner3 extends Inner2 {
//	
//}

public class InterfaceDefaultMethodTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		inner.start();
	}

}
