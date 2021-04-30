package package3;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// 추상 클래스인 경우에는 적어도 하나 이상의 추상메서드가 있어야 한다.
	public abstract void sound();
}
