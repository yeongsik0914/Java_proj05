package chapter07.ex05;

class Student{
	//필드 선언
	String stuName;		//학생이름 : 학생이름 없음
	int stuNo;			//학번	 : 0
	String stuPhone;	//전화번호 : 000-0000-0000
	String stuAddr;		//주소	 : "서울"
	int atuAge;			//나이    : 0
	double stuWeight;	//몸무게	 : 0.0
	
	Student(){	//기본 생성자에서 초기값을 할당
		stuName = "학생이름 없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		atuAge = 0;
		stuWeight = 0.0;
	}
	
	Student(String stuName){
		this();
		this.stuName = stuName;
	}
	
	Student(String stuName, int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	
	Student(String stuName, int stuNo, String stuPhone){
		this(stuName, stuNo);
		this.stuPhone = stuPhone;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr){
		this(stuName, stuNo, stuPhone);
		this.stuAddr = stuAddr;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int atuAge){
		this(stuName, stuNo, stuPhone, stuAddr);
		this.atuAge = atuAge;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int atuAge, double stuWeight){
		this(stuName, stuNo, stuPhone, stuAddr, atuAge);
		this.stuWeight = stuWeight;
	}
	
	void print () {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("학번 	: " + stuNo);
		System.out.println("전화번호	: " + stuPhone);
		System.out.println("주소	: " + stuAddr);
		System.out.println("나이	: " + atuAge);
		System.out.println("몸무게	: " + stuWeight);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//기본 생성자 호출
		System.out.println("=== 기본 생성자 호출 ===");
		Student std = new Student();
		std.print();
		
		//매개 변수가 1개인 생성자 호출
		System.out.println("\n=== 매개변수가 1개인 생성자 호출 ===");
		Student std1 = new Student("홍길동");
		std1.print();
		
		//매개 변수가 2개인 생성자 호출
		System.out.println("\n=== 매개변수가 2개인 생성자 호출 ===");
		Student std2 = new Student("홍길동", 2);
		std2.print();
		
		//매개 변수가 3개인 생성자 호출
		System.out.println("\n=== 매개변수가 3개인 생성자 호출 ===");
		Student std3 = new Student("홍길동", 2, "010-1234-5678");
		std3.print();
		
		//매개 변수가 4개인 생성자 호출
		System.out.println("\n=== 매개변수가 4개인 생성자 호출 ===");
		Student std4 = new Student("홍길동", 2, "010-1234-5678", "부산");
		std4.print();
		
		//매개 변수가 5개인 생성자 호출
		System.out.println("\n=== 매개변수가 5개인 생성자 호출 ===");
		Student std5 = new Student("홍길동", 2, "010-1234-5678", "부산", 23);
		std5.print();
		
		//매개 변수가 6개인 생성자 호출
		System.out.println("\n=== 매개변수가 6개인 생성자 호출 ===");
		Student std6 = new Student("홍길동", 2, "010-1234-5678", "부산", 23, 75.8);
		std6.print();
	}

}
