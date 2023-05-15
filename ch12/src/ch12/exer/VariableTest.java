package ch12.exer;

class A {
	int iv;      // 인스턴스 변수를 디폴트 값으로 자동 초기화
}

class B {
	int iv = 10; // 인스턴스 변수를 선언과 동시에 초기화
} 

class C {
	int iv = 10; // 선언과 동시에 초기화가 가장 먼저 수행
	static int sv = 100;
	
	{
		iv = 20;
		iv = sv + 200; // 초기화 블록에서 정적 변수 접근 가능
	}
}

class G {
	int iv = 10;
	
	{
		this.iv = 9;
	}
	
	G() {
		this.iv = 1; // 생성자가 초기화 루틴의 마지막 단계
	}
}

class D {
	static int sv; // 정적 변수를 초기화 하지 않은 경우
}

class E {
	static int sv = 12; // 정적 변수를 선언과 동시에 초기화
}

class F {
	static int sv = 12; // 정적 변수를 선언과 동시에 초기화가 먼저 수행
	int iv = 20;
	
	static {
		sv = 40;      // 정적 초기화 블록에서 정적 변수 초기화
//		sv = iv + 10; // 정적 초기화 블록에서는 인스턴스 변수/메서드 접근 불가
	}
}

class H {
	static int sv = 11;
	
	static {
//		this.sv = 22; // 정적 변수를 로컬 변수(메서드 정의 내에서)를 통해 접근 가능하지만
		              // 정적 초기화 블록에서는 객체가 아직 생성되지 않았으므로 this 사용 불가
		H.sv = 22;
		sv = 33;
	}
	
	{
		this.sv = 66; // 초기화 블록은 객체가 이미 생성된 후 실행되므로 this 사용 가능
		sv = 77;
		sv = 88;
	}
	
	H() {
		this.sv = 44; // 생성자에서는 객체가 이미 생성되었으므로 this 사용 가능
		sv = 55;
	}
}

class Af {
//	final int iv;  // 인스턴스 상수는 선언과 동시에 초기화 필요
}

class Bf {
	final int iv = 1000;  // 인스턴스 상수는 선언과 동시에 초기화 필요
}

class Cf {
	final int iv;
	
	{
		iv = 2000;   // 선언만 먼저 하고 초기화 블록에서 초기화 가능
	}
}

class Df {
	final int iv;
	
	Df() {
		iv = 2000;   // 선언만 먼저 하고 초기화 블록에서 초기화 가능
	}
}

class Ef {
//	static final int fsv; // 정적 상수도 초기화 하지 않으면 에러
	static final int fsv = -10;
}

class Ff {
	static final int fsv;
	
	static {
		fsv = -20;
	}
}

class Gf {
//	static final int fsv;
	
	{
//		fsv = -30;   // 초기화 블록에서 정적 상수 초기화 불가
	}
	
	Gf() {
//		fsv = -30;   // 생성자에서 정적 상수 초기화 불가
		             // 정적 상수가 디폴트 값으로 초기화 된다면 final 성질에 의해 다른 값으로 변경 불가
		             // 따라서 정적 상수는 디폴트 값으로 초기화 불가
	}
}

public class VariableTest {

	public static void main(String[] args) {
		A a = new A();
		System.out.print("1) 인스턴스 변수(int) 초기화하지 않은 경우: ");
		System.out.println(a.iv);
		
		B b = new B();
		System.out.print("2) 인스턴스 변수(int) 선언과 동시에 초기화: ");
		System.out.println(b.iv);
		
		C c = new C();
		System.out.print("3) 인스턴스 변수(int) 초기화 블록에서 초기화: ");
		System.out.println(c.iv);
		
		G g = new G();
		System.out.print("4) 인스턴스 변수(int) 생성자에서 초기화: ");
		System.out.println(g.iv);
		
		System.out.print("5) 정적 변수(int) 초기화하지 않고 클래스로 접근: ");
		System.out.println(D.sv); // 정적 변수는 객체 생성 없이 접근 가능
		D d = new D();
		System.out.print("6) 정적 변수(int) 초기화하지 않고 객체로 접근: ");
		System.out.println(d.sv); // 정적 변수는 객체 생성하고 접근도 가능

		System.out.print("7) 정적 변수(int) 선언과 동시에 초기화: ");
		System.out.println(E.sv); // 정적 변수는 객체 생성 없이 접근 가능

		System.out.print("8) 정적 변수(int) 정적 초기화 블럭에서 초기화: ");
		System.out.println(F.sv); 
		
		System.out.print("9) 정적 변수(int) 정적 초기화 블럭에서 초기화: ");
		System.out.println(H.sv); // 객체 생성 없이 클래스 이름으로 접근해서 정적 초기화 블록까지 실행
		                          // 초기화 블록과 생성자는 new 연산자를 사용할 때 실행
		H h = new H();
		System.out.print("10) 정적 변수(int)를 모든 초기화 단계에서 초기화, 객체를 통해 접근: ");
		System.out.println(h.sv);
		System.out.print("11) 정적 변수(int)를 모든 초기화 단계에서 초기화, 클래스를 통해 접근: ");
		System.out.println(H.sv);
		 
		Bf bf = new Bf();
		System.out.print("12) 인스턴스 상수는 선언과 동시에 초기화: ");
		System.out.println(bf.iv);

		Cf cf = new Cf();
		System.out.print("13) 인스턴스 상수는 별도 선언 후 초기화 블록에서 초기화: ");
		System.out.println(cf.iv);
		
		Df df = new Df();
		System.out.print("14) 인스턴스 상수는 별도 선언 후 생성자에서 초기화: ");
		System.out.println(df.iv);

		System.out.print("15) 정적 상수는 선언과 동시에 초기화: ");
		System.out.println(Ef.fsv);
//		Ef.fsv = 10; // 상수이므로 변경 불가
		Ef ef = new Ef();
		System.out.print("16) 정적 상수는 선언과 동시에 초기화, 객체를 통해 접근: ");
		System.out.println(ef.fsv);
//		ef.fsv = 10; // 상수이므로 변경 불가

		System.out.print("17) 정적 상수 선언 후 정적 초기화 블록에서 초기화, 클래스로 접근: ");
		System.out.println(Ff.fsv);
//		Ef.fsv = 10; // 상수이므로 변경 불가
		Ff ff = new Ff();
		System.out.print("18) 정적 상수 선언 후 정적 초기화 블록에서 초기화, 객체를 통해 접근: ");
		System.out.println(ff.fsv);
//		ef.fsv = 10; // 상수이므로 변경 불가
		
		
		
	}

}
