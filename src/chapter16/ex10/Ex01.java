package chapter16.ex10;

//제너릭 클래스 / 제너릭 메소드를 사용해서 두 점의 좌표 값으로 넓이를 구하는 프로그램 작성

//점의 좌표를 처리하는 클래스 생성. <제너릭 클래스>
class Point <X, Y> {
	X x;
	Y y;
	
	//생성자를 사용해서 t, v의 값을 입력
	Point () {} 		//기본 생성자
	Point (X x, Y y) {		//x : x 좌표, y : y 좌표
		this.x = x;
		this.y = y;
	}
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
	//getter 만 생성
	
}

//제너릭 메소드 : 일반 클래스 내부에 제너릭 메소드
class GenericMethod {
	public static <T,V> double makeRectangle (Point<T,V> p1, Point<T,V> p2) {
		//두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌. 
		double p1L = (double) p1.getX();
		double p1R = (double) p1.getY();
		double p2L = (double) p2.getX();
		double p2R = (double) p2.getY();
		
		return (double)(p2L-p1L) * (double)(p2R-p1R); //넓이를 리턴 해주면 됨.
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		// 두 점의 좌표를 저장하는 p1, p2
		Point <Double, Double>p1 = new Point(1.0,4.0);
		Point <Double, Double>p2 = new Point(6.0,8.0);
		
		// makeRectangle (p1,p2) <== 두 점의 값을 받아서 넓이를 처리해서 리턴으로 받아옴.
		GenericMethod g1 = new GenericMethod();
		System.out.println("두 점의 넓이는 : "+ g1.makeRectangle(p1, p2));
	}

}
