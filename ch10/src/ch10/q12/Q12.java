package ch10.q12;

public class Q12 {

	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));
	}

}

class A {
	int data;
	
	A(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof A) {
			return this.data == ((A)o).data;
		}
		return false;
	}
	
}
