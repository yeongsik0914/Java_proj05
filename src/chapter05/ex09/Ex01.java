package chapter05.ex09;

import java.sql.SQLIntegrityConstraintViolationException;

public class Ex01 {

	public static void main(String[] args) {
		String honggildong;	// 홍길동
		String leesusin;	// 이순신
		String kimddolddol;	// 김똘똘
		String honggilsun;	// 홍길순
		int sum = 0;
		double avg;
		String check = null;
		String kor;
		String eng;
		String math;
		String science;
		int kor1;
		int eng1;
		int math1;
		int science1;
		int all_sum = 0;
		double all_avg;
		
		
		System.out.println("<출력>");
		System.out.println("\t국어\t영어\t수학\t과학\t<합계>\t<평균>");
		System.out.println("======================================================");
		
		for(int i=0; i<args.length; i++) {	// 이름 확인 포문
			check = String.valueOf(args[i]);
			sum=0;			
			if(check.equals("홍길동")) {
				honggildong = check;
				System.out.print(honggildong + "\t");
				for(int j=1; j<5; j++) {
					switch (j) {
					case 1:
						kor = args[j];
						kor1 = Integer.parseInt(kor);
						System.out.print(kor1 + "\t");
						sum += kor1;
						break;
					case 2:
						eng = args[j];
						eng1 = Integer.parseInt(eng);
						System.out.print(eng1 + "\t");
						sum += eng1;
						break;
					case 3:
						math = args[j];
						math1 = Integer.parseInt(math);
						System.out.print(math1 + "\t");
						sum += math1;
						break;
					case 4:	
						science = args[j];
						science1 = Integer.parseInt(science);
						System.out.print(science1 + "\t");
						sum += science1;
						break;
					default :
						break;
					}
				}
				avg = sum / 4.0;
				all_sum += sum;
				System.out.print(sum + "\t");
				System.out.print(avg + "\n");
			} else if(check.equals("이순신")) {
				leesusin = check;
				System.out.print(leesusin + "\t");
				for(int j=6; j<10; j++) {
					switch (j) {
					case 6:
						kor = args[j];
						kor1 = Integer.parseInt(kor);
						System.out.print(kor1 + "\t");
						sum += kor1;
						break;
					case 7:
						eng = args[j];
						eng1 = Integer.parseInt(eng);
						System.out.print(eng1 + "\t");
						sum += eng1;
						break;
					case 8:
						math = args[j];
						math1 = Integer.parseInt(math);
						System.out.print(math1 + "\t");
						sum += math1;
						break;
					case 9:	
						science = args[j];
						science1 = Integer.parseInt(science);
						System.out.print(science1 + "\t");
						sum += science1;
						break;
					default :
						break;
					}
				}
				avg = sum / 4.0;
				all_sum += sum;
				System.out.print(sum + "\t");
				System.out.print(avg + "\n");
				
			} else if(check.equals("김똘똘")) {
				kimddolddol = check;
				System.out.print(kimddolddol + "\t");
				for(int j=11; j<15; j++) {
					switch (j) {
					case 11:
						kor = args[j];
						kor1 = Integer.parseInt(kor);
						System.out.print(kor1 + "\t");
						sum += kor1;
						break;
					case 12:
						eng = args[j];
						eng1 = Integer.parseInt(eng);
						System.out.print(eng1 + "\t");
						sum += eng1;
						break;
					case 13:
						math = args[j];
						math1 = Integer.parseInt(math);
						System.out.print(math1 + "\t");
						sum += math1;
						break;
					case 14:	
						science = args[j];
						science1 = Integer.parseInt(science);
						System.out.print(science1 + "\t");
						sum += science1;
						break;
					default :
						break;
					}
				}
				avg = sum / 4.0;
				all_sum += sum;
				System.out.print(sum + "\t");
				System.out.print(avg + "\n");
			} else if(check.equals("홍길순")) {
				honggilsun = check;
				System.out.print(honggilsun + "\t");
				for(int j=16; j<20; j++) {
					switch (j) {
					case 16:
						kor = args[j];
						kor1 = Integer.parseInt(kor);
						System.out.print(kor1 + "\t");
						sum += kor1;
						break;
					case 17:
						eng = args[j];
						eng1 = Integer.parseInt(eng);
						System.out.print(eng1 + "\t");
						sum += eng1;
						break;
					case 18:
						math = args[j];
						math1 = Integer.parseInt(math);
						System.out.print(math1 + "\t");
						sum += math1;
						break;
					case 19:	
						science = args[j];
						science1 = Integer.parseInt(science);
						System.out.print(science1 + "\t");
						sum += science1;
						break;
					default :
						break;
					}
				}
				avg = sum / 4.0;
				all_sum += sum;
				System.out.print(sum + "\t");
				System.out.print(avg + "\n");
			} else {
				
			}
		}
		all_avg = all_sum / 4.0;
		System.out.println("======================================================");
		System.out.println("<전체 합계>\t" + all_sum);
		System.out.println("<전체 평균>\t" + all_avg);
	}

}
