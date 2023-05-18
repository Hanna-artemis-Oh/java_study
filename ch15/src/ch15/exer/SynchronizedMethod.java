package ch15.exer;


class MyData {
	int data = 3;
	
	public synchronized void plusData() {
		int data = this.data; //데이터를 가져오기
//		try { Thread.sleep(2000);} catch (InterruptedException e) {}		
		this.data = data + 1;
	}
	
	int getData() {
		return this.data;
	}
}

//#공유객체를 사용하는 쓰레드 
class PlusThread implements Runnable {
	MyData myData;
	
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(Thread.currentThread().getName() + " 실행결과 : " + myData.getData());
	}
}

public class SynchronizedMethod {
	public static void main(String[] args) {
		//#공유객체 생성
		
		MyData myData = new MyData();
		Runnable r = new PlusThread(myData);
				
		//#1.  plusThread 1
		Thread plusThread1 = new Thread(r);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
//		try { Thread.sleep(100);} catch (InterruptedException e) {}
		
		//#2.  plusThread 2

		Runnable r2 = new PlusThread(myData);
		Thread plusThread2 = new Thread(r2);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
//		try { Thread.sleep(3000);} catch (InterruptedException e) {}
//		System.out.println(myData.getData());
	}
}
