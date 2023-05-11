package ch10.unit;

public class Unit {
	
	int num;
	int hp;	
	
	Unit(int num, int hp) {
		this.num = num;
		this.hp = hp;
	}
	
	public void reportStatus() {
		
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}

}
