package ch10.unit;

public class Zergling extends Unit {
	
	static int atk;
	static int def;
	static String weapon;
	static String type;
	
	static {
		atk = 5;
		def = 0;
		weapon = "발톱";
		type = "저글링";
	}
	
	Zergling() {
		this(1);
	}

	public Zergling(int num) {
		this(num, 35);
	}
	
	Zergling(int num, int hp) {
		super(num, hp);
	}
	
	@Override
	public String toString() {
		String report = type + "#" + num + ":\n";
		report += String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s]\n", 
				this.hp, atk, def, weapon);
		return report;
	}
	
	@Override
	int calcDamage(int atkDamage) {
		return atkDamage - def;
	}
	
	public void attack(Unit u, int count) {
		u.getAttacked(atk, count);	
	}
		
}
