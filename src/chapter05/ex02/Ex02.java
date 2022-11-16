package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제1> 배열 변수 : arr1, 배열의 방의 갯수 : 500개
		// 배열방에 3의 배수 와 5의 배수를 저장
		// 출력 : 1. for, 2. Enhanced For, 3. Arrays.toString()를 사용해서 출력
		
		// 배열 변수 선언.
		int []arr1 = new int[500];
		
		// 배열 방에 각 인데스마다 3의 배수 와 5의 배수 값 저장.
		for(int i=0, j1=3, j2=5; i<500; i++) {
			// 저장 형식 3 5 6 10 짝수 번 자리에는 3의 배수 홀수 번 자리에는 5의 배수
			if(i%2==0) {
				arr1[i] = arr1[i] + j1;
				j1 += 3;
			}
			else {
				arr1[i] = arr1[i] + j2;
				j2 += 5;
			}
		}
		
		/* 선생님 풀이
		 * for ( int a = 1; i<500; i++) {
		 *    if(a%3 ==0 || a%5 ==0){
		 *    arr1[i] = a;
		 *    i++;
		 * }
		 * if (i>499) {
		 * 		break;
		 * }   
		 */
		
		System.out.println();
		
		// 1. for를 이용한 값 출력
		for(int i=0; i<500; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		// 2. Enhanced for를 이용한 값 출력
		for(int i : arr1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Arrays.toString() 메소드를 이용한 값 출력
		System.out.println(Arrays.toString(arr1));
		
		
	}

}
