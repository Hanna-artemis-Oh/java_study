package ch13.q7;

import ch13.q7.A.B;

class A {
	interface B {
		void abc();
	}
}

public class Q7 {

	public static void main(String[] args) {
		B ab = new A.B() {		
			@Override
			public void abc() {
				
			}
		};
		ab.abc();
	}

}
