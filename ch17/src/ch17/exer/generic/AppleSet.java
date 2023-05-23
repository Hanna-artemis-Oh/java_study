package ch17.exer.generic;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppleSet {

	public static void main(String[] args) {
		Set<Apple> appleBox = new HashSet<>();
		appleBox.add(new Apple());
		appleBox.add(new Apple("홍옥", 120));
		appleBox.add(new Apple("홍옥", 200));
		appleBox.add(new Apple("부사", 300));
		System.out.println(appleBox);
		System.out.println("주머니 속 사과 품종은 총 " + appleBox.size() + "가지 입니다.");
		
		TreeSet<Apple> aSet = new TreeSet<>();
		aSet.add(new Apple());
		aSet.add(new Apple("홍옥", 120));
		aSet.add(new Apple("홍옥", 200));
		aSet.add(new Apple("부사", 300));
		System.out.println(aSet);
		System.out.println(aSet.descendingSet());
		
		Comparator<Apple> comp = new Comparator<>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getVariety().compareTo(o2.getVariety());
			}
		};
 		TreeSet<Apple> bSet = new TreeSet<>(comp);
 		bSet.addAll(aSet);
 		System.out.println(bSet);
 		
 		TreeSet<Apple> cSet = new TreeSet<>(new Comparator<>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return -o1.getVariety().compareTo(o2.getVariety());
			}
 		});
 		
 		TreeSet<Apple> dSet = new TreeSet<>(
 				(o1, o2) -> o1.getVariety().compareTo(o2.getVariety()));
 		dSet.addAll(aSet);
 		System.out.println(dSet);
 		
 		AppleComparator acomp = new AppleComparator();
	}

}


class AppleComparator implements Comparator<Apple> {
	@Override
	public int compare(Apple o1, Apple o2) {
		return o1.getVariety().compareTo(o2.getVariety());
	}
}
