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
	int calcDamage(int atkDamage) {
		int result = 0;
		this.shield -= atkDamage;
		
		if (this.shield < 0) {
			result = this.shield + def;
			this.shield = 0;
		}
		return -result;
	}
	
	@Override
	public void getAttacked(int atkDamage, int count) {
		if (count > 0) {
			this.hp -= calcDamage(atkDamage);
			getAttacked(atkDamage, count - 1);
		}
	}

	
	
	@Override
	public String toString() {
		String report = type + "#" + num + ":\n";
		report += String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s, 보호막: %s]\n", 
				this.hp, atk, def, weapon, this.shield);
		return report;
	}
	
	public void attack(Zergling z, int count) {
		z.getAttacked(atk, count);	
	}

}
