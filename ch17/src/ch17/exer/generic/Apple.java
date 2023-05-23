package ch17.exer.generic;

public class Apple extends Fruit{
	
	public Apple() {
		this("부사", 150);
	}
	
	public Apple(String variety, int weight) {
		super(variety, weight);
		this.name = "사과";
	}
	
	public void show() {
		System.out.println("사과입니다.");
	}
	
	@Override
	public int hashCode() {
		return this.variety.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Apple) {
			return this.variety == ((Apple)obj).getVariety();
		}
		return false;
	}

}
