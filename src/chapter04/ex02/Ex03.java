package chapter04.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// <문제> 1월 ~ 12월까지 월을 인풋 받아서 해당 월의 일수를 출력해주면 됩니다.
		// 출력 : 1월은 31일 입니다.
		// 	   : 2월은 28일 입니다.
		// 	   month 월은 day 일 입니다.
		// switch 문으로 작성 : << 6: 00 까지
		int month ;
		int day = 30;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("월을 입력해주세요. : ");
		month = sc.nextInt();
		System.out.println("=========================");
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = 31;
			break;
		
		case 2 :
			day = 28;
			break; 
			
		case 4 : case 6 : case 9 : case 11 :
			break;
			
		default :
			System.out.println("제대로 월을 입력해주세요.");
			break;
		}
		
		System.out.printf("%S월은 %d일 입니다.", month, day);	
		
		sc.close();
		
	}

}
