package ch18.exer;

import java.util.NoSuchElementException;
import java.util.Optional;
import ch18.exer.generic.Apple;

public class OptionalTest {
	
	public static void main(String[] args) {
		Optional<Apple> emptyApple = Optional.empty();
//		Optional<Apple> redApple = Optional.of(null); // 컴파일 에러
		Optional<Apple> redApple = Optional.of(new Apple());
		Optional<Apple> blueApple = Optional.ofNullable(new Apple("파랑", 200));
		Optional<Apple> greenApple = Optional.ofNullable(null);
		
//		Apple apple = greenApple.get(); // 런타임 에러
//		Apple apple = optApple.get(); // 런타임 에러
		Apple apple = redApple.get();
		try {
			apple.show();
			redApple.get().show();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		System.out.println(blueApple.get());
		
		emptyApple.orElse(new Apple()).show();
		greenApple.orElse(getApple()).show();
		redApple.orElse(new Apple()).show();
		System.out.println(blueApple.orElse(new Apple()));
		System.out.println();
		
		emptyApple.orElseGet(() -> new Apple()).show();
		greenApple.orElseGet(() -> getApple()).show();
		System.out.println();
		
		
		if (emptyApple.isPresent()) {
			emptyApple.get().show();
		} else {
			System.err.println("사과 없음");
		}
		
		
	}
	
	private static Apple getApple() {
		String time = "오전";
		
		if (time == "오전") {
			return new Apple("오전", 200);
		} else {
			return new Apple("오후", 300);
		}
	}

}
