package chapter10.ex01;

class Animal {		//Animal 클래스를 상속해서 Tiger, Eagle, Lion 을 생성
						//자식 클래스에서는 필드 1개, 메소드 1개 정의
					//LionChild 클래스는 Lion 클래스를 상속해서 필드 1개, 메소드 1개 정의
	String name;
	int age;
	String color;
	
	void eat () {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep () {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}

class Tiger extends Animal {
	int TigerID;
	
	void Tiger_Sound () {
		System.out.println("호랑이는 어흥");
	}
}

class Eagle extends Animal {
	int EagleID;
	
	void Eagle_Sound () {
		System.out.println("독수리는 삐");
	}
}

class Lion extends Animal {
	int LionID;
	
	void Lion_Sound () {
		System.out.println("사자는 으르렁");
	}
}

class LionChild extends Lion {
	int LionChildID;
	
	void LionChild_Sound () {
		System.out.println("어린 사자는 야옹");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
		System.out.println("=== 부모 클래스 필드와 메소드 출력 ===");
		t1.name = "호랑이";
		t1.age = 10;
		t1.color = "황색";
		t1.eat();
		t1.sleep();
		System.out.println("=== 자식 클래스 필드와 메소드 출력 ===");
		t1.TigerID = 1;
		t1.Tiger_Sound();
		
		System.out.println("===================================");
		
		Eagle e1 = new Eagle();
		
		System.out.println("=== 부모 클래스 필드와 메소드 출력 ===");
		e1.name = "독수리";
		e1.age = 20;
		e1.color = "검은색";
		t1.eat();
		t1.sleep();
		System.out.println("=== 자식 클래스 필드와 메소드 출력 ===");
		e1.EagleID = 2;
		e1.Eagle_Sound();
		
		System.out.println("===================================");
		
		Lion l1 = new Lion();
		
		System.out.println("=== 부모 클래스 필드와 메소드 출력 ===");
		l1.name = "사자";
		l1.age = 30;
		l1.color = "노란색";
		t1.eat();
		t1.sleep();
		System.out.println("=== 자식 클래스 필드와 메소드 출력 ===");
		l1.LionID = 3;
		l1.Lion_Sound();
		
		System.out.println("===================================");
		
		LionChild lch1 = new LionChild();
		
		System.out.println("=== 부모 클래스 필드와 메소드 출력 ===");
		lch1.name = "어린사자";
		lch1.age = 1;
		lch1.color = "노란색";
		lch1.eat();
		lch1.sleep();
		lch1.LionID = 4;
		lch1.Lion_Sound();
		System.out.println("=== 자식 클래스 필드와 메소드 출력 ===");
		lch1.LionChildID = 1;
		lch1.LionChild_Sound();
				
		
		
	}

}
