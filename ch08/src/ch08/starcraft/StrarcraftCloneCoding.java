package ch08.starcraft;

import ch08.starcraft.unit.Marine;
import ch08.starcraft.unit.Zergling;

public class StrarcraftCloneCoding {
	
	Marine[] marines;
	Zergling[] zerglings;

	public static void main(String[] args) {
		StrarcraftCloneCoding scc = new StrarcraftCloneCoding();
		
		scc.initUnits();
		scc.reportAllUnits();
		
		System.out.println("마린이 저글링을 1회 공격\n");
		scc.marines[0].attack(scc.zerglings[0], 1);		
		scc.zerglings[0].reportStatus();

	}
	
	void initUnits() {
		marines = new Marine[] {
			new Marine(1), new Marine(2), new Marine(3), new Marine(4), new Marine(5)	
		};
		zerglings = new Zergling[] {
			new Zergling(1)	
		};	
	}
	
	void reportAllUnits() {
		for (Marine m : marines) {
			m.reportStatus();
		}
		
		for (Zergling z : zerglings) {
			z.reportStatus();
		}
	}

}
