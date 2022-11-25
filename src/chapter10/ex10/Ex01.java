package chapter10.ex10;

class C {
	String stuID;
	String name;
	int age;
	
	//c1.equals(c2)	//stuId 필드를 재정의 해서, stuId가 같으면 ture, 아니면 false
	
	//생성자, 기본생성자1, 생성자2
	C() {}

	public C(String stuID, String name, int age) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}

	
	//toString 메소드 재정의 : 필드의 값을 출력, 객체
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(this.stuID == ((C)obj).stuID) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {

		C c1 = new C("1",null ,0);
		C c2 = new C("1",null ,0);
		C c3 = new C("2",null ,0);
		System.out.println("------- c1==c2 ----");
		System.out.println(c1==c2);
		System.out.println("------- c1.equals(c2) -------");
		System.out.println(c1.equals(c2));
		System.out.println("------- c2.equals(c3) -------");
		System.out.println(c2.equals(c3));
		
		
	}

}
