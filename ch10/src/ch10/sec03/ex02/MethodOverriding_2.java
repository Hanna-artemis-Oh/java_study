package ch10.sec03.ex02;

class Animal {
	
	String name;
	
	void setName(String name) {
		this.name = name;
	}

	void cry() {
		System.out.println(name + " 울다");
	}

}

class Bird extends Animal {

	void cry() {
		System.out.println(name + " 구구");
	}
	
	void cry(int n) {
		System.out.println(name + "이(가) 구구하고 " + n + "번 울었다...");
	}

}

class Cat extends Animal {

	@Override
	void cry() {
		System.out.println(name + " 야옹");
	}

}

class Dog extends Animal {

	@Override
	void cry() {
		System.out.println(name + " 멍멍");
	}

}

public class MethodOverriding_2 {
	public static void main(String[] args) {
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		aa.cry();
		bb.setName("비둘기");
		bb.cry();
		bb.cry(3);
		cc.cry();
		dd.cry();
		
		System.out.println();

		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.setName("멧비둘기");
		
		ab.cry();
//		ab.cry(3); //불가
		ac.cry();
		ad.cry();
		System.out.println();
		
		
		System.out.println("=====구분선=====");
		ab = bb;
		bb.cry();
		ab.cry();
		bb.cry(3);
//		ab.cry(3); //불가
		System.out.println();
		
		
		Animal[] animals = new Animal[] {new Bird(), new Cat(), new Dog()};
		for (Animal animal : animals) {
		    animal.cry();
		}
		
	}
}
