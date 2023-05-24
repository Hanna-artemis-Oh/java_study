package ch18.exer;

public class OnlyHanguel {
	// Method 1
	// To check String for only Alphabets
	public static boolean isStringOnlyAlphabet(String str) {
//		boolean result = str.chars().allMatch(ch -> Character.isLetter(ch));
		return (
			(str != null) && (!str.equals(""))
			&& (str.chars().allMatch(Character::isLetter)));
		
	}
	
	public static boolean isStringOnlyHanguel(String str) {
		return (
			(str != null) && (!str.equals(""))
			&& (str.matches("^[가-힣]*$")));
	}

	// Method 2
	// Main driver method
	public static void main(String[] args) {

		// Calling method over different strings
		// justifying all use-cases possible

		// Display message
		System.out.println("Test Case 1:");

		String str1 = "GeeksforGeek家";
		System.out.println("Input: " + str1);

		// Calling over above string: GeeksforGeeks
		System.out.println("Output: "
						+ isStringOnlyAlphabet(str1));

		// Checking for String with numeric characters
		System.out.println("\nTest Case 2:");

		String str2 = "Geeks4Geeks";
		System.out.println("Input: " + str2);

		// Calling over above string: Geeks4Geeks
		System.out.println("Output: "
						+ isStringOnlyAlphabet(str2));

		// Checking for null String
		System.out.println("\nTest Case 3:");
		String str3 = null;
		System.out.println("Input: " + str3);

		// Calling over above string: null
		System.out.println("Output: "
						+ isStringOnlyAlphabet(str3));

		// Checking for empty String
		System.out.println("\nTest Case 4:");
		String str4 = "";
		System.out.println("Input: " + str4);

		// Calling over above string ""
		System.out.println("Output: "
						+ isStringOnlyAlphabet(str4));
		
		System.out.println("\nTest Case 5:");
		String str5 = "안녕";
		System.out.println("Input: " + str5);

		// Calling over above string ""
		System.out.println("Output: "
						+ isStringOnlyHanguel(str5));
		
		System.out.println("\nTest Case 6:");
		String str6 = "Hi";
		System.out.println("Input: " + str6);

		// Calling over above string ""
		System.out.println("Output: "
						+ isStringOnlyHanguel(str6));
		
		System.out.println("\nTest Case 7:");
		String str7 = "안녕6하이";
		System.out.println("Input: " + str7);

		// Calling over above string ""
		System.out.println("Output: "
						+ isStringOnlyHanguel(str7));
	}
}

