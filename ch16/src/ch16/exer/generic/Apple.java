package ch16.exer.generic;

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

}
