package package5;

public class Tire {
	public int maxRotation;     //최대 회전수(최대 수명)
	public int accumulatedRotation;		//누적 회전수
	public String location;       	//타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++ accumulatedRotation;
		if(maxRotation < accumulatedRotation) {
			System.out.println(" 타이어를 교체 할 때가 되었습니다.");
			return false;
		}else {
			System.out.println(
			"타이어의 수명은 : "+ (maxRotation-accumulatedRotation));
			return true;
		}
	}
	
}
