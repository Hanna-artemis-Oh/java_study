package ch18.exer;

@FunctionalInterface
interface MyLambda {
	public abstract int run(int a, int b);
}

public class LambdaEx {

	public static void main(String[] args) {
		
		MyLambda obj = new MyLambda() {
			public int run(int a, int b) {
				return a > b ? a: b;
			}
		};
		
		int result = obj.run(10, 20);
		System.out.println(result);

		MyLambda operator = (a, b) -> a > b ? a : b;
		System.out.println(operator.run(10,  20));
		
		calc(operator, 100, 120); 
		
		operator = (m, n) -> m > n ? n : m;
		calc(operator, 100, 120);
		
		operator = (x, y) -> x + y;
		calc(operator, 100, 120);
		
		calc((x, y) -> x - y, 100, 120);
		
		operator = pushButton("+");
		System.out.println(operator.run(300, 200));
		
		operator = pushButton("-");
		System.out.println(operator.run(300, 200));
		
	}
	
	static void calc(MyLambda op, int x, int y) {
		System.out.println(op.run(x, y));
	}
	
	static MyLambda pushButton(String button) {
		switch(button) {
		case "+":
			return (x, y) -> x + y;
		case "-":
			return (x, y) -> x - y;
		}
		return (x, y) -> x * y;
	}

}
