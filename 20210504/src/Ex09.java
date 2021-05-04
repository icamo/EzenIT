import java.util.*;

public class Ex09 {

	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<String, Student>();
		Student std = new Student("123456", "일숭무");
		map.put("user001", std);
		std = new Student("456789", "이숭무");
		map.put("user002", std);
		std = new Student("789123", "삼숭무");
		map.put("user003", std);
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력해주세요. ");
			String userId = sc.nextLine();
			// 키와 입력받은 id가 일치하는 지 여부 확인
			//System.out.println(map.containsKey(userId));
			if(map.containsKey(userId)) {
				System.out.println("비밀번호를 입력해주세요");
				String pwd = sc.nextLine();
				if(map.get(userId).userPw.equals(pwd)) {
					System.out.println("로그인에 성공하였습니다.");
					System.out.println(map.get(userId).userName + "님 안녕하세요");	
					break;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}	
			}
			else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
		
		sc.close();
	}

}
