package exer.ex03;

public class Ex03 {

	public static void main(String[] args) {
		
		for (int i=0; ; i++) {
			if (i > 10) {
				break;
			}
			
			if (i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
