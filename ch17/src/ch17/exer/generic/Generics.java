package ch17.exer.generic;

class Box<T> {
    // T stands for "Type"
    private T t;
    
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}


public class Generics {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(10);
		intBox.set(Integer.valueOf(15));
		System.out.println(intBox.get() + 10); 	//타입 캐스팅 불필요
//		intBox.set("10"); 						//에러: 컴파일 시점에 강력한 타입 체킹
		
		Box<String> strBox = new Box<>();
		strBox.set("10");
		System.out.println(strBox.get() + 10);
		
		Box<Apple> appleBox = new Box<>();
		appleBox.set(new Apple());
		System.out.println(appleBox.get());
		appleBox.get().show();
		
		Box<Grape> grapeBox = new Box<>();
		grapeBox.set(new Grape());
		System.out.println(grapeBox.get());
		
		Box<Fruit> fruitBox = new Box<Fruit>();
//		Box<Fruit> fruitBox2 = new Box<Apple>();	//에러: 
		
		
		
		@SuppressWarnings("rawtypes")
		Box rawBox = new Box();
		Box rawBox2 = appleBox;
		
		Box<Apple> aBox = rawBox; //Unchecked conversion
		
		Box rawBox3 = new Box<Apple>();
		Box<Apple> appleBox2 = new Box();
		
		Apple a = new Apple("홍옥", 130);
		rawBox.set(a);
//		a.rawBox.get();		//에러
	}
	
}

//class Kosa<T extends Fruit & AutoCloseable> {}
