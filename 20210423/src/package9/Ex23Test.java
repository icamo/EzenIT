package package9;

public class Ex23Test {
	public static void main(String[] args) {
		Ex20 ex = new Ex21();
		ex.turnOn();
		ex.setVolume(5);
		ex.setMute(true);
		ex.setMute(false); // default 메서드 재정의
		ex.turnOn();
		ex = new Ex22(); // 다형성
		ex.turnOn();
		ex.setVolume(8);
		ex.setMute(true);
		ex.setMute(false); // default메서드 재정의하지 않았음.
		ex.turnOff();
	}

}
