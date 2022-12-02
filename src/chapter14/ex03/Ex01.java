package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3 개의 예외를 하나의 try ~ catch 블락에 넣고,
				//각각에 예외에 대해서 catch 블락
				//3개의 예외를 한꺼번에 처리
		
		try {
			System.out.println(3/0);
			
			int [] arr = new int [] {1,2,3};
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 오류");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 오류");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 오류");
		} 
		
		try {
			System.out.println(3/0);
			
			int [] arr1 = new int [] {1,2,3};
			System.out.println(arr1[5]);
			
			int num1 = Integer.parseInt("20A");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("3개 한꺼번에");
			System.out.println(e.getMessage());// 예외의 간단한 정보를 출력
			e.printStackTrace();
		}
		
		System.out.println("=== 3. 각각의 try 블락에서 처리========");
		try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			System.out.println("3. 0으로 나눌 수 없습니다.");
		}
		
		try {
			int [] arr1 = new int [] {1,2,3};
			System.out.println(arr1[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3. 배열의 방을 넘겼습니다.");
		}
		
		try {
			int num1 = Integer.parseInt("20A");
		} catch (NumberFormatException e) {
			System.out.println("3. 숫자를 변경할 수 없습ㄴ디ㅏ.");
		}
		
		System.out.println("프로그램 종료");
		
		
		
 	}

}
