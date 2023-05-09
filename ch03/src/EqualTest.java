
public class EqualTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a == b); //true
		
		String str1 = "안녕";
		String str2 = "안녕";
		System.out.println(str1 == str2); //true
		
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); //true
		
		
		
	}

}
