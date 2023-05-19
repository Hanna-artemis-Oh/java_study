package ch16.exer.generic;

public class Grape extends Fruit {
	
	public Grape() {
		this("샤인머스켓", 200);
	}
	
	public Grape(String variety, int weight) {
		super(variety, weight);
		this.name = "포도";
	}

}
