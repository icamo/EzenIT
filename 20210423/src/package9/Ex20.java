package package9;

public interface Ex20 {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) { // class 일반 메서드
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해지합니다.");
		}
	}
}
