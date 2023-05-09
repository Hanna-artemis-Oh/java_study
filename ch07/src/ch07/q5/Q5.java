package ch07.q5;

public class Q5 {

	public static void main(String[] args) {
		A a = new A();
		
		a.averageScore(1);
		a.averageScore(1, 2);
		a.averageScore(1, 2, 3);
		a.averageScore(1, 2, 3, 4);
		
	}

}

class A {
	
	public void averageScore(int... n) {
		double sum = 0.0;
		int l = n.length;
		for (int i=0; i<l; i++) {
			sum += n[i];
		}
		System.out.println(sum / l);
	}
}
