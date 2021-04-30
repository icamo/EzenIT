package package5;

public class Car {
	// 멤버필드의 다형성
	Tire frontLeftTire = new HankookTire("앞왼쪽", 6);
	Tire frontRightTire = new HankookTire("앞오른쪽", 2);
	Tire backLeftTire = new KumhoTire("뒤왼쪽", 3);
	Tire backRightTire = new KumhoTire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {stop();return 1;}
		if(frontRightTire.roll() == false) {stop();return 2;}
		if(backLeftTire.roll() == false) {stop();return 3;}
		if(backRightTire.roll() == false) {stop();return 4;}
		return 0; //  교체할 타이어가 없다.
	}
	void stop() {
		System.out.println("자동차를 멈추겠습니다.");
	}
}
