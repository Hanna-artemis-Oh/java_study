package ch07.starcraft;

class Zergling {
	
	int num;
	int hp;
	int atk;
	int def;
	String weapon;
	
	Zergling() {
		this(1);
	}
	
	Zergling(int num) {
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

}
