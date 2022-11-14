package chapter04.ex03;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 이중 For 문을 사용해서 1단 ~ 19단 까지 출력
		// 3의 배수단 만 출력
		
		// 1단~ 19단
		for (int i=1; i<20; i++) {
			System.out.println(i + "단 출력");
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		System.out.println("===================3의 배수단 만 출력===========================");
		// 3의 배수단 만 출력
		
		for (int i=1; i<20; i++) {
			if(i%3 == 0) { 
				System.out.println(i + "단 출력");
				for(int j=1; j<10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println();
			}
		}
	}

}
