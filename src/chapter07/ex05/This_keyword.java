package chapter07.ex05;

class A {
	// 필드	: Heap 영역에 저장
	int m;
	int n;
	
	//메소드 : 정수값 2개를 받음
	void init(int m, int b) { // 메소드 내의 : a,b,c <== 지역 변수 : stack 저장
		int c;
		c = 3;
		m = m;		//this.m	: 인풋 매개변수, 실행블락에 매개변수 받는변수, 필드의 변수
		n = b;		//this.n	
	}
	
	//메소드
	void work() {
		this.init (2,3);	//this : 자신의 객체의 필드나 메소드 호출.
		System.out.println(m + " " + n);
	}
	
	//this 키를 명시해야 하는 경우
	void init2 (int m, int n) {
		m=m;
		n=n;
	}
}



public class This_keyword {

	public static void main(String[] args) {
		// this : 자기자신 객체의 필드나 메소드, <= 필드, 메소드에 적용
		// this() : 자신객체의 다른 생성자 호출 시 사용
		// super : 상속에서 부모의 객체의 필드나, 메소드를 사용.	
		// super() : 부모클래스의 생성자 호출할 때 사용
		A a = new A ();
		a.work();
	}

}
