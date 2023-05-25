package ch18.exer.gfg;

import java.util.function.Function;

public class GFGEx03 {

	public static void main(String args[]) {
		// Function which takes in a number and
		// returns half of it
		Function<Integer, Double> half = a -> a / 2.0;

		// Now treble the output of half function
		Function<Double, Double> minus = a -> a - 3;
		
		Function<Integer, Integer> minus2 = a -> a - 3;

		// Applying the function to get the result
		// and printing on console
		System.out.println(half.andThen(minus).apply(10));
		System.out.println(half.compose(minus2).apply(10));

	}
}
