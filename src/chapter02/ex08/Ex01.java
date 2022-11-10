package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록 하고
		// 어머님 이름, 아버님 이름, 형제 이름, 자신 이름
		// 어머님 나이, 아버님 나이, 형제 나이, 자신 나이
		
		// 콘솔에서 인풋 받은 이름은 모두 출력
		// 나이의 합계과 평균을 출력
		
		String mom_name;
		String dady_name;
		String sister_name;
		String my_name;
		int mom_age;
		int dady_age;
		int sister_age;
		int my_age;
		int sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어머님 이름은?");
		mom_name = sc.next();
		System.out.println("아버님 이름은?");
		dady_name = sc.next();
		System.out.println("누나의 이름은?");
		sister_name = sc.next();
		System.out.println("당신의 이름은?");
		my_name = sc.next();
		
		System.out.println("어머님의 나이는?");
		mom_age = sc.nextInt();
		System.out.println("아버님의 나이는?");
		dady_age = sc.nextInt();
		System.out.println("누나의 나이는?");
		sister_age = sc.nextInt();
		System.out.println("당신의 나이는?");
		my_age = sc.nextInt();
		
		sum = mom_age + dady_age + sister_age + my_age;
		avg = sum/4.0;
		
		System.out.println("==============================");
		
		System.out.println("우리 가족의 이름은 \n" + 
				"엄마 : " + mom_name +
				"\n아빠 : " + dady_name + 
				"\n누나 : " + sister_name + 
				"\n본인 : " + my_name);
		
		System.out.println("우리 가족의 나이의 합은 : " + sum);
		
		System.out.println("우리 가족의 나이의 평균은 : " + avg);
		
		System.out.println("===============================");
		
	}

}
