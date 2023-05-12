package ch12.unit;

public class Zealot extends Unit implements Attackable {
	
	static int atk;
	static int def;
	static String WEAPON;
	static String TYPE;
	
	int shield;
	
	static {
		atk = 8 * 2;
		def = 1;
		WEAPON = "사이오닉 검";
		TYPE = "질럿";
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
		String report = TYPE + "#" + num + ":\n";
		report += String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s, 보호막: %s]\n", 
				this.hp, atk, def, WEAPON, this.shield);
		return report;
	}
	
	@Override
	public void attack(Unit u, int count) {
		u.getAttacked(atk, count);	
	}

}
