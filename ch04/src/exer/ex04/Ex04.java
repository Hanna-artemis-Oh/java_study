package exer.ex04;

public class Ex04 {

	public static void main(String[] args) {
		for (int i=10; i>0; i-=2) {
			System.out.println(i);
		}
		System.out.println();
		
		int i=10;
		while (i > 0) {
			System.out.println(i);
			i -= 2;
		}
		
		
		for (int k=0; k<5; k++) {
			for (int j=0; j<3; j++) {
				if(k ==2) continue;
				
				if (j==1) break;
				System.out.print("A");
			}
		}
	}

}
