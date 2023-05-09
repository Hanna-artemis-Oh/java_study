package ch05.q4;

public class Q4 {

	public static void main(String[] args) {
		int[] values = new int [] {1, 2, 3, 4, 5};
		
		for (int value : values) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		for (int i=0; i<values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();

	}

}
