package ch15.q5;

class MyData {
	int data;
	
	synchronized void modifyData() {
		for (int i=0; i<10000; i++) {
			data++;
		}
		System.out.println(data);
	}
}

class MyThread extends Thread {
	MyData myData;
	
	public MyThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		myData.modifyData();
	}
}

public class Q5 {

	public static void main(String[] args) {
		MyData md = new MyData();
		
		MyThread mt1 = new MyThread(md);
		mt1.setName("첫번째");

		MyThread mt2 = new MyThread(md);
		mt2.setName("두번째");

		mt1.start();
		mt2.start();

	}

}
