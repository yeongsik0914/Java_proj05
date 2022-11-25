package chapter11.ex02;

class Student {
	//필드
	String name;
	
	//생성자
	Student(){}
	
	public Student(String name) {
		this.name = name;
	}

	//합계와 평균을 출력하는 메소드
	void sum_avg () {}
}

class Stduent_Sub extends Student {	
	//자식의 필드
	int kor;		//국어 점수
	int eng;		//영어 점수
	int math;		//수학 점수
	int sum = 0;	//합
	double avg;		//평균
	
	//생성자
	Stduent_Sub() {}
	
	public Stduent_Sub(String name, int kor, int eng, int math) {
		super(name);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	//부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor, eng, math의 합계와 평균을 출력하는 메소드 
	@Override
	void sum_avg () {
		sum = kor + eng + math;	
		avg = sum/3.0;
		String avg1 = String.format("%.2f", avg);
		System.out.println("|이름 : " + super.name + "| 국어 : " + kor + "| 영어 : " + eng + "| 수학 : " 
				+ math + "| 합계 : " + sum + "| 평균 : " + avg1 + "|");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		//생성자를 사용해서 객체 생성시 필드의 값을 할당하고 
		/*
		 홍길동 70 88 77
		 이순신 80 68 87
		 김똘똘 60 86 87
		 홍길순 77 56 80
		 강감찬 55 66 77
		 */
		
		int kor_sum = 0;
		int eng_sum = 0;
		int math_sum = 0;
		String kor_avg;
		String eng_avg;
		String math_avg;
		
		//업캐스팅
		Student a = new Stduent_Sub("홍길동", 70, 80, 77);
		Student b = new Stduent_Sub("이순신", 80, 68, 87);
		Student c = new Stduent_Sub("김똘똘", 60, 86, 87);
		Student d = new Stduent_Sub("홍길순", 77, 56, 80);
		Student e = new Stduent_Sub("강감찬", 55, 66, 77);
		
		//Student 배열변수 arr 변수에 모든 객체를 저장해서
		Student[] arr = new Student[] {a, b, c, d, e};
		
		
		//다운캐스팅
		Stduent_Sub a1 = (Stduent_Sub) a;
		Stduent_Sub b1 = (Stduent_Sub) b;
		Stduent_Sub c1 = (Stduent_Sub) c;
		Stduent_Sub d1 = (Stduent_Sub) d;
		Stduent_Sub e1 = (Stduent_Sub) e;
		
		//각 과목의 전체 합과 전체 평균 구하기
		kor_sum = (a1.kor + b1.kor + c1.kor + d1.kor + e1.kor);
		eng_sum = (a1.eng + b1.eng + c1.eng + d1.eng + e1.eng);
		math_sum = (a1.math + b1.math + c1.math + d1.math + e1.math);
		kor_avg = String.format("%.2f", kor_sum/5.0);
		eng_avg = String.format("%.2f", eng_sum/5.0);
		math_avg = String.format("%.2f", math_sum/5.0);
		//배열의 값을 for 문으로 출력할 때 
			//오버라이딩된 메소드 출력	<그 학생의 국어, 영어, 수학의 합계, 평균>
			//5명 학생의 국어에 대한 합계, 평균
			//5명 학생의 영어에 대한 합계, 평균
			//5명 학생의 수학에 대한 합계, 평균
		System.out.println("==================================================================");	
		for(int i=0; i<arr.length; i++) {
			arr[i].sum_avg();
			System.out.println("==================================================================");
		}
		System.out.printf("5명의 학생의 국어에 대한 합계 : %d 평균 : %s \n", kor_sum, kor_avg);
		System.out.printf("5명의 학생의 영어에 대한 합계 : %d 평균 : %s \n", eng_sum, eng_avg);
		System.out.printf("5명의 학생의 수학에 대한 합계 : %d 평균 : %s \n", math_sum, math_avg);
		
		
		
	}
	


}
