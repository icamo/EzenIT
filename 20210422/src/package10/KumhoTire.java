package package10;

public class KumhoTire extends Tire{ // 
	public KumhoTire(String location, int maxRotation) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation ++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 금호 tire 수명 " + (maxRotation - accumulatedRotation));
			return true; // return은 반환형이 없어도 함수를 강제 종료 시킬 수가 있다.
		}else {
			System.out.println(location + "금호 Tire 교체하세요");
			return false;
		}
	}
}
