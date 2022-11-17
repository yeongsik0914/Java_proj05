package chapter05.ex08;

import java.util.Arrays;

public class Argument_Of_MainMethod {

	public static void main(String[] args) {
		// main Method로 배열의 값 인풋 하기
		//1. args : main 메소드로 String [] 배열을 담은 변수 
		System.out.println(args.length);	//args 배열의 방의 갯수
		System.out.println();
		
		//2. args 배열 변수에 담긴 각 방의 값을 for 문을 사용해서 출력 하기
		for (int i=0; i<args.length; i++) {
			System.out.print(args[i] + " ");
		}
		
		System.out.println();
		System.out.println("=== Enhanced For 문을 사용해서 출력 ===");
		for (String k : args) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("=== Arrays.toString() 문을 사용해서 출력 ===");

		System.out.println(Arrays.toString(args)); 
		 
		System.out.println("========String 타입을 정수================\n");
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		
		System.out.println(a+b+c+d);	//a, b, c, d : 정수가 아니랃 String
			// 1234 : + : 문자열 연결
		 
		System.out.println("=======String 을 정수로 변환===============");
		// String 타입의 숫자를 정수로 변환해서 변수에 할당
		int e = Integer.parseInt(a);	// String 타입의 숫자를 정수로 변환
		int f = Integer.parseInt(b);
		int g = Integer.parseInt(c);
		int h = Integer.parseInt(d);
		
		System.out.println(e+f+g+h);
		
		System.out.println("=======정수를 을 문자열로 변환===============");
		// 숫자형를 다시 문자열로
		String a1 = Integer.toString(e);
		String a2 = Integer.toString(f);
		System.out.println(a1 + a2);
		
		
	}

}
