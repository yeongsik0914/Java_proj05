package chapter10.ex03;

class Fruit{	//Fruit의 메소드를 오버라이딩해서 출력. 자식클래스 Apple, Banana, Orange
	void eat() {
		System.out.println("모든 과일은 맛있다.");
	}
}
class Apple extends Fruit {
	@Override
	void eat() {
		System.out.println("딸기는 빨간맛");
	}
}

class Banana extends Fruit {
	@Override
	void eat() {
		System.out.println("바나나는 노란맛");
	}
}

class Orange extends Fruit {
	@Override
	void eat() {
		System.out.println("오렌지는 주황맛");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		Fruit a1 = new Apple();
		Fruit a2 = new Banana();
		Fruit a3 = new Orange();
		a1.eat();
		a2.eat();
		a3.eat();
	}

}
