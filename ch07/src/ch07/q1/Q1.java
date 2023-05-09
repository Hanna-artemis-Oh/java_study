package ch07.q1;

public class Q1 {
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a); //false
		System.out.println(a.b); //0
		System.out.println(a.c); //0.0
		System.out.println(a.d); //null
		System.out.println();
		
		a.abc();
	}

}

class A {
	boolean a;
	int b;
	double c;
	String d;
	
	void abc() {
		System.out.println(b + c); //0.0
		System.out.println(c + d); //0.0null
		System.out.println(d + a); //nullfalse
	}
}
