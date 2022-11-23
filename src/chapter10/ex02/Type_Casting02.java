package chapter10.ex02;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Type_Casting02 {

	public static void main(String[] args) {
		//1. 업캐스팅 (자동으로 변환) : 생략 시 컴파일러가 자동으로 추가, 자식 클래스 객체 생성 ==> 타입을 부모로 지정
		// ac : A, B, C를 모두 내포하고 있고 A 타입으로 정의
		A ac = new C();
			System.out.println(ac instanceof A);
			System.out.println(ac instanceof B);
			System.out.println(ac instanceof C);
			System.out.println(ac instanceof D); // flase
	
		//bc : A, B, C 를 모두 내포하고 있고 N 타입으로 정의, <<A, B 접근 가능 >>
		B bc = new C();	
		System.out.println(bc instanceof A);
		System.out.println(bc instanceof B);
		System.out.println(bc instanceof C);
		System.out.println(bc instanceof D);	//false
		
		//bc는 B 타입으로 정의 A 타입으로 업캐스팅
		A a = bc;
		
		//2. 다운 캐스팅 (수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않는다. 실행시 예외가 발생
		//aa는 A만 내포하고 있다.
		A aa = new A();
			System.out.println(aa instanceof A);
			System.out.println(aa instanceof B);
			System.out.println(aa instanceof C);
			System.out.println(aa instanceof D);
		if (aa instanceof B) {
		B ba = (B) aa; 	//실행 전 : 오류 없음, 실행 후 : 오류 발생	
		} else {
			System.out.println("aa는 B를 내포하고 있지 않아서 다운캐스팅이 불가 합니다.");
		}
		
		if (aa instanceof C) {
			C ca = (C) aa; 	//실행 전 : 오류 없음, 실행 후 : 오류 발생	
			} else {
				System.out.println("aa는 C를 내포하고 있지 않아서 다운캐스팅이 불가 합니다.");
		}
		
		System.out.println("================================");
		
		//bd: A, B , D를 내포하고 있고 B타입으로 지정 <A,B>
		//
		B bd = new D();
			System.out.println(bd instanceof A);
			System.out.println(bd instanceof B);
			System.out.println(bd instanceof C); //false
			System.out.println(bd instanceof D);
	}
	

}
