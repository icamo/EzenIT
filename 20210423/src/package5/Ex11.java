package package5;

public interface Ex11 {
	int MAX_VOLUME = 10; // 상수
	int MIN_VOLUME = 0;
	
	void turnOn(); // 추상메서드 : 실행 블럭이 없는 메서드
	void turnOff();
	void setVolume(int volume);
}
/// 추상클래스와 interfase의 차이는 
/// 추상클래스는 일반 메서드를 가질 수 있다.
/// interface는  일반 메서드를 가질 수 없다.
/// interface는 추상클래스가 가질 수 없는 default메서드를 가지고 있다.
/// interface는 멤버 필드 가질 수 없다.
