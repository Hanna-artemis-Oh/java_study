package ch05.q5;

public class Q5 {

	public static void main(String[] args) {

		int[][] a = new int[2][];
		a = new int[][] {
			{1, 3, 5},
			{7, 9}
		};
		
		for (int[] b : a) {
			for (int c : b) {
				System.out.println(c);
			}
		}
 	}

}
