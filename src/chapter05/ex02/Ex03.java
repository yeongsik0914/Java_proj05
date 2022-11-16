package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 길이(방 갯수) 를 인풋 받습니다.
		// 배열 변수 : arr1, 2의 배수를 저장 후 출력
		// 배열 변수 : arr2, 3의 배수를 인풋 받아서 출력
		
		Scanner sc = new Scanner(System.in);
		int length1;
		int length2;
		int num = 0;
		int num1 = 0;
		
		System.out.println("arr1의 방 갯수를 입력해주세요. >>");
		length1 = sc.nextInt();
		System.out.println("arr2의 방 갯수를 입력해주세요. >>");
		length2 = sc.nextInt();
		
		int[] arr1 = new int[length1];
		int[] arr2 = new int[length2]; 
		
		
		// 배열 변수 : arr1, 2의 배수를 저장 후 출력 , enhanced for 문을 사용해서 출력
		/* for(int i : arr1) {
			if(i==0) {
				arr1[i] = arr1[i] + 3;
			} else {
				arr1[i] = num + 3;
			}
			num = arr1[i];
			System.out.print(arr1[i] + " ");
		} 
		
		System.out.println();
		
		// 배열 변수 : arr2, 3의 배수를 인풋 받아서 출력 , for 문을 사용해서 출력
			for(int i=0; i<arr2.length; i++) {
			if(i==0) {
				arr2[i] = arr2[i] + 3;
			} else {
				arr2[i] = num1 + 3;
			}
			num1 = arr2[i];
			System.out.print(arr2[i] + " ");
		} */
		
		
		// 선생님 풀이
		for (int i=0, j=2; i<arr1.length; i++, j+=2) {
			arr1[i] = j;
		}
		for (int i=0, j=3; i<arr2.length; i++, j+=3) {
			arr2[i] = j;
		}
		
		System.out.println("== enhanced for 문을 사용해서 2의 배수 출력 : arr1====");
		for (int k : arr1 ) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println(" ====== for 문을 사용해서 3의 배수 출력 : arr2===");
		
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}

}
