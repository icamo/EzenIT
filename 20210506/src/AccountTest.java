import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Account> map = new HashMap<String, Account>();

		while (true) {
			System.out.println("계좌등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌출력 : 4 | 프로그램종료 : 5");
			System.out.println("해당번호를 입력해주세요.");
			String num = sc.nextLine();

			switch (num) {
			case "1":
				System.out.println("계좌등록 페이지입니다.");
				System.out.print("계좌번호를 입력하세요. : ");
				String accNum = sc.nextLine();
				System.out.print("계좌주를 입력해주세요. : ");
				String accName = sc.nextLine();
				System.out.print("입금금액을 입력해주세요. : ");
				int money = sc.nextInt(); sc.nextLine();
				Account acc = new Account(accNum, accName, money);
				map.put(accNum, acc);
				
				break;
			case "2":
				System.out.println("입금페이지입니다.");
				System.out.print("입금계좌를 입력해 주세요. : ");
				accNum = sc.nextLine();
				System.out.print("입금금액을 입력해주세요. : ");
				money = sc.nextInt(); sc.nextLine();
				acc = map.get(accNum);
				acc.setDeposit(money);
				break;
			case "3":
				System.out.println("출금페이지입니다.");
				System.out.print("출금계좌를 입력해 주세요. : ");
				accNum = sc.nextLine();
				System.out.print("출금금액을 입력해주세요. : ");
				money = sc.nextInt(); sc.nextLine();
				acc = map.get(accNum);
				acc.setWithdraw(money);
				break;
			case "4":
				System.out.println("계좌출력 페이지입니다.");
				System.out.println("계좌번호 \t 계좌주 \t 금액");
				for(String key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				break;
			case "5":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("입력값이 잘못되었습니다.");

			}
		}

	}

}
