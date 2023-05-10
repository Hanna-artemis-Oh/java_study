package ch08.starcraft.unit;

public class Marine {
	
	int num;
	int hp;
	static int atk;
	static int def;
	static String weapon;
	
	static {
		atk = 6;
		def = 0;
		weapon = "가우스 소총";
	}
	
	Marine() {
		this(1);
	}
	
	public Marine(int num) {
		this(num, 40);
	}
	
	Marine(int num, int hp) {
		this.num = num;
		this.hp = hp;
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
		return Marine.atk;
	}

	public void setAtk(int atk) {
		Marine.atk = atk;
	}

	public int getDef() {
		return Marine.def;
	}

	public void setDef(int def) {
		Marine.def = def;
	}

	public String getWeapon() {
		return Marine.weapon;
	}
	
	public void setWeapon(String weapon) {
		Marine.weapon = weapon;
	}

	public void reportStatus() {
		System.out.println("마린#" + num + ":");
		System.out.println(String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s]\n", 
				this.hp, Marine.atk, Marine.def, Marine.weapon));
	}
	
	public void attack(Zergling z, int count) {
		z.getAttacked(Marine.atk, count);	
	}

}
