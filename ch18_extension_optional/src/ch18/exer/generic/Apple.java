package ch18.exer.generic;

public class Apple extends Fruit{
	
	public Apple() {
		this("기본사과", 150);
	}
	
	public Apple(String variety, int weight) {
		super(variety, weight);
		this.name = "사과";
	}
	
	public void show() {
		System.out.println(this);
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
