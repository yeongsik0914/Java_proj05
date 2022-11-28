package chapter12.ex01;

//추상 메소드를 구현하는 방법 두 가지
	//1. 자식 클래스에서 구현한 클래스를 생성하고 출력 : 매번 자주 사용해야 되는 경우
			//출력 : 코드가 간결하다. 구현한 클래스를 생성해야 한다.
	//2. 익명 클래스를 생성해서 출력 : 한 번 사용하고 버릴 경우, 안드로이드 폰 개발할 때, 이벤트 처리할 때 사용.
			//추상클래스의 구현한 자식 클래스 생성없이 바로 사용이 가능
			//여러번 사용할 때는 구현한 코드를 매번 생성해야 한다.
//1. 첫 번째 방법 : 추상클래스(A) <== 구현한 클래스(B)
abstract class A {		//추상 클래스
	abstract void cry();
}

//2. 두 번째 방법 : 추상 클래스를 구현한 클래스를 없이 바로 출력 : 익명 클래스를 사용해서 출력
abstract class C {
	abstract void run ();
}

// 구현 클래스를 생성 : <<

class B extends A {		//1. 자식 클래스에서 추상 클래스의 메소드를 구현한 클래스를 생성
	@Override
	void cry() {
		System.out.println("모든 동물은 웁니다. (자식 클래스에서 추상 메소드를 완성)");
	}
}

public class Abstract_Class02 {

	public static void main(String[] args) {
		//추상 클래스는 객체화 할 수 없다. 타입으로 지정은 가능하다.
		//A a = new A();	//추상 클래스 : 객체 생성 불가능
		
		// 첫 번째 방법 : A (추상 클래스) <-- B (구현한 클래스)
		A a1 = new B();
		a1.cry();
		
		A a2 = new B();
		a2.cry();
		
		//두 번째 방법 : 구현한 클래스 없이 바로 출력 (익명 클래스 사용), C는 추상 클래스 (객체화 불가능)
			//익명 클래스 : 
		C c1 = new C() {
			//C 추상클래스의 오버라이딩 해서 메소드를 구현
			@Override
			void run() {
				System.out.println("미완성 ==> 완성");
			}
		};
		
		c1.run();
		
		C c2 = new C() {
			@Override
			void run() {
				System.out.println("미완성2 ==> 완성2");
			}
		};
		
		c2.run();
	}

}
