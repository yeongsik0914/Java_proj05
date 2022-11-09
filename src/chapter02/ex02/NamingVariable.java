package chapter02.ex02;

public class NamingVariable {

	public static void main(String[] args) {
		// 변수에는 값을 대입해서 변화되는 값을 할당 할 수 있다.
		// 변수 이름 지정 하기
		// - 변수명은 소문자로 시작(권고), 클래스 이름은 대문자로 시작 (필수)
		// - 변수명으로 한글을 사용할 수 있다. (권장하지 않는다.)
		// - 변수명으로 특수문자는 _ , $ 만 사용 가능.
		// - 변수명으로 숫자는 사용 가능하나 변수명 첫 자리에 숫자가 오면 오류 발생.
		// - 변수명으로 자바에서 사용하는 예약어,
		
		// 자료형 변수명
		boolean aBcD;	 // true, false에 넣을 수 있다.
		aBcD = true; 
		aBcD = false;
		
		// aBcD = 10; boolean으로 선언한 변수는 true와 false만 넣을 수 있다. (오류 발생)
		byte 가나다라;	
		short _abcd;	 // _ , $ 를 사용할 수 있다.
		boolean $_abcd;	 //
		// boolean %abcde;  _ , $ 이외의 특수 문자는 변수명으로 사용 불가능
		// char 3abcd;
		char a3bcd;      //
		long abcd3;
		// double private; 자바에서 사용되는 예약어는 사용할 수 없다.
		// int mv work;	 // 변수명으로 공백은 올 수 없다.
		int myWork;		 // 변수명의 처음자는 소문자, 이어서 여러단어를 적용할때 첫자 대문자 (카멜 표기법)
		String myClassName; // 권장사항
		// 상수 : 값을 넣으면 그 값을 변화 하지 못하도록 설정.
			// - 변수 자료형 앞에 final 키가 붙으면 상수
			// - final double PI = 3.141592;
			// - 상수명은 전체를 대문자 지정 (권장)
		double PI = 3.141592;		// 변수 : PI 변수에 값을 변화 시켜줄 수 있다.
		System.out.println(PI);
		PI = 123.456;
		System.out.println(PI);
		
		final double PI2 = 3.141592; // 상수 : 값을 넣으면 수정할 수 없다.
		System.out.println(PI2);
		// PI2 = 123.456; 상수이므로 다른 값을 넣을 수 없다.
		final int MY_DATA = 10;
		System.out.println(MY_DATA);
		final float my_Data; // 권고 사항 위배
	}

}
