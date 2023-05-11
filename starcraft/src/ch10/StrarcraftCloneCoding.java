package ch10;

import ch10.unit.Marine;
import ch10.unit.Zergling;
import ch10.unit.Unit;
import ch10.unit.Zealot;

public class StrarcraftCloneCoding {
	
	static Marine[] marines;
	static Zergling[] zerglings;
	static Zealot[] zealots;

	public static void main(String[] args) {
		StrarcraftCloneCoding scc = new StrarcraftCloneCoding();
		
		scc.initUnits();
		reportAllUnits();
		
		System.out.println("마린이 저글링을 2회 공격\n");
		marines[0].attack(zerglings[0], 2);		
		zerglings[0].reportStatus();

	}
	
	void initUnits() {
		marines = new Marine[] {
			new Marine(1), new Marine(2), new Marine(3), new Marine(4), new Marine(5)	
		};
		zerglings = new Zergling[] {
			new Zergling(1)	
		};	
		zealots = new Zealot[] {
			new Zealot(1), new Zealot(2)
		};
	}
	
	static void reportAllUnits() {
//		reportUnits(marines);
//		reportUnits(zerglings);
		System.out.println(zerglings[0]);
	}
	
	static void reportUnits(Unit[] units) {
		for (Unit unit : units) {
			unit.reportStatus();
		}
	}

}
