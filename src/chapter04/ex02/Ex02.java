package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// EX02.java
		// 스캐너로 정수 gold, silver, bronze를 인풋 받으면 각각
		// 금, 은, 동 출력
		// 그 외의 값은 메달이 없다고 출력
		
		String medal;
		Scanner sc = new Scanner(System.in);
		System.out.println("메달 색를 영어로 입력해주세요 : ");
		medal = sc.next();
		
		switch (medal) {
		case "gold" :
			System.out.println("금메달입니다."); 
			break;
		case "silver" :
			System.out.println("은메달입니다.");
			break;
		case "bronze" :
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;
		}
		sc.close();
	}

}
