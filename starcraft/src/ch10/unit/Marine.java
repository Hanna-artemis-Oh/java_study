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
	public void reportStatus() {
		System.out.println(type + "#" + num + ":");
		System.out.println(String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s]\n", 
				this.hp, atk, def, weapon));
	}
	
	public void attack(Zergling z, int count) {
		z.getAttacked(atk, count);	
	}

}
