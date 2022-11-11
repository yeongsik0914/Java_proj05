package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*  <문제 1. Ex01> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수 값이 홀수 이면 "홀수 라고 출력하고
		 * 		  인풋 받은 값이 짝수이면 "짝수"라고 출력.
		 * 		  <삼항 연산자를 사용>>
		 * 		  11 20분까지 완료, << P.jangwoo@gmail.com Ex01.java >>
		 */
		
		int num;
		String check;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 값을 입력하세요. : ");
		num = sc.nextInt();
		System.out.println("정수 값은 : " + (num%2 == 0 ?  "짝수입니다." : "홀수입니다."));
	}

}
