package chapter17.ex04;

import java.util.ArrayList;

//car 객체를 3개 정도 생성해서 ArrayList에 저장 후 객체를 출력시 필드의 값을 출력 하도록함.
// for, Enhanced for, 컬렉션 객체 자체를 출력시,
//완료시간 : 6시 20분까지

class Car {
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	Car(String company, String carModel, String color, int maxSpeed) {
		super();
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Car c1 = new Car("현대" , "현대차", "검은색", 200);
		Car c2 = new Car("테슬라", "테슬라차", "흰색", 400);
		Car c3 = new Car("페라리", "페라리 슈퍼카", "빨간색", 450);
		
		ArrayList <Car> a1 = new ArrayList();
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		
		//컬렉션의 내용을 순환하면서 출력
		//for
		System.out.println("=======for=============");
		for (int i=0; i<a1.size(); i++) {
			Car cc1 = a1.get(i);
			System.out.println(cc1);
		}
		System.out.println("======Enhanced For===============");
		//Enhanced For	
		for (Car k : a1) {
			System.out.println(k);
		}
		System.out.println("==============");
		//모든 컬렉션은 컬렉션 객체를 출력시 컬렉션의 들어간 값을 출력한다.
		System.out.println(a1);
		
	}

}
