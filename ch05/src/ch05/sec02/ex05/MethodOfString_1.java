package ch05.sec02.ex05;

import java.util.Arrays;

public class MethodOfString_1 {

	public static void main(String[] args) {
		String[] str1 = {"Hello Java!"};
		String str2 = "안녕하세요! 반갑습니다!";
		System.out.println(str1.length);
		System.out.println(str1[0].length());
		System.out.println(str2.length()); //method
		System.out.println();
		
		System.out.println(str1[0].charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();
		
		System.out.println(str1[0].indexOf('a')); //7
		System.out.println(str1[0].lastIndexOf('a')); //9
		System.out.println(str1[0].indexOf('a', 8)); //9
		System.out.println(str1[0].lastIndexOf('a', 8)); //7
		System.out.println(str1[0].indexOf("Java")); //6
		System.out.println(str1[0].lastIndexOf("Java")); //6
		System.out.println(str2.indexOf("하세요")); //2
		System.out.println(str2.lastIndexOf("하세요")); //2
		System.out.println(str1[0].indexOf("Bye")); //-1
		System.out.println(str2.lastIndexOf("고맙습니다.")); //-1
		System.out.println();
		
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3); //2.3
		System.out.println(str4); //false
		System.out.println();
		
		String str5 = str3.concat(str4);
		System.out.println(str5); //2.3false
		System.out.println();
		
		String str6 = "안녕" + 3;
		String str7 = "안녕".concat(String.valueOf(3));
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println();
		
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		System.out.println((char)(array4[0] + 1));
	}

}
