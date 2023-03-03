package ch06.excercise.exam20;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Account[] accounts = new Account[100];
		
		System.out.println(System.identityHashCode(accounts));
		
		accounts[0] = new Account();
		accounts[1] = new Account();
		
		System.out.println(System.identityHashCode(accounts[0]));
		System.out.println(System.identityHashCode(accounts[1]));
		
		accounts[0].accountName = "";
		accounts[1].accountName = "";
		
		accounts[0].accountBalance = 1;
		accounts[1].accountBalance = 4444;
		
		
		
		int[] is = new int[100];
		
		is[0] = 3;
		is[1] = 5;
		
		String[] ss = new String[9];
		
		ss[0] = "j";
		ss[1] = "ja";
		ss[2] = new String("java");
		
		
		
		int numOfAccounts = 0;
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();

			switch (select) {

			case 1:
				System.out.println("-----------");
				System.out.println("계좌생성");
				System.out.println("-----------");
				System.out.print("계좌번호: ");
				String accountNumber = sc.next();
				System.out.print("계좌주: ");
				String accountName = sc.next();
				System.out.print("초기입금금액: ");
				int accountBalance = sc.nextInt();
				
				Account account = new Account();
				account.setAccountNumber(accountNumber);
				account.setAccountName(accountName);
				account.setAccountBalance(accountBalance);
				accounts[numOfAccounts] = account;
				numOfAccounts++;
				
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;

			case 2:
				System.out.println("-----------");
				System.out.println("계좌목록");
				System.out.println("-----------");
				
				for (int i=0; i<numOfAccounts; i++) {
					System.out.printf("%s%t%s%t%d%n",accounts[i].getAccountNumber(), accounts[i].getAccountName(), accounts[i].getAccountBalance());
				}
				break;

			case 3:
				System.out.println("-----------");
				System.out.println("예금");
				System.out.println("-----------");
				System.out.print("계좌번호: ");
				accountNumber = sc.next();
				System.out.print("예금액: ");
				int add = sc.nextInt();
//				account.setAdd(add);
				
				break;

			case 4:
				System.out.println("-----------");
				System.out.println("출금");
				System.out.println("-----------");
				System.out.print("계좌번호: ");
				accountNumber = sc.next();
				System.out.print("출금액: ");
				int minus = sc.nextInt();
//				account.setMinus(minus);
				break;

			default: {
				run = false;
			}

			}

		}
		System.out.println("시스템이 종료 되었습니다.");

	}

}
