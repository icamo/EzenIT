package package02;

public class Ex08Test {

	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		System.out.println("구구단을 출력하겠습니다.");
		try {
			/// 예외가 발생하면 반복되지 않는다.
			/// 반복되게 하려고 Ex09를 만들었음.
			ex08.gugu();
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력해 주세요.");
		}finally {
			System.out.println("다시 시작합니다.");
		}
	}

}
