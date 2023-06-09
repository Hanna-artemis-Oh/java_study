package ch12.unit;

public class Medic extends Unit implements Flyable {
	

	static int def;
	static final String TYPE;
	
	static {
		def = 1;
		TYPE = "메딕";
	}
	
	public Medic() {
		this(1);
	}
	
	public Medic(int num) {
		this(num, 60);
	}
	
	Medic(int num, int hp) {
		super(num, hp);
	}
	
	@Override
	public String toString() {
		String report = TYPE + "#" + num + ":\n";
		report += String.format("  [생명력: %d, 방어력: %d]\n", 
				this.hp, def);
		return report;
	}
	
	@Override
	int calcDamage(int atkDamage) {
		return atkDamage - def;	
	}
	
	@Override
	public void fly() {
		System.out.println("메딕은 날 수 있습니다.");
	}
	
}
