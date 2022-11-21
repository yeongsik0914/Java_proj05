package chapter07.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 가변 길이 배열 문제
		/*
		 	values[0] : 값이 정수 1 ~ 9 이 들어올때 "파워레벨 1 [9]입니다."
		 	values[1] : 값이 정수 1 ~ 9이 들어올때 "스피드레벨 1 [9] 입니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		arrayFlexable(sc.nextInt(),sc.nextInt());
		sc.close();
	}
	
	public static void arrayFlexable (int...values) {
		if(values[0] > 0 && values[0] < 10) {
			System.out.println("파워레벨 " + values[0] + " 입니다.");
		} else {
			System.out.println("잘못된 입력 입니다. 1 ~ 9 사이의 값만 넣으세요");
		}
		if(values[1] > 0 && values[1] < 10) {
			System.out.println("스피드레벨 " + values[1] + " 입니다.");
		} else {
			System.out.println("잘못된 입력 입니다. 1 ~ 9 사이의 값만 넣으세요");
		}
	}

}
