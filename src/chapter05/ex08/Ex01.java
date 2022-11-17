package chapter05.ex08;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> < 완료 시간 11: 20분 까지 >
		// args : 합계 40 77 99 100 200
		
		// 합계 : <정수를 더한 값을 출력>
		
		/*
		 * String a = args[0]; String b = args[1]; String c = args[2]; String d =
		 * args[3]; String e = args[4];
		 * 
		 * 
		 * int f = Integer.parseInt(a); int g = Integer.parseInt(b); int h =
		 * Integer.parseInt(c); int i = Integer.parseInt(d); int j =
		 * Integer.parseInt(e);
		 
		
		System.out.print("합계 : ");
		System.out.print(f + g + h + i + j);
		*/
		
		String s = args[0];
		int sum = 0;
		for (int i1=1; i1< args.length; i1++) {
			sum += Integer.parseInt(args[i1]);
		}
		System.out.println(sum);
		
		System.out.println("\n=================");
		System.out.println(s + 1 + 2 + 3);  //합계 123
	}

}
