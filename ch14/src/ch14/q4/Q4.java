package ch14.q4;

public class Q4 {

	public static void main(String[] args) {
		try {
			int[] array = new int[] {1,2,3};
			System.out.println(array[3]);
		} catch (Exception e) {
			System.out.println("다른 예외가 발생했습니다.");
//		} catch (ArrayIndexOutOfBoundsException e) { //위에서 잡아서 쓸 일이 없어
//			System.out.println("배열 인덱스의 사용 범위를 벗어났습니다.");
		}
	}

}
