package package2;

// 추상 클래스를 상속 받았으므로 메서드를   재정의해서 사용해야 한다.
public class Ex05 extends Ex04{
	/// 자식 클래스에서 상속 받은 메서드들을 재정의 한다면 굳이 상속 받을 이유가 있을까요? 
	/// 메서드명을 한 클래스에서만 사용하는 것이 아니라 여러 클래스 동일한 이름의 메서드를 사용하고 싶다.
	@Override
	public void add() {  
		System.out.println(num2 - num1);
	}
	@Override
	public void sub() {
		System.out.println(num2 - num1);
	}
	public void mul() {
		System.out.println(num2 * num1);
	}
	public void div() {
		System.out.println(num2 / num1);
	}
}
