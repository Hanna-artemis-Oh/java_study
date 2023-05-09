package exer.ex08;

public class Ex08 {

	public static void main(String[] args) {
		int a = 3;
		a <<= 1;
		System.out.println(a);
		a &= 5;
		System.out.println(a); //4
		a -= 1; //3
		System.out.println(a *= 2); //6
	}

}
