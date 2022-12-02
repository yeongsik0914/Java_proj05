package chapter16.ex07;

//제너릭 클래스로 들어오는 타입을 제한 할 수 있다. , extends 키를 사용해서 제한
	// extends 키를 사용해서 제너릭 타입에 들어오는 타입을 제한을 둘 수 있다.

class A {}
class B extends A {}
class C extends B {}

class D <T extends B> {	// T타입으로 들어오는 타입을 제한을 둘 수 있다. T : B, C 타입만 올 수 있다.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}


public class BoundedTypeGenericClass {

	public static void main(String[] args) {

//		D <A> d1 = new D<>(); //오류 발생 , A 타입은 D에 들어갈 수 없다.
		D <B> d2 = new D<>(); // T : B 타입은 들어감.
		D <C> d3 = new D<>(); // T : C 타입은 들어감.
		
		D d4 = new D(); // == D<B> d4 = new D(); 
						//타입을 생략해서 호출하면 제한된 타입이 기본으로 들어감.
		
		// setter 를 사용해서 타입에 값 입력
		d2.setT(new B());	//d2는 B 타입을 정의해서 객체를 생성, setter 주입 시 B타입의 객체를 주입
		d3.setT(new C());	//d3는 C 타입을 정의해서 객체를 생성, setter 주입 시 C타입의 객체를 주입
		
//		d3.setT(new B());	//d3 C타입으로 지정되어 있다.	
							//B를 객체화 하면 A, B를 내포하고 있고 C 객체는 내포되어 있지 않다.
		d3.setT(new C());	//
		d2.setT(new C());	// C객체가 B타입으로 업캐스팅
	}

}
