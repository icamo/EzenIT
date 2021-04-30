package package5;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		while(true) {
			int tireChange = car.run(); // tire위치 번호
			switch(tireChange) {
			case 1:
				System.out.println("앞 왼쪽 타이어를 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 타이어를 교체");
				car.frontRightTire = new HankookTire("앞 오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 타이어를 교체");
				car.backLeftTire = new KumhoTire("뒤 왼쪽" , 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽  타이어를 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽" , 12);
				break;			
			}
			if (tireChange != 0) break;
		}
	}
}