package ch14.q2;

public class Q2 {

	public static void main(String[] args) {
		try {
			int a = 3;
			System.out.println(5 / a);
			
		} catch (ArithmeticException e) {
			System.out.println("예외 발생");
			
		} finally {
			System.out.println("출력 내용 1");
			System.out.println("출력 내용 2");
			System.out.println("출력 내용 3");
		}
	}

}
