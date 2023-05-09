package ch05.sec01.ex10;

import java.util.Arrays;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		System.out.println();
		
		
		System.out.println(Arrays.toString(args));
		System.out.println();

		for (int i=0; i<args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
		
		for (String arg : args) {
			System.out.print(arg + ", ");
		}
	}

}
