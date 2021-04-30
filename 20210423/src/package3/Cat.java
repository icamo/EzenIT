package package3;

// class 에서 class를 상속 받을 때는 extends(확장)
public class Cat extends Animal{
	public Cat() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
