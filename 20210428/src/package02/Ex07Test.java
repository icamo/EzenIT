package package02;

public class Ex07Test {

	public static void main(String[] args) {
		Ex07 ex = new Ex07();
		try {
			ex.div();
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("idx를 1을 초과할 수 없습니다.");
		}catch(ArithmeticException e) {
			System.out.println("분모가 0이면 안됩니다.");
		}catch(Exception e) {
			e.printStackTrace();// 예외처리가 되었을 때 어떤 오류인지 출력해줌.
		}finally {
			System.out.println("다시 시작합니다.");
		}
	}
}
