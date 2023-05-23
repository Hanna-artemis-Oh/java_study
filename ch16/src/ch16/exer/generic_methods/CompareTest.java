package ch16.exer.generic_methods;

import java.util.List;
import java.util.ArrayList;
import ch16.exer.generic.*;

public class CompareTest {
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}
	
	public static void process(List<? extends Fruit> list) {
		for (Fruit f : list) {
			System.out.println(f.getVariety());
		}
	}

	public static void printList(List<?> list) {
		for (Object elem : list) {
			System.out.print(elem + ", ");
		}
		System.out.println();
	}
	
	public static void sizeList(List<?> list) {
		System.out.println(list.size());
	}
	
	public static void addNumbers(List<? super Integer> list) {
		for (int i=0; i<=0; i++) {
			list.add(Integer.valueOf(i));
		}
	}
	
	public static void addFruits(List<? super Fruit> list) {
		list.add(new Fruit());
		list.add(new Apple());
		list.add(new GreenApple());
		list.add(new Grape());
	}

	public static void main(String[] args) {
		
		int result;
		result = countGreaterThan(new Integer[]{3,2,1,7,9,8,6}, Integer.valueOf(5));
		System.out.println(result);
		
		Apple[] apples = {new Apple(), new Apple("홍옥", 100), new Apple("홍옥", 105)};
		Apple a1 = new Apple("아오리", 103);
		result = countGreaterThan(apples, a1);
		System.out.println(result);
		
		Grape[] grapes = {new Grape(), new Grape("캠벨", 200), new Grape("거봉", 250), new Grape("청포도", 180) };
		Grape g1 = new Grape("블랙사파이어", 220);
		result = countGreaterThan(grapes, g1);
		System.out.println(result);
		
		List<Fruit> fruitList = new ArrayList<>();
		fruitList.add(new Fruit());
		fruitList.add(a1);
		fruitList.add(g1);
		process(fruitList);
		
		
		List<Apple> appleList = new ArrayList<>();
		appleList.add(a1);
		appleList.add(new Apple("부사", 220));
		process(appleList);
		
		System.out.println("================================");
		List<Object> objList = new ArrayList<>();
		objList.add(new Fruit());
		objList.add(a1);
		objList.add(g1);
		printList(objList);
		printList(appleList);
		
		System.out.println("================================");
		addNumbers(new ArrayList<Integer>());
	}

}
