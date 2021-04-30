package package10;

public interface Ex24 {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//정적(static) 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
