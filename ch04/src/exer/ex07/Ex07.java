package exer.ex07;

public class Ex07 {

	public static void main(String[] args) {
		
		out: for (int i=0; i<10; i++) {
			for (int j=0; j<5; j++) {
				System.out.println(i + ", " + j);
				if (i==3 && j==2) {
					break out;
				}
			}
		}
		
	}

}
