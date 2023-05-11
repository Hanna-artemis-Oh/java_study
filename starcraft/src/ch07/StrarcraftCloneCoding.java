package ch07;

import ch07.unit.Marine;
import ch07.unit.Zergling;

public class StrarcraftCloneCoding {

	public static void main(String[] args) {
//		int numOfMarines = 5;
//		Marine[] marines = new Marine[numOfMarines];
//		
//		for (int i=0; i<numOfMarines; i++) {
//			marines[i] = new Marine(i+1);
//			marines[i].reportStatus();
//		}
		
		Marine[] marines = new Marine[] {
			new Marine(1), new Marine(2), new Marine(3), new Marine(4), new Marine(5)	
		};

		for (Marine m : marines) {
			m.reportStatus();
		}
		
		Zergling[] zerglings = new Zergling[] {
			new Zergling(1)	
		};
		
		for (Zergling z : zerglings) {
			z.reportStatus();
		}
		
		marines[0].attack(zerglings[0], 1);
		
		System.out.println("마린이 저글링을 1회 공격\n");
		zerglings[0].reportStatus();

	}

}
