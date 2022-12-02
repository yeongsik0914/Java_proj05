package chapter14.ex03;

public class Multi_Catch01 {

	public static void main(String[] args) {
		// 여러 예외가 동시에 발생된 경우 처리
		
		//1. 두 개의 Exception을 각각의 try ~ catch로 처리
		try {
			System.out.println(3/0);	//실행 시 예외 발생 : (ArithmeticException)
		} catch (ArithmeticException e) {
			System.out.println("숫자 0으로는 나눌수 없습니다.");
		} finally {
			System.out.println("첫 번째 프로그램 종료");
			System.out.println("===================");
		}
		
		try {
			int num = Integer.parseInt("10A");	//실행 시 예외 발생 : (NumberFormatException)
		} catch (NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀수 없습니다.");
		} finally {
			System.out.println("두 번째 프로그램 종료");
			System.out.println("====================");
		}
		//2. 하나의 try ~ catch 에서 한꺼번에 처리
			// 각각의 예외에 대해서 각각 처리하도록 함.
		
		try {
			System.out.println(3/0);	//실행 시 예외 발생 : (ArithmeticException)
			int num1 = Integer.parseInt("10A");	//실행 시 예외 발생 : (NumberFormatException)
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가 합니다.");
		} finally {
			System.out.println("세 번째 프로그램 종료");
		}
		
		System.out.println("====3. 방법 =======");
		// 3. 하나의 try ~ catch 에서 한번에 처리
			// 두 예외를 하나로 처리해도 문제가 없을 때
		try {
			System.out.println(3/0);	//실행 시 예외 발생 : (ArithmeticException)
			int num2 = Integer.parseInt("10A");	//실행 시 예외 발생 : (NumberFormatException)
		} catch (ArithmeticException | NumberFormatException e1) {
			System.out.println("두 개의 예외가 한꺼번에 발생되었습니다.");
		}	
	}

}
