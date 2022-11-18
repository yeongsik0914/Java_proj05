package chapter07;

class Calc{
	
	//사칙 연산을 처리하는 메소드
	
	
	//두 정수의 값을 받아서 더해서 값을 던져줌
	int add (int a, int b) {
		return a + b;
	}
	
	
	// 빼기 (diff)
	int diff (int a, int b) {
		return a - b;
	}
	
	// 곱하기 (mul)
	int mul (int a, int b) {
		return a * b;
	}
	
	// 나누기 (div) : double
	double div (double a, double b) {
		return a / b;
	}
	
	// 면적 (Rec) (가로 : x 세로 : y)
	double Rec (double a, double b) {
		return (a*b)/3.3058;
	}
	
}



public class Ex01 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("더하기: " + calc.add(10, 20));
		System.out.println("빼기: " + calc.diff(50, 22));
		System.out.println("곱하기: " + calc.mul(40, 50));
		System.out.println("나누기: " + calc.div(10, 55));
		System.out.println("면적 구하기: " + calc.Rec(20, 68.8));
	}

}
