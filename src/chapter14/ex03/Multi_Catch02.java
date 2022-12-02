package chapter14.ex03;

public class Multi_Catch02 {

	public static void main(String[] args) {
		// 여러개의 Exception을 한꺼번에 처리
		
		try {
			System.out.println(3/1);
			
			int [] arr1 = new int [] {1,2,3};
			System.out.println(arr1[2]);
			
			int num1 = Integer.parseInt("20A");
		} catch (Exception e) {		//Exception : 모든 예외의 부모
			//각각의 예외의 대해서 세부적인 처리가 불가능
			System.out.println("모든 예외 처리");
			
			//try 블락에서 어떤 예외가 발생되었는지 알 수 있도록 출력
			System.out.println(e.getMessage()); // 간랸한 정보를 출력
			e.printStackTrace(); // 자세한 정보를 출력
		}
	}

}
