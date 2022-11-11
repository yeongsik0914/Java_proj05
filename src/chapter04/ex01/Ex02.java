package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <<스캐너에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로그램을 작성 해주세요.
		// IF
		int select;
		int kor, eng, math;
		int num;
		String aName;
		String bName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================================================");
		System.out.println("1. 학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름식별");
		System.out.println("================================================");
		System.out.println("위의 번호를 선택 하세요. >>>");
		select = sc.nextInt();
		
		if(select == 1) {
			int sum;
			double avg;
			System.out.println("================================================");
			System.out.println("1번 선택");
			System.out.println("국어 점수를 입력해주세요. : ");
			kor = sc.nextInt();
			System.out.println("영어 점수를 입력해주세요. : ");
			eng = sc.nextInt();
			System.out.println("수학 점수를 입력해주세요. : ");
			math = sc.nextInt();
			
			sum = kor + eng + math;
			avg = Math.round(sum/3.0);
			System.out.println("================================================");
			System.out.println("학점의 합계/평균은 \n" + "합계 : " + sum + 
								"\n평균 : " + avg );
			
		} else if(select == 2) {
			System.out.println("================================================");
			System.out.println("2번 선택");
			System.out.println("숫자를 입력해주세요. : ");
			num = sc.nextInt();
			System.out.println("================================================");
			System.out.println((num%2 != 0) ? "홀수입니다." : "짝수입니다.");
		} else if(select == 3) {
			System.out.println("================================================");
			System.out.println("3번 선택");
			System.out.println("A의 이름을 입력해주세요 : ");
			aName = sc.next();
			System.out.println("B의 이름을 입력해주세요 : ");
			bName = sc.next();
			System.out.println("================================================");
			System.out.println((aName.equals(bName) ? "같은 이름입니다." : "다른 이름입니다." ));
		} else {
			System.out.println("1 ~ 3 안에 숫자만 입력해주세요");
		}
	}

}
