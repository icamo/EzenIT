package package2;

public abstract class Ex04 {
	// 추상 : 완성되지 않았다.
	int num1;
	int num2;
	// 추상메서드
	/// 자식 클래스에서 상속 받은 메서드를 그대로 사용하는 것이 아니라 무조건 재정의해서 사용하는 경우
	/// 부모 클래스에 있는 메서드는 코드가 필요 하지 않게 된다.
	/// 이러한 경우 코드가 없는 메서드를 만드는데 이를 추상메서드라고 한다.
	/// 개발자 메서드명을 만드는 수고를 하지 않아도 된다.
	public abstract void add(); 
	public abstract void sub();
}
