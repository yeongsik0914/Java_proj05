package chapter13.ex08;

interface Animal {
	void cry();
	void fly();
}

//인터페이스를 사용해서 4가지 형태로 출력
// 1. Animal을 구현한 이너클래스를 생성 후 메소드 출력 
// 2. Animal을 익명 클래스로 생성해서 출력
// 3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 생성
// 4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 없이 출력

class Animal1 {
	void animal1() {
		Animal a = new Eagle();
		a.cry();
		a.fly();
	}
	class Eagle implements Animal {
		@Override
		public void cry() {
			System.out.println("끼요요요요");
		}
		@Override
		public void fly() {
			System.out.println("독수리는 하늘을 날아");
		}
	}
}

class Animal2 {
	void animal2() {
		a2.cry();
		a2.fly();
	}
	Animal a2 = new Animal() {
		@Override
		public void cry() {
			System.out.println("끼요요요요");
		}
		@Override
		public void fly() {
			System.out.println("독수리는 하늘을 날아");
		}
	};
}

class Animal3 {
	void animal3(Animal a) {
		a.cry();
		a.fly();
	}
}


public class Ex01 {

	public static void main(String[] args) {
		//1. Animal을 구현한 이너클래스를 생성 후 메소드 출력
		Animal1 a1 = new Animal1();
		a1.animal1();
		
		// 2. Animal을 익명 클래스로 생성해서 출력
		System.out.println("======================");
		Animal2 a2 = new Animal2();
		a2.animal2();
		
		// 3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 생성
		System.out.println("======================");
		Animal3 a3 = new Animal3();
		Animal animal = new Animal() {
			@Override
			public void cry() {
				System.out.println("끼요요요요");
			}
			@Override
			public void fly() {
				System.out.println("독수리는 하늘을 날아");
			}
		};
		a3.animal3(animal);
		
		// 4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 없이 출력
		System.out.println("======================");
		a3.animal3(new Animal() {
			@Override
			public void cry() {
				System.out.println("끼요요요요");
			}
			@Override
			public void fly() {
				System.out.println("독수리는 하늘을 날아");
			}
		});
		
		
		
	}
}
