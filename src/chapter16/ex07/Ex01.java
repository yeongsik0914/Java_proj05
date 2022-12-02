package chapter16.ex07;

abstract class Fluit {
	abstract void print();	//추상 메소드, 객체의 필드 정보를 출력
}
class Apple extends Fluit {
	private String name;	
	private int price;		
	
	//getter, setter를 통해서 인풋
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//print(메소드 오버라이딩해서 필드의 정보를 출력)
	@Override
	void print() {
		System.out.println("이름 : " + name + " , " + "가격 : " + price);
	}
}
class Banana extends Fluit {
	private String name;
	private int price;		
	
	//getter, setter를 통해서 인풋
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//print(메소드 오버라이딩해서 필드의 정보를 출력)
	@Override
	void print() {
		System.out.println("이름 : " + name + " , " + "가격 : " + price);
	}
	
}
//Fluit 을 상속하지 않았기 때문에 제너릭 타입으로 저장이 불가
class Pencil {
	private String name; 
	private int price; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void print() {
		System.out.println("이름 : " + name + " , " + "가격 : " + price);
	}
}

//제너릭 클래스 : Fluit을 상속하는 클래스만 저장할 수 있는 제너릭 클래스
class GenericClass <T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		a1.setName("사과");
		a1.setPrice(5000);
		
		Banana b1 = new Banana();
		b1.setName("바나나");
		b1.setPrice(3000);
		
		GenericClass <Apple> f1 = new GenericClass<>();
		f1.setT(a1);
		f1.getT().print();
		
		GenericClass <Banana> f2 = new GenericClass<>();
		f2.setT(b1);
		f2.getT().print();
		
		Pencil f3 = new Pencil();
		f3.setName("연필");
		f3.setPrice(500);
		f3.print();
		
		
	}

}
