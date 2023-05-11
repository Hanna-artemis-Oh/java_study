package ch08.unit;

public class Zergling {
	
	int num;
	int hp;
	static int atk;
	static int def;
	static String weapon;
	
	static {
		atk = 5;
		def = 0;
		weapon = "발톱";
	}
	
	Zergling() {
		this(1);
	}

	public Zergling(int num) {
		this(num, 35);
	}
	
	Zergling(int num, int hp) {
		this.num = num;
		this.hp = hp;
	}
	
	public void reportStatus() {
		System.out.println("저글링#" + num + ":");
		System.out.println(String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s]\n", 
				this.hp, Zergling.atk, Zergling.def, Zergling.weapon));
	}
	
	private int calcDamage(int atkDamage) {
		return Zergling.def - atkDamage;
	}
	
	public void getAttacked(int atkDamage, int count) {
		this.hp += calcDamage(atkDamage) * count;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getAtk() {
		return Zergling.atk;
	}
	
	public void setAtk(int atk) {
		Zergling.atk = atk;
	}
	
	public int getDef() {
		return Zergling.def;
	}
	
	public void setDef(int def) {
		Zergling.def = def;
	}
	
	public String getWeapon() {
		return Zergling.weapon;
	}
	
	public void setWeapon(String weapon) {
		Zergling.weapon = weapon;
	}
	
}
