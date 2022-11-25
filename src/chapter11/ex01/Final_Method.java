package chapter11.ex01;

class Aa {
	void print() {
		System.out.println("Aa 클래스의 print() 메소드 입니다.");
	}
	
	//자식 클래스에서 재정의를 할 수 없도록 설정한 메소드 : 아주 중요한 메소드
	final void run () {
		System.out.println("Aa 클래스의 run() 메소드 입니다.");
	}
}

class Bb extends Aa {
	
	@Override
	void print() {
		System.out.println("Bb 클래스에서 오버라이딩 됨");
	}
	
	//생략된 생성자 출력
	Bb () {
		super();
	}
	
//	@Override
//	final void run () {}
}

public class Final_Method {

	public static void main(String[] args) {
		
		Aa a1 = new Bb();
		a1.print();
	}

}
