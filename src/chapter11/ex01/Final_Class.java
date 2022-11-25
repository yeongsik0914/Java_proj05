package chapter11.ex01;

class Aaa {
	int m;
	final int n;
	
	Aaa(){n = 10;}
	
	Aaa(int n) {
		this.n = n;
	}
	
	void run () {
		System.out.println("Aaa 클래스의 run() 입니다.");
	}
}

final class Bbb extends Aaa {	//상속이 불가한 클래스
	
}

//class Ccc extends Bbb {} 부모 클래스가 final 클래스이기 때문에 상속이 불가하다.

public class Final_Class {

	public static void main(String[] args) {

	}

}
