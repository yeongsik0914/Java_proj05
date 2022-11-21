package chapter07.ex01;

public class Ex01 {
	
	
	public static void main(String[] args) {

		//객체 생성, 메소드 호출 : Main method에서 호출
		//sum1, sum2 객체 생성 없이 바로 호출 : static 메소드
		
		Ex01 ex01 = new Ex01() {};
		System.out.println("정수형 3개 더하기 : "+ method1(1,2,3));
		System.out.println("=====================");
		
		System.out.println("실수형 3개 더하기 : " + method2(1.5, 4.2, 3.8));
		System.out.println("=====================");
		
		String d = ex01.print("제품명 ", "제품수량 ", "제품가격");
		System.out.println(d);
		
		System.out.println(ex01.print("제품명 ", "제품수량 ", "제품가격"));
	}
	
	
	//정수값 3개를 인풋 받아 리턴하는 메소드 (static)
	public static int method1 (int a1, int a2, int a3) {
		return a1+a2+a3;
	}
	
	//실수 3개를 인풋 받아 리턴하는 메소드 (static)
	public static double method2 (double a1, double a2, double a3) {
		return a1+a2+a3;
	}
	
	//문자열을 연결해서 출력하는 메소드 (인스턴스 메소드 : static을 사용하지 않는 메소드)
	//"제품명", "제품수량", "제품가격"
	public String print (String a, String a1, String a2 ) {
		return a + a1 + a2;
	}
	
	
}
