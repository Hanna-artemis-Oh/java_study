package ch17.exer.generic;

public class Fruit implements Comparable<Fruit> {
	
	String name;
	String variety;
	int weight;
	
	public Fruit() {
		this("과일", 100);
	}
	
	public Fruit(String variety, int weight) {
		this.variety = variety;
		this.weight = weight;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return this.name + "(" + this.variety + ", " + this.weight + "g)";
	}	

	@Override
	public int compareTo(Fruit fruit) {
		return this.weight - fruit.getWeight();
	}
	
}
