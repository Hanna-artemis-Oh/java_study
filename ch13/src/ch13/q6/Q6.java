package ch13.q6;

class A {
	int m = 3;
	int n = 5;
	
	void abc() {
		int n = 5;
		
		class B {
			void bcd() {
				m = m + 1;
				System.out.println(m);
//				n = n + 1; //오류: 지역변수 n은 final과 같은 효과(변경 불가)
				System.out.println(n);
			}
		}
	}
}

public class Q6 {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}

}
