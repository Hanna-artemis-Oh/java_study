package ch08.initblock;

public class Person {
	
	int age;
	static String type = "처음타입";
	
	static {
//		System.out.println("나이" + this.age);
		System.out.println("정적 초기화 블록");
		System.out.println("타입: " + Person.type + "\n");
		Person.type = "Hmmm..";
	}
	
	{
		System.out.println("초기화 블록");
		System.out.println("나이: " + age);
		System.out.println("타입: " + Person.type + "\n");
		this.age = 99;
		Person.type = "Wow...";
	}
	
	Person(int age, String type) {
		this.age = age;
		Person.type = type;
		System.out.println("Person 생성자");
		System.out.println("나이: " + this.age);
		System.out.println("타입: " + Person.type);
	}
}
