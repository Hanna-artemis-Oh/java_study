package ch17.exer.generic;

import java.util.HashSet;
import java.util.Set;

public class AppleSet {

	public static void main(String[] args) {
		Set<Apple> appleBox = new HashSet<>();
		appleBox.add(new Apple());
		appleBox.add(new Apple("홍옥", 120));
		appleBox.add(new Apple("홍옥", 200));
		appleBox.add(new Apple("부사", 300));
		System.out.println(appleBox);
		System.out.println("주머니 속 사과 품종은 총 " + appleBox.size() + "가지 입니다.");
	}

}
