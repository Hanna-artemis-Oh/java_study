package ch10.unit;

public class Marine extends Unit {
	
	static int atk;
	static int def;
	static String weapon;
	static String type;
	
	static {
		atk = 6;
		def = 0;
		weapon = "가우스 소총";
		type = "마린";
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
		String report = type + "#" + num + ":\n";
		report += String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s]\n", 
				this.hp, atk, def, weapon);
		return report;
	}
	
	int calcDamage(int atkDamage) {
		return atkDamage - def;	
	}
	
	public void attack(Marine z, int count) {
		z.getAttacked(atk, count);	
	}
	
	public void attack(Zergling z, int count) {
		z.getAttacked(atk, count);	
	}
	
	public void attack(Zealot z, int count) {
		z.getAttacked(atk, count);	
	}

}
