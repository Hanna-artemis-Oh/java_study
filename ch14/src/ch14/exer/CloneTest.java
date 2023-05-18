package ch14.exer;

class Car {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	Car copy() throws CloneNotSupportedException {
		return (Car)clone();
	}
	
}

public class CloneTest {

	public static void main(String[] args) {
		Car nexo = new Car();
		try {
			Car porche1 = (Car)nexo.clone();
			Car porche2 = nexo.copy();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
