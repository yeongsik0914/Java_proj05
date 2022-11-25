package chapter11.ex04;

abstract class Car {	//트럭, 자가용, 굴삭기
	abstract void run();
	abstract void eat();
}
class Truck extends Car{	
	@Override
	void run() {
		System.out.println("트럭이 달린다.");
	}
	@Override
	void eat() {
		System.out.println("트럭은 디젤을 먹는다.");
	}
}

class Owncar extends Car{
	@Override
	void run() {
		System.out.println("자가용이 달린다.");
	}
	@Override
	void eat() {
		System.out.println("자가용은 가솔린을 먹는다.");
	}
}

class Excavators extends Car{
	@Override
	void run() {
		System.out.println("굴삭기가 달린다.");
	}
	@Override
	void eat() {
		System.out.println("굴삭기는 디젤을 먹는다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Car t = new Truck();
		t.run();
		t.eat();
		System.out.println("=================");
		
		Car o = new Owncar();
		o.run();
		o.eat();
		System.out.println("=================");
		
		Car e = new Excavators();
		e.run();
		e.eat();
	}

}
