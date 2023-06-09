package ch10.unit;

public class Marine extends Unit {
	
	static int atk;
	static int def;
	static final String WEAPON;
	static final String TYPE;
	
	static {
		atk = 6;
		def = 0;
		WEAPON = "가우스 소총";
		TYPE = "마린";
	}
	
	Marine() {
		this(1);
	}
	
	public Marine(int num) {
		this(num, 40);
	}
	
	Marine(int num, int hp) {
		super(num, hp);
	}
	
	@Override
	public String toString() {
		String report = TYPE + "#" + num + ":\n";
		report += String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s]\n", 
				this.hp, atk, def, WEAPON);
		return report;
	}
	
	int calcDamage(int atkDamage) {
		return atkDamage - def;	
	}

	public void attack(Unit u, int count) {
		u.getAttacked(atk, count);	
	}
	
}
