package package01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();

		while (true) {
			System.out.println("계좌등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌 정보 : 4 | 프로그램 종료 : 5");
			System.out.print("해당 번호를 입력하시오");

			int num;

			try {
				num = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자만 입력해주세요");
				continue;
			}

			switch (num) {
			case 1:
				System.out.println("계좌등록화면입니다.");
				System.out.print("계좌번호를 입력해주세요 : ");

				int accNum;
				int money;
				String accName;

				try {
					accNum = sc.nextInt();
					System.out.print("입금금액을 입력해주세요 : ");
					money = sc.nextInt();
					sc.nextLine();
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("숫자만 입력해주세요");
					break;
				}
				System.out.print("계좌주의 성함을 입력해주세요 : ");
				accName = sc.nextLine();
				Account acc = new Account(accNum, money, accName);
				map.put(accNum, acc);
				break;
			case 2:
				System.out.println("입금화면입니다.");
				System.out.print("입금계좌를 입력해주세요 : ");
				try {
					accNum = sc.nextInt();
					sc.nextLine();
					if (map.containsKey(accNum)) {
						System.out.println("입금금액을 입력해주세요.");
						money = sc.nextInt();
						sc.nextLine();
						acc = map.get(accNum);
						acc.setDeposit(money);
					} else {
						System.out.println("계좌가 존재하지 않습니다.");
					}

				} catch (Exception e) {
					System.out.println("숫자만 입력해주세요.");
					break;
				}
				break;
			case 3:
				System.out.println("출금화면입니다.");
				System.out.print("출금계좌를 입력해주세요 : ");
				try {
					accNum = sc.nextInt();
					sc.nextLine();
					if (map.containsKey(accNum)) {
						System.out.println("출금금액을 입력해주세요.");
						money = sc.nextInt();
						sc.nextLine();
						acc = map.get(accNum);
						acc.setWithdraw(money);
					} else {
						System.out.println("계좌가 존재하지 않습니다.");
					}
				} catch (Exception e) {
					System.out.println("숫자만 입력해주세요.");
					break;
				}
				break;
			case 4:
				System.out.println("계좌정보 화면입니다.");
				System.out.println("계좌번호 \t 계좌주 \t 입금액");
				for (Integer key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

		}

	}

}
