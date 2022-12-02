package chapter13.ex09;

interface Car {
	void run();
	void stop();
	void start();
}

class CarPlay{
	void abc(Car c1) {
		c1.run();
		c1.start();
		c1.stop();
	}
}
public class Ex01 {

	public static void main(String[] args) {
		CarPlay cp = new CarPlay();
		
		cp.abc(new Car() {
			@Override
			public void run() {
				System.out.println("자동차는 달린다.");
			}
			@Override
			public void start() {
				System.out.println("자동차는 출발한다.");
			}
			@Override
			public void stop() {
				System.out.println("자동차는 멈춘다.");
			}
		});
	}

}
