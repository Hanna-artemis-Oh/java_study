package ch18.exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

interface MyFunction {
	  
    // Method inside the interface
    int func(int n);
}

public class FunctionalInterfaceCollectionEx {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(205);
		al.add(102);
		al.add(98);
		al.add(275);
		al.add(203);
		System.out.println("Elements of the ArrayList " + "before sorting : " + al);

		Collections.sort(al);
		System.out.println(al);

		Collections.sort(al, (o1, o2) -> o1 > o2 ? -1 : o1 < o2 ? 1 : 0);
		System.out.println(al);

		
		System.out.println("==================================");
		TreeMap<Integer, String> m = new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		m.put(1, "Apple");
		m.put(4, "Mango");
		m.put(5, "Orange");
		m.put(2, "Banana");
		m.put(3, "Grapes");
		System.out.println("Elements of the TreeMap " + "after sorting are : " + m);
		
		TreeMap<String, Integer> m2 = new TreeMap<String, Integer>((o1, o2) -> (o1.compareTo(o2) > 0) ? -1 : (o1.compareTo(o2) < 0) ? 1 : 0);
		m2.put("Apple", 1);
		m2.put("Mango", 2);
		m2.put("Orange", 3);
		m2.put("Banana", 4);
		m2.put("Grapes", 5);
		System.out.println("Elements of the TreeMap " + "after sorting are : " + m2);
		
		int number = 10;
		
//		al = new ArrayList<>();
        MyFunction myLambda = (n) ->
        {
  
            // This use of number is OK It does not modify
            // num
            int value = number + n;
  

            al.add(511);
            System.out.println(al);
            
            return value;
        };
        
        myLambda.func(5);

	}

}
