package ch07.starcraft.unit;

public class Zergling {
	
	int num;
	int hp;
	int atk;
	int def;
	String weapon;
	
	Zergling() {
		this(1);
	}

	public Zergling(int num) {
		this(num, 35, 5, 0, "발톱");
	}
	
	Zergling(int num, int hp, int atk, int def, String weapon) {
		this.num = num;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.weapon = weapon;
	}
	
	public void reportStatus() {
		System.out.println("저글링#" + num + ":");
		System.out.println(String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s]\n", 
				this.hp, this.atk, this.def, this.weapon));
	}
	
	private int calcDamage(int atkDamage) {
		return this.def - atkDamage;
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
		return atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
}
