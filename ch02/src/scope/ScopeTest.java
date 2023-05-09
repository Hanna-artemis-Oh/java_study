package scope;

public class ScopeTest {

	public static void main(String[] args) {
		int data = 10;

		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));

		System.out.println(Integer.parseInt("1010", 2));
		System.out.println(Integer.parseInt("12", 8));
		System.out.println(Integer.parseInt("a", 16));

	}

}
