package ch07.starcraft;

class Marine {
	
	int num;
	int hp;
	int atk;
	int def;
	String weapon;
	
	Marine() {
		this(1);
	}
	
	Marine(int num) {
		this(num, 40, 6, 0, "가우스 소총");
	}
	
	Marine(int num, int hp, int atk, int def, String weapon) {
		this.num = num;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.weapon = weapon;
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

	public void reportStatus() {
		System.out.println("마린#" + num + ":");
		System.out.println(String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기이름: %s]\n", 
				this.hp, this.atk, this.def, this.weapon));
	}
	
	public void attack(Zergling z, int count) {
		z.getAttacked(this.atk, count);	
	}

}
