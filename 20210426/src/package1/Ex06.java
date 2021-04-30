package package1;

public abstract class Ex06 {// 추상 클래스
	int num1 ;
	int num2 ;
	public void mul() {
		System.out.println(num1 * num2);
	}
	public abstract void div();// 실행 블럭이 정의 되어 있지 않은 메서드 : 추상메서드
	// 추상메서드를 만드는 이유는 자식 클래스에서 재정의를 해서 사용하기 때문 
}
