package ch16.exer.nonGeneric;

import ch16.exer.generic.Apple;

class Box {
	private Object obj;
	
	public Object get() {
		return this.obj;
	}
	
	public void set(Object obj) {
		this.obj = obj;
	}
}

public class NonGenerics {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Box intBox = new Box();
		intBox.set(10);
		intBox.set(new Integer(10));
		
		Box appleBox = new Box();
		appleBox.set(new Apple());
		System.out.println(appleBox.get());
		
		((Apple)appleBox.get()).show();
		
		Integer value = (Integer)intBox.get();
		System.out.println(value + 10);
		
		intBox.set("Hello");
		value = (Integer)intBox.get();
		System.out.println(value + 10);
	}

}
