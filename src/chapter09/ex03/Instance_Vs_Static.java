package chapter09.ex03;

class A {
	int a = 1;	//인스턴스 필드 : 객체를 생성 후 사용가능
	int b = 2;
	
	void print () {		// 인스턴스 메소드 : 객체를 생성 해야지만 사용가능.
		System.out.println(a + " " + b);
	
	}
}


class B {
	static int a = 3;	//static(정적) 필드 : 객체 생성없이 클래스 이름으로 호출 가능, 객체 생성 후 사용가능. 
	static int b = 4;	//클래스 변수다.
	
	static void print() {	//static(정적) 메소드 : 
		System.out.println(a + " " + b);
	}
}

public class Instance_Vs_Static {

	public static void main(String[] args) {
		//
		// A class는 인스턴스 필드, 인스턴스 메소드 	<== 객체화 해서 사용가능
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.print();
		
		//B class는 static (정적) 필드, 정적 메소드 <== 클래스 이름으로 사용가능, 객체 생성 후 사용됨.
		System.out.println(B.a);	
		System.out.println(B.b);
		
		//객체 생성 후 필드와 메소드 호출
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
	
	}

}
