package chapter12.ex01;

abstract class Calc { 	//사칙 연산을 계산하는 계산기 클래스
	abstract int add (int a, int b); 	// 더하기 연산
	abstract int diff (int a, int b);	// 빼기 연산
	abstract int mul (int a, int b); 	// 곱하기
	abstract double div (int a, int b); // 나누기
}

class Calc_Impl extends Calc {	//Calc 를 구현한 클래스
	@Override
	int add(int a, int b) {
		return a+b;
	}
	
	@Override
	int diff(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	@Override
	int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	@Override
	double div(int a, int b) {
		return (double)a/(double)b;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		
		// 1. 구현 클래스의 메소드 호출 후 출력
		System.out.println("=====구현 클래스로 메소드 호출 후 출력======");
		
		Calc cal = new Calc_Impl();
		
		System.out.println(cal.add(a, b));
		System.out.println(cal.diff(a, b));
		System.out.println(cal.mul(a, b));
		System.out.println(cal.div(a, b));
		
		// 2. 익명 클래스로 메소드 호출 후 출력
		System.out.println("=====익명 클래스로 메소드 호출 후 출력======");
		
		Calc cal2 = new Calc() {
			@Override
			int add(int a, int b) {
				return a+b;
			}
			
			@Override
			int diff(int a, int b) {
				return a-b;
			}
			
			@Override
			int mul(int a, int b) {
				return a*b;
			}
			
			@Override
			double div(int a, int b) {
				return (double)a/(double)b;
			}
		};
		
		System.out.println(cal2.add(a, b));
		System.out.println(cal2.diff(a, b));
		System.out.println(cal2.mul(a, b));
		System.out.println(cal2.div(a, b));
	}

}
