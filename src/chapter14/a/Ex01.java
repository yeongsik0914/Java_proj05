package chapter14.a;

//1. 예외 발생할 때 각 메소드 내부에서 예외를 직접 처리함.
class A {
	void abc() {	//bcd() 메소드 호출
		bcd();
	}
	void bcd() {	//메소드 블락에서 직접 예외 처리
		try {
			System.out.println(3/0);
			int [] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			Thread.sleep(1000);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException catch");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException catch");
		} catch (InterruptedException e) {
			System.out.println("InterruptedException catch");
		}
			 
	}
}

//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class B {
	void abc() {
		//bcd() 메소드 호출 : <예외 처리 >
		try {
			bcd();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException catch");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException catch");
		} catch (InterruptedException e) {
			System.out.println("InterruptedException catch");
		} catch (Exception e) {
			System.out.println("예외 처리됐습니다.");
		}
	}
	void bcd() throws Exception{
		System.out.println(3/0);
		int [] arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
	}
}


public class Ex01 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();
		
		System.out.println("=============");
		
		B b1 = new B();
		b1.abc();
	}

}
