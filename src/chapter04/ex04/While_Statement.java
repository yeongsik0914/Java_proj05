package chapter04.ex04;

public class While_Statement {

	public static void main(String[] args) {
		// while 문 : 반복문, 조건이 true 동안 반복, 조건이 false 이면 실행블락을 빠져나온다.
		
		/*
		 	for (초기값; 조건; 증감식) {
		 		실행블락;
		 	}
		 */
		
		/*
		   초기값
		   while (조건) {
		   	실행블락;
		   	증감식
		   }
		 */
		
		//1. while 문의 기본 문법 구조 (증감식을 처리하지 않으면 무한 루프)
		System.out.println(" ====== while 문으로 출력 ======");
		int a = 0;
		while (a<10) {
			System.out.print(a + " ");
			a++;
		}
		
		//2. For 문으로 변환
		System.out.println("\n======= For 문으로 출력 ========");
		for (a=0; a<10; a++) {
			System.out.print(a + " ");
		}
		
		System.out.println("\n===============================");
		// while 문 vs for 문으로 처리; 100 ~ 1까지 2씩 감소해서 출력]
		
		//while
		System.out.println("\n==========while================");
		int i = 100;
		while(i>0) {
			System.out.print(i + " ");
			i-=2;
		}
		
		System.out.println("\n============FOR================");
		int j;
		for (j=100; j>0; j-=2) {
			System.out.print(j + " ");
		}
		
		System.out.println("\n========while에서 무한 루프============");
		
		boolean ab = true;
		int d = 0; 			//기본 자료형은 반드시 초기값이 할당 되어 있어야 한다.
		while (ab) {
			if ( d > 100) {
				break;
			}
			System.out.println("무한 루프" + d);
			d++;
		}
		
		System.out.println("while 문 빠져나옴");
	}

}
