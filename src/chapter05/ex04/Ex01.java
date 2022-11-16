package chapter05.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> : 오늘까지 : << 12시 까지 >>		
		Scanner sc = new Scanner(System.in);
		int select;
		
		do {
			System.out.println("===============================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고"
					+ "1씩 증가하도록 값을 넣는데 4의 배수만 빼고 저장후 출력");
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3씩 증가하도록 저장하는데"
					+ "그 중 6의 배수인 경우 빼고 저장 후 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("===============================");
			
			System.out.println("위 번호를 선택하세요.");
			select = sc.nextInt();
			
			if(select==1) {
				int arr_idx; // 배열의 길이 
				int idx = 0; // 인덱스 번호
				System.out.println("배열의 크기를 입력해주세요. >>");
				arr_idx = sc.nextInt();
				int[] arr = new int[arr_idx];
				for(int i=7; i<10000; i++) {
					if(idx == arr.length) {
						break;
					}
					if(i%7==0 || i%8==0) {
						arr[idx] = i;
						if(idx<arr.length) {
							idx++;
						}
					}
				}
				System.out.println(Arrays.toString(arr));
				
			} else if(select==2) {
				int arr_idx; // 배열의 길이 
				int idx = 0; // 인덱스 번호
				System.out.println("배열의 크기를 입력해주세요. >>");
				arr_idx = sc.nextInt();
				int[] arr = new int[arr_idx];
				for(int i=0; i<10000; i++) {
					if(idx == arr.length) {
						break;
					}
					if(i%4!=0) {
						arr[idx] = i;
						if(idx<arr.length) {
							idx++;
						}
					}
				}
				System.out.println(Arrays.toString(arr));
				
			} else if(select==3) {
				int arr_idx; // 배열의 길이 
				int idx = 0; // 인덱스 번호
				System.out.println("배열의 크기를 입력해주세요. >>");
				arr_idx = sc.nextInt();
				int[] arr = new int[arr_idx];
				for(int i=0; i<10000; i+=3) {
					if(idx == arr.length) {
						break;
					}
					if(i%6!=0) {
						arr[idx] = i;
						if(idx<arr.length) {
							idx++;
						}
					}
				}
				System.out.println(Arrays.toString(arr));
				
			} else if(select==4) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			} else {
				System.out.println("번호를 다시 선택하세요. (1 ~ 4 만 가능합니다.)");
			}
			
			
		} while(true);
	}

}
