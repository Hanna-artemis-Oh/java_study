package ch16.exer.generic.subtypes;

import ch16.exer.generic.*;

class Box<T> {
    private T t;
    
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
	public void add(T t) {
		
	}
}
