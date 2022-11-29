package chapter12.ex04;

interface Animal{
	
}

interface Animal1 extends Animal{
	void cry();
}

interface Animal2 extends Animal{
	void run();
}

interface Animal3 extends Animal{
	void eat();
}

//완료 시간 : 5: 45분까지

//Cat, Tiger <== cry(), run()
//Dog, Lion  <== run(), eat()
//Eagle      <== cry(), run(), eat()

// 배열에 넣어서 오버라이딩 된 메소드 출력
	//instanceof 를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(), run()
	//instanceof 를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 eat(),. run()
	//instanceof 를 사용해서 객체 내부에 Eagle 타입이 존재하면 eat(), run(), cry()

class Cat implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	@Override
	public void run() {
		System.out.println("고양이는 달린다.");
	}
}

class Tiger implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	
	@Override
	public void run() {
		System.out.println("호랑이는 달린다.");
	}
}

class Dog implements Animal2, Animal3 {
	@Override
	public void run() {
		System.out.println("개는 달린다.");
	}
	
	@Override
	public void eat() {
		System.out.println("개는 먹는다.");
	}
}

class Lion implements Animal2, Animal3 {
	@Override
	public void run() {
		System.out.println("사자는 달린다.");
	}
	
	@Override
	public void eat() {
		System.out.println("사자는 먹는다.");
	}
}

class Eagle implements Animal1, Animal2, Animal3 {
	@Override
	public void cry() {
		System.out.println("끼요요요요.");
	}
	
	@Override
	public void eat() {
		System.out.println("독수리는 먹는다.");
	}
	
	@Override
	public void run() {
		System.out.println("독수리는 날라다닌다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		Animal c1 = new Cat();
		Animal t1 = new Tiger();
		Animal d1 = new Dog();
		Animal l1 = new Lion();
		Animal e1 = new Eagle();
		
		Animal [] arr = new Animal [] {c1, t1, d1, l1, e1};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Cat || arr[i] instanceof Tiger) {
				Animal1 aa1 = (Animal1) arr[i];
				aa1.cry();
				Animal2 aa2 = (Animal2) arr[i];
				aa2.run(); 
			}
			
			if(arr[i] instanceof Dog || arr[i] instanceof Lion) {
				Animal2 bb1 = (Animal2) arr[i];
				bb1.run();
				Animal3 bb2 = (Animal3) arr[i];
				bb2.eat();
			}
			
			if(arr[i] instanceof Eagle) {
				Animal1 cc1 = (Animal1) arr[i];
				cc1.cry();
				Animal2 cc2 = (Animal2) arr[i];
				cc2.run();
				Animal3 cc3 = (Animal3) arr[i];
				cc3.eat();
			}
			
			System.out.println();
		}
	}

}
