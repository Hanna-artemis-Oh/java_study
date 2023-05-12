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
		
		initUnits();
		reportAllUnits();
		
		System.out.println("마린#1이 저글링#1을 2회 공격\n");
		marines[0].attack(zerglings[0], 2);		
		zerglings[0].reportStatus();
		System.out.println();
		
		System.out.println("마린#2이 질럿#2을 5회 공격\n");
		marines[1].attack(zealots[1], 5);		
		zealots[1].reportStatus();
		System.out.println();
		
		System.out.println("저글링#1이 마린#3을 3회 공격\n");
		zerglings[0].attack(marines[2], 3);		
		marines[2].reportStatus();
		System.out.println();
		
		System.out.println("저글링#1이 질럿#2을 7회 공격\n");
		zerglings[0].attack(zealots[1], 7);		
		zealots[1].reportStatus();
		System.out.println();
		
		System.out.println("질럿#1이 마린#3을 3회 공격\n");
		zealots[0].attack(marines[2], 3);		
		marines[2].reportStatus();
		System.out.println();
		
		System.out.println("질럿#1이 질럿#2을 3회 공격\n");
		zealots[0].attack(zealots[1], 3);		
		zealots[1].reportStatus();
		System.out.println();

	}
	
	static void initUnits() {
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
		reportUnits(marines);
		reportUnits(zerglings);
		reportUnits(zealots);
	}
	
	static void reportUnits(Unit[] units) {
		for (Unit unit : units) {
			unit.reportStatus();
		}
	}

}
