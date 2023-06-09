package ch13.sec05.ex02;

/*일반적인 UI API의 구조 예시 (버튼)*/

class Button {
	OnClickListener ocl;	
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}	
	interface OnClickListener {
		public abstract void onClick();
	}
	void onClick () {
		ocl.onClick();
	}
}

class PlayMusic implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("개발자1 : 베토벤 음악재생");	
	}
}

public class ButtonAPIExample {
	public static void main(String[] args) {		
		//#1. 개발자 1. 클릭했을때 음악재생
		Button btn1 = new Button();
		PlayMusic event = new PlayMusic();
		
		btn1.setOnClickListener(event);
		btn1.onClick(); //개발자1 : 음악재생
			
		
		Button.OnClickListener e = new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자1 : 바흐 음악재생");
			}
		};
		e.onClick();
		
		
		//#2. 개발자 2. 클릭했을때 네이버 접속
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {			
			@Override
			public void onClick() {
				System.out.println("개발자2 : 네이버 접속");				
			}
		});
		btn2.onClick(); //개발자2 : 네이버접속		
		
		
		btn2.setOnClickListener(new Button.OnClickListener() {		
			@Override
			public void onClick() {
				System.out.println("개발자2 : 다음 접속");
			}
		});
		btn2.onClick();
	}
}





























