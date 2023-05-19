package ch16.exer.generic_methods;

import ch16.exer.generic.*;

public class CompareTest {
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
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
	}

}
