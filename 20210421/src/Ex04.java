
public class Ex04 {
	// 상수를 초기화
	static final String company;
	static final String model;
	int maxSpeed;
	/* static인 상수는 생성자를 통해서 초기화 할 수 없다.
	public Ex04(String comapny, String model) {
		// 정적 상수는 생성자를 통해서 초기화를 할 수 없다.
	}*/
	static { // 정적 상수는 static블럭을 이용해서 초기화를 할 수 있다.
		company = "기아차";
		model = "k5";
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
}
