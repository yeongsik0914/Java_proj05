package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> do while 문으로 무한 루프를 돌립니다.
		// 스캐너에서 정수 1을 넣으면 "1. 평균 출력" 으로 출력
		// 스캐너에서 정수 2을 넣으면 "1. 합계 출력" 으로 출력
		// 스캐너에서 정수 3을 넣으면 "1. 이름 출력" 으로 출력
		// 4번을 넣으면 do while 문을 빠져나옴 "프로그램 종료"
		
		int select;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=======================================================");
			System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("=======================================================");
			
			System.out.println("위 번호를 선택하세요.");
			select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("1. 평균 출력 \n");
				break;
				
			case 2:
				System.out.println("2. 합계 출력 \n");
				break;
				
			case 3:
				System.out.println("3. 이름 출력 \n");
				break;
				
			case 4:
				break;
				
			default :
				System.out.println("잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요");
				break;
			}
			
			if (select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
				
		} while (true);
		
		System.out.println("do while 문을 빠져 나왔습니다.");
	}

}
