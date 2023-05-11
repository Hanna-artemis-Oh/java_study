package ch10.unit;

public class Zealot extends Unit {
	
	static int atk;
	static int def;
	static String weapon;
	static String type;
	
	int shield;
	
	static {
		atk = 8 * 2;
		def = 1;
		weapon = "사이오닉 검";
		type = "질럿";
	}
	
	Zealot() {
		this(1);
	}
	
	public Zealot(int num) {
		this(num, 100);
	}
	
	Zealot(int num, int hp) {
		super(num, hp);
		this.shield = 60;
	}
	
	@Override
	public void reportStatus() {
		System.out.println(type + "#" + num + ":");
		System.out.println(String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s, 보호막: %s]\n", 
				this.hp, atk, def, weapon, this.shield));
	}
	
	public void attack(Zergling z, int count) {
		z.getAttacked(atk, count);	
	}

}
