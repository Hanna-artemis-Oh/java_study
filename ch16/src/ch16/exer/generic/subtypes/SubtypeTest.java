package ch16.exer.generic.subtypes;

import ch16.exer.generic.*;

public class SubtypeTest {

	public static void main(String[] args) {
		Box<Fruit> box = new Box<Fruit>();
	
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Grape());
//		box.add(new Object()); //에러 Object는 Fruit의 상위클래스

	}

}
