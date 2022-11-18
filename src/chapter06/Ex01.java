package chapter06;

class Man {
	//필드
	String name = "홍길동";
	int age = 30;
	String phone = "010-1111-1234";
	String addr = "서울 종로구 인사동";
	double weight = 70.5;
	
	//기본 생성자는 생략됨 : Man () {}
	
	
	//메소드 : 
	void add1 () {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한 값을 출력
		System.out.println("============ add1 메소드 출력 ==============");
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n더한 값 : " + sum);
	}
	void add2 () {
		// 1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한 값 출력
		System.out.println("============ add2 메소드 출력 ==============");
		int sum = 0;
		for(int i=1; i<=500; i++) {
			if(i%3 == 0 || i%4 == 0) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n더한 값 : " + sum);
	}
	void add3 () {
		// 1 ~ 1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한 값 출력
		System.out.println("============ add3 메소드 출력 ==============");
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i%4 != 0) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n더한 값 : " + sum);
	}
}





public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성 및 객체의 필드의 값이나 메소드 호출
		Man m = new Man();
		System.out.println("==========필드 정보===========");
		System.out.println("이름: " + m.name);
		System.out.println("나이: "+ m.age);
		System.out.println("전화번호: " + m.phone);
		System.out.println("주소: " + m.addr);
		System.out.println("몸무게: " + m.weight);
		System.out.println("============================ \n");
		m.add1();
		m.add2();
		m.add3();
		
		
	}

}
