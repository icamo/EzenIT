package package5;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation < accumulatedRotation) {
			System.out.println(" KumhoTire를 교체");
			return false;
		}else {
			System.out.println(
		" KumhoTire의 수명은 : " + (maxRotation-accumulatedRotation));
			return true;
		}
	}
}
