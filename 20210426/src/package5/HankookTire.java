package package5;

public class HankookTire extends Tire{
	/// 부모 클래스에 생성자가 있다면 자식 클래스에 부모 클래스의 생성자를 실행할 수 
	// 있는 생성자를 만들어 주어야 한다.
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation < accumulatedRotation) {
			System.out.println(" HankookTire를 교체");
			return false;
		}else {
			System.out.println(
		" HankookTire의 수명은 : " + (maxRotation-accumulatedRotation));
			return true;
		}
	}
	
}
