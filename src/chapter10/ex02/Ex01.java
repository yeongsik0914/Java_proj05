package chapter10.ex02;

class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}
class Student extends Human {
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student {
	String stu2ID;
	void sut2Eat() {
		System.out.println("학생2는 음식을 맛있게 먹습니다.");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// 업캐스팅 실습
		//1. Student 객체를 생성하면서 Human 타입으로 지정 : h1
		System.out.println("==========h1===============");
		Human h1 = new Student();
		h1.name = "홍길동";
		h1.age = 13;
		System.out.println(h1.name);
		System.out.println(h1.age);
		h1.eat();
		
		//2. Student 객체를 생성하면서 Student 타입으로 지정 : s1
		System.out.println("==========s1===============");
		Student s1 = new Student();
		s1.name = "홍길순";
		s1.age = 10;
		System.out.println(s1.name);
		System.out.println(s1.age);
		s1.eat();
		s1.stuID = "10102";
		s1.stuEat();
		
		//3. Student2 객체를 생성하면서 Human 타입으로 지정 : h2
		System.out.println("==========h2===============");
		Human h2 = new Student2();
		h2.name = "김기영";
		h2.age = 7;
		System.out.println(h2.name);
		System.out.println(h2.age);
		h2.eat();
		
		//4. Student2 겍체를 생성하면서 Student 타입으로 지정 : s2
		System.out.println("==========s2===============");
		Student s2 = new Student2();
		s2.name = "김기철";
		s2.age = 15;
		System.out.println(s2.name);
		System.out.println(s2.age);
		s2.eat();
		s2.stuID = "30504";
		s2.stuEat();
		//5. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		System.out.println("==========s3===============");
		Student2 s3 = new Student2();
		s3.name = "김희순";
		s3.age = 15;
		System.out.println(s3.name);
		System.out.println(s3.age);
		s3.eat();
		s3.stuID = "30518";
		s3.stuEat();
		s3.stu2ID = "1234";
		s3.sut2Eat();
	}

}
