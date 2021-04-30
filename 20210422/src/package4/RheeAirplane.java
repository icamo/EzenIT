package package4;

public class RheeAirplane extends Airplane {
	// 상수는 일반적으로 이름을 대문자로 한다.
	static final int NORMAL = 1; // 일반 비행
	static final int SUPERSONIC = 2; // 초음속 비행
	
	int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		}else {
			super.fly(); // 부모 클래스에 있는 메서드 실행
		}
	}
	
	
}
