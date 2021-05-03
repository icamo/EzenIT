package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {

		Map<String, Student> map = new HashMap<String, Student>();

//								     비밀번호		이름
		Student std = new Student("1234", "이숭무");
		map.put("id0001", std);
		std = new Student("2345", "이상범");
		map.put("id0002", std);
		std = new Student("3456", "이장범");
		map.put("id0003", std);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			// map에 키가 존재하는 지 여부 확인
			if (map.containsKey(id)) { // 키의 존재여부 확인 : containsKey(key)
				if (map.get(id).sno.equals(password)) {
					System.out.println("로그인 되었습니다.");
					System.out.println(map.get(id).name + "님 안녕하세요.");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}

		sc.close();

	}

}
