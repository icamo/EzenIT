package package4;
/// 모든 소스파일의 확장자는 .java이다.
/// 모든 소스파일을 compile한 바이트 코드 파일의 확장자는 .class가 된다.
/// RemoteControl
public interface Ex08 {
	//  컴파일시에 public static final이 붙는다.
	int MAX_VOLUME = 10; // 상수
	int MIN_VOLUME = 0;
	//추상 메소드 // 컴파일시 public abstract가 붙는다.
	public abstract void turnOn(); // 실행 블럭이 없는 메서드를 추상 메서드 
	void turnOff();
	void setVolume(int volume);
	// default 메서드
	default void setMute(boolean mute){
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	/* 인터페이스에서는 일반 메서드는 사용할 수 없다.
	public void add() {
		System.out.println(MAX_VOLUME - MIN_VOLUME);
	}
	*/
}
