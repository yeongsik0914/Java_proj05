package chapter12.ex03;

interface Animal1 {
	void cry();
}

interface Animal2 {
	void run();
}

interface Animal3 {
	void eat();
}

//interface extends interface
//앞의 타입과 뒤의 타입이 동일할 때는 extends 
interface K extends Animal1,Animal2,Animal3 {
	//cry(), run(), eat() 
}

class G implements K {
	@Override
	public void cry() {}
	
	@Override
	public void eat() {}
	
	@Override
	public void run() {}
}

class Aa {			//일반 클래스 : 모든 메소드는 실행부가 존재해야 한다.
	void abc() {System.out.println("Aa의 abc()");}
}

abstract class Bb {	//추상 클래스 : 추상 메소드가 하나라도 선언되어 있으면 
	abstract void bcd();
}

// extends 키 다음에는 하나의 클래스만 올 수 있다. // 클래스는 하나의 부모만 가진다.
	//일반클래스, 추상클래스 하나만 가능
// implements 키 다음에는 여러개의 interface가 올 수 있다. //interface는 다중 상속이 가능
// extends 가 먼저오고 implements : 순서가 바뀌면 안됨.
class Cc extends Aa implements Animal1, Animal2, Animal3{
	@Override
	public void cry() {}
	
	@Override
	public void eat() {}
	
	@Override
	public void run() {}
}

class Cc1 extends Bb implements Animal1, Animal2, Animal3{
	@Override
	void bcd() {}
	
	@Override
	public void cry() {}
	
	@Override
	public void eat() {}
	
	@Override
	public void run() {}
}

public class Interface_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
