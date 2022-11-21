package chapter07;

class Student {
	
	//필드 선언
	String stuName;		//학생이름
	int stuNum;			//학번을 저장
	String stuAddr;		//학생의 주소
	String stuphone;	//학새의 전화번호
	double weight;		//학생의 몸무게
	
	// 생성자 오버로딩
	// 기본 생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	Student(){} // 기본 생성자
	
	Student(String stuName, int stuNum, String stuAddr) {
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
	}
	
	Student(String stuName, int stuNum, String stuAddr, String stuphone, double weight) {
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuphone = stuphone;
		this.weight = weight;
	}
	
	
	// 필드의 값을 출력하는 메소드 void print () { 필드의 값을 출력 }
	void print () {
		System.out.println("이름 : " + stuName);
		System.out.println("학번 : " + stuNum);
		System.out.println("주소 : " + stuAddr);
		System.out.println("전화번호 : " +stuphone);
		System.out.println("몸무게: " + weight);
	} 
}

public class Ex02 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.print();
		
		System.out.println("===================================");
		
		Student stu2 = new Student("홍길동", 10, "조선"); // String in String
		stu2.print();
		
		System.out.println("====================================");
		
		Student stu3 = new Student("고길동", 1, "둘리성", "010-1234-1231",64.32);
		stu3.print();
		
	}

}
