package package10;

public class Tire {
	public int maxRotation; 
	public int accumulatedRotation;
	public String location; // 앞왼 앞오 뒤왼 뒤오
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	public boolean roll() {
		accumulatedRotation ++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " tire 수명 " + (maxRotation - accumulatedRotation));
			return true; // return은 반환형이 없어도 함수를 강제 종료 시킬 수가 있다.
		}else {
			System.out.println(location + "Tire 교체하세요");
			return false;
		}
	}	
}