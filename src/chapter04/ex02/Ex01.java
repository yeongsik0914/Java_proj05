package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> switch 문을 사용하여 프로그램 하세요.
		// 스캐너로 정수 1을 인풋 받으면 "금메달입니다." 출력
		// 스캐너로 정수 2을 인풋 받으면 "은메달입니다." 출력
		// 스캐너로 정수 3을 인풋 받으면 "동메달입니다." 출력
		// 그 외 값을 인풋 받으면 "메달이 없습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		int medal;
		
		System.out.println("등수를 입력해주세요 : ");
		medal = sc.nextInt();
		
		switch (medal) {
		case 1 :
			System.out.println("금메달입니다.");
			break;
		case 2 :
			System.out.println("은메달입니다.");
			break;
		case 3 :
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;
		}
		sc.close();
	}

}
