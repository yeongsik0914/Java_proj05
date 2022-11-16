package chapter05.ex03;

import java.util.Arrays;

public class Initial_Value {

	public static void main(String[] args) {
		// 기본 자료형과 참조 자료형의 초기값
		// 기본 자료형 : Stack 공간에 변수와 변수의 값이 저장됨
		// 참조 자료형 (배열) :		1. Stack 공간에 [배열] 변수와 Heap 영역의 주소정보가 저장
		//              	  	2. Heap 영역에는 값이 저장
		//						  - 강제 초기화가 됨.  boolean (false), 정수 (0), 실수 (0,0)
		//						  - cahr (공백), String (Null)
		
		
		// 1. Stack 메모리 값 (강제 초기화가 되지 않음)
		int value1;
		//System.out.println(value1); //오류 발생 : 초기값이 없다.
		int[] value2;
		//System.out.println(value2); //오류 발생 : value2에 Heap 영역의 주소값이 없다.
		
		
		int value3 = 0;
		System.out.println(value3);
		int[] value4 = null; 		// null : 비어있는 상태, 기본 자료형에는 사용할 수 없다.
									// 참조 잘형에서만 사용 가능
		System.out.print(value4);	// value4 Heap 영역에 주소가 비어 있는 상태 : null
		
		System.out.println("\n=========================");
		
		// 2. Heap 영역은 강제 초기화가 된다. boolean (false), 정수 (0), 실수 (0,0)
		// 2-1. 기본자료형 배여
		
		boolean[] arr1 = new boolean[3]; // 기본값으로 false가 각 방에 할당됨.
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
			
		}	// 각 방에 초기값이 들어 있다.
		
		System.out.println("\n==========정수형 : 초기값으로 0================");
		int [] arr2 = new int[5];
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println("\n===========실수형 : 초기값으로 0.0==============");
		double[] arr3 = new double[3];
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println("\n===========문자 : <초기값으로 출력 안됨> <공백> ==============");
		char[] arr4 = new char[3];
		for (int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		
		System.out.println("\n===========문자열 : 초기값으로 null============");
		String[] arr5 = new String[3];
		for (int i=0; i<arr5.length; i++) {
			System.out.println(arr5[i] + " ");
		}
		System.out.println("\n============================================");
		System.out.println("==== Arrays.toString()로 출력 =====");
		
		System.out.println(Arrays.toString(arr1));	// boolean
		System.out.println(Arrays.toString(arr2));	// int
		System.out.println(Arrays.toString(arr3));	// double
		System.out.println(Arrays.toString(arr4));	// char
		System.out.println(Arrays.toString(arr5));	// String
	}

}
