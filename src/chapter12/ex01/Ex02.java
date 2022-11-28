package chapter12.ex01;

abstract class Calc2 {
	abstract void add (int a, int b);
	abstract void diff (int a, int b);
	abstract void mul (int a, int b);
	abstract void div (int a, int b);
}

class Calc_Impl2 extends Calc2 {
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	@Override
	void diff(int a, int b) {
		System.out.println(a-b);
	}
	
	@Override
	void mul(int a, int b) {
		System.out.println(a*b);
	}
	
	@Override
	void div(int a, int b) {
		System.out.println((double)a/(double)b);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		//void 구현 클래스
		System.out.println("======void를 이용한 구현 클래스로 메소드 출력=====");
		Calc2 cal = new Calc_Impl2();
		
		cal.add(a, b);
		cal.diff(a, b);
		cal.mul(a, b);
		cal.div(a, b);
		
		
		//void 익명 클래스
		System.out.println("=======void를 이용한 익명 클래스로 메소드 출력=======");
		Calc2 cal2 = new Calc2() {

			@Override
			void add(int a, int b) {
				System.out.println(a+b);
			}
			
			@Override
			void diff(int a, int b) {
				System.out.println(a-b);
			}
			
			@Override
			void mul(int a, int b) {
				System.out.println(a*b);
			}
			
			@Override
			void div(int a, int b) {
				System.out.println((double)a/(double)b);
			}
		};
		
		cal2.add(a, b);
		cal2.diff(a, b);
		cal2.mul(a, b);
		cal2.div(a, b);
		
	}

}
