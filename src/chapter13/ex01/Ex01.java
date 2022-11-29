package chapter13.ex01;

class C {
	int a = 5;
	int b = 4;
	
	int add (int a, int b) {
		return a + b;
	}
	int diff (int a, int b) {
		return a - b;
	}
	int mul (int a, int b) {
		return a * b;
	}
	double div (int a, int b) {
		return (double)a / (double)b;
	}
	
	//이너 클래스 : Outer 클래스의 메소드를 활용해서 기능은 구현
	class D {
		void abc () {
			System.out.println("두 수의 합은 : " + add(a, b));
			System.out.println("두 수의 차는 : " + diff(a, b));
			System.out.println("두 수의 곱은 : " + mul(a, b));
			System.out.println("두 수의 몫은 : " + div(a, b));
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//1. 외부 객체 생성
		C c = new C();
		
		//2. 내부 객체 생성
		C.D d = c.new D();
		
		d.abc();
		
	}

}
