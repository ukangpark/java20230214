package ch15.excercise.exam0620;

import java.util.*;

public class Exam0620 {
	public static void main(String[] args) {
		List<Account>list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				String account = sc.next();
				System.out.print("계좌주: ");
				String name = sc.next();
				System.out.print("초기입금액: ");
				int money = sc.nextInt();
				System.out.println("결과: 계좌가 생성되었습니다.");
				
				Account accounts = new Account();
				accounts.setAccount(account);
				accounts.setName(name);
				accounts.setMoney(money);
				list.add(accounts);
				
				break;
			case 2:
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				for(Account totalAccounts : list ) {
					System.out.println(totalAccounts.getAccount() + totalAccounts.getName() + totalAccounts.getName());
				}
				break;
			case 3:
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				String number = sc.next();
				System.out.print("예금액: ");
				int inputMoney = sc.nextInt();
				for (Account totalAccounts : list) {
					if(totalAccounts.getAccount().equals(number)) {
						money = totalAccounts.getMoney() + inputMoney;
						totalAccounts.setMoney(money);
					}
				}
				break;
			case 4:
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				number = sc.next();
				System.out.print("출금액: ");
				int outputMoney = sc.nextInt();
				for (Account totalAccounts : list) {
					if(totalAccounts.getAccount().equals(number)) {
						money = totalAccounts.getMoney() - outputMoney;
						totalAccounts.setMoney(money);
					}
				}

			default:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	}
