package ch05.q8;

public class Q8 {

	public static void main(String[] args) {
		String str = "내 이름은 [오한나]입니다. 나이는 [20]살 입니다.";
		String name;
		int age;
		
		name = str.substring(str.indexOf("[")+1, str.indexOf("]"));
		age = Integer.parseInt(str.substring(str.lastIndexOf("[")+1, str.lastIndexOf("]")));
		
		System.out.println(name);
		System.out.println(age);
	}

}
