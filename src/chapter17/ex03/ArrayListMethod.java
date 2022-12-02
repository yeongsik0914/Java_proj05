package chapter17.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		List<Integer> aList1 = new ArrayList();
		
		//1. add (E element) : List에 값을 추가할 때 : ArrayList, Vector, LinkedList
			//마지막 방에 값이 들어감.
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		
		System.out.println(aList1);
		
		//2. add (int index, E element) : 특정 방 번호에 값을 넣는다.
		aList1.add(1, 6);	// 방 번호 1에 6값을 넣겠다.
		
		System.out.println(aList1);
		
		//3. addAll (다른 리스트 객체)
		List<Integer> aList2 = new ArrayList();
		aList2.add(1); aList2.add(2);
		System.out.println(aList2);	//1, 2
		
		aList2.addAll(aList1);
		System.out.println(aList2);	//1,2,3,6,4,5
		
		//4. addAll(int index, 또 다른 리스트 객체)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		
		System.out.println(aList3); //1, 2
		aList3.addAll(1, aList3);	//1번 방 뒤에 할당
		System.out.println(aList3);	
		
		//5. set(int index, E element) : 기존의 방의 값을 수정
		//aList3.set(0, null)
		aList3.set(1, 5); //1 방의 값을 5로 수정
		aList3.set(3, 6); //3 방의 값을 6으로 수정
		System.out.println(aList3);
		
		//6. remove(int index) : 특정 방 번호의 값을 삭제
		aList3.remove(1); 	// 1번 방의 값을 삭제
		System.out.println(aList3);	//[1,2,6]
		
		//7. remove(Object o) : 방의 들어간 값으로 삭제
		aList3.remove(new Integer(2));	//오류는 아니고 경고, 앞으로 없어질 내용이다.
		System.out.println(aList3); //[1,6]
		
		//8. clear() : 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3);
				
		//9. isEmpty() : 값이 없으면 : true, 값이 존재하면 : false
		System.out.println(aList3.isEmpty()); 	//true
		
		//10. size() : 방의 갯수 
		System.out.println(aList3.size()); 	//0
		aList3.add(1); aList3.add(2); aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size()); //3
		
		//11. get(int index) : 방 번호의 값을 가지고 올 때
		System.out.println("0 번쨰 : " + aList3.get(0)); //1
		System.out.println("1 번쨰 : " + aList3.get(1)); //2
		System.out.println("2 번쨰 : " + aList3.get(2)); //3
		
		//12. toArray() : List ==> Array (배열로 변환)
		Object[] obj = aList3.toArray();
		
		//배열의 값을 출력 : Arrays.toString ()
		System.out.println(Arrays.toString(obj)); // [1,2,3]
		
		//13. toArray(T[] t) --> t []  리스트 ==> 배열
		Integer[] int1 = aList3.toArray(new Integer[0]);	
		//0 : 변환할 배열방의 갯수인데 컬렉션의 배열 방 보다 작게 설정된 경우컬렉션에 저장된 것에 맞추어서 처리됨
		System.out.println(Arrays.toString(int1));
		
		Integer[] int2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(int2));
		
		
		
		
	}

}
