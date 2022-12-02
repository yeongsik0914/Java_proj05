package chapter14.ex07;

import java.util.Scanner;

public class Account {	
	
	private long balance = 1000;		//예금의 잔고 1000
	public Account() {} //기본 생성자
	
	public long getBalance() {	//getter : 호출 시 balance 필드의 값을 리턴으로 돌려줌
		return balance;
	}
	
	//예금 :
	public void depisit(int money) {	//기존의 잔고에서 money를 인풋 받아서 더해서 다시 필드에 적용
		balance += money;
	}
	
	// 예외처리
	class BalanceException extends Exception {
		public BalanceException() {
			super();
		}
		public BalanceException(String message) {
			super(message);
		}
	}
	
	//출금 :
	public void withdrow(int money) throws BalanceException {
		//잔고가 money 보다 작은 경우 잔고 부족이라고 강제로 예외를 발생 시켜서 
			//예외 메세지 : "잔고가 부족 합니다." 라고 출력을 해주면 됨
			// BalanceException <== 사용자 정의 예외를 생성해서
		if(money>balance) {
			throw new BalanceException("현재 예금예금 잔고가 부족합니다. \n"
					+ "현재 잔액 : " + balance + "\n"
					+ "출금할 금액 : " + money);
		} else {
			depisit(-money);
			System.out.println("출금된 금액 : " + money + "\n"
					+ "남은 잔액 : " + balance);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		System.out.println("출금할 금액을 입력하세요 >>");
		try {
			a1.withdrow(sc.nextInt());
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
