package package6;

public class Ex12Test {

	public static void main(String[] args) {
		// 익명 객체
		Ex12 ex = new Ex12() { // 메서드를 재정의 해서 객체 생성 : 익명 객체 : 일회용
			@Override          // 반복해서 사용 못하고 필요할 때마다 정의해야 한다.
			public void add(int num1, int num2) {
				System.out.println(num1 + num2);
			}
			@Override
			public void sub(int num1, int num2) {
				System.out.println(num1 - num2);				
			}
			@Override
			public void mul(int num1, int num2) {
				System.out.println(num1 * num2);				
			}
			@Override
			public void div(int num1, int num2) {
				System.out.println(num1 / num2);
			}
		};
		ex.add(20,10);
		ex.div(20, 10);
		ex.sub(20, 10);
		ex.mul(20, 2);
		Ex12 ex1 = new Ex13();
		Ex13 ex2 = new Ex13(); // 상속 받아서 재정의한 클래스는 언제든 재 사용이 가능하다.
		ex2.add(20, 10);
		ex2.div(20, 2);
		
		
	}
}
